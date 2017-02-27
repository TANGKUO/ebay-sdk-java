package com.huseyinbabal.ebay.core;

import com.google.gson.Gson;
import com.huseyinbabal.ebay.core.http.client.constant.RequestHeader;
import com.huseyinbabal.ebay.core.http.client.constant.RequestMethod;
import com.huseyinbabal.ebay.core.http.client.service.ApiRequest;
import com.huseyinbabal.ebay.core.http.client.service.ApiResponse;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.logging.Logger;

import static org.apache.commons.lang3.CharEncoding.UTF_8;

public abstract class EbayClient {

    private final static Logger logger = Logger.getLogger(EbayClient.class.getName());

    protected CloseableHttpClient httpClient;
    protected String authToken;
    protected String apiHost = "api.sandbox.ebay.com";

    private Gson gson;

    public EbayClient(String authToken) {
        setAuthToken(authToken);
        initialize();
    }

    public EbayClient(String authToken, String apiHost) {
        setAuthToken(authToken);
        setApiHost(apiHost);
        initialize();
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getApiHost() {
        return apiHost;
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public <T extends ApiResponse> T perform(ApiRequest apiRequest) {
        URI uri = createUri(apiRequest);
        String response = "";
        if (RequestMethod.GET == apiRequest.getApiAction().getRequestMethod()) {
            response = doGet(uri);
        } else if (RequestMethod.POST == apiRequest.getApiAction().getRequestMethod()) {
            response = doPost(uri, createRequestBody(apiRequest));
        }

        return processResponse(response, apiRequest.getApiAction().getClazz());
    }

    private HttpEntity createRequestBody(ApiRequest apiRequest) {
        StringEntity data = null;
        if (apiRequest.getData() != null) {
            String inputData = gson.toJson(apiRequest.getData());
            try {
                data = new StringEntity(inputData);
            } catch (UnsupportedEncodingException ex) {
                logger.severe(String.format("Error occurred while creating http entity. %s", ex.getMessage()));
            }
        }
        return data;
    }

    private String doGet(URI uri) {
        HttpGet httpGet = new HttpGet(uri);
        httpGet.setHeaders(getHeaders());
        return doExecute(httpGet);
    }

    private String doPost(URI uri, HttpEntity httpEntity) {
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeaders(getHeaders());
        if (httpEntity != null) {
            httpPost.setEntity(httpEntity);
        }
        return doExecute(httpPost);
    }

    private URI createUri(ApiRequest request) {
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost(apiHost);
        uriBuilder.setPath(createPath(request));

        if (request.getQueryParams() != null) {
            for (Map.Entry<String, String> entry : request.getQueryParams().entrySet()) {
                uriBuilder.setParameter(entry.getKey(), entry.getValue());
            }
        }

        URI uri = null;
        try {
            uri = uriBuilder.build();
        } catch (URISyntaxException ex) {
            logger.severe(String.format("Create URI failed. %s", ex.getMessage()));
        }

        return uri;
    }

    private String createPath(ApiRequest request) {
        String path = request.getApiAction().getPath();
        return request.getPathParams() == null? path: String.format(path, request.getPathParams());
    }

    private String doExecute(HttpUriRequest httpUriRequest) {
        String response = "";
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpUriRequest);
            response = EntityUtils.toString(httpResponse.getEntity(), UTF_8);
        } catch (IOException ex) {
            logger.severe(String.format("Erro occured while calling eBay API: %s", ex.getMessage()));
        } finally {
            if (httpResponse != null) {
                try {
                    httpResponse.close();
                } catch (IOException ex) {
                    logger.severe(String.format("Error occurred while closing response. ", ex));
                }
            }
        }
        return response;
    }

    private Header[] getHeaders() {
        return new BasicHeader[]{
                new BasicHeader(RequestHeader.HEADER_ACCEPT, RequestHeader.CONTENT_TYPE_JSON),
                new BasicHeader(RequestHeader.HEADER_CONTENT_TYPE, RequestHeader.CONTENT_TYPE_JSON),
                new BasicHeader(RequestHeader.HEADER_AUTHORIZATION, String.format("Bearer %s", this.authToken)),
        };
    }

    private void initialize() {
        gson = new Gson();
        httpClient = HttpClients.createDefault();
    }

    private <T extends ApiResponse> T processResponse(String response, Class<T> tClass) {
        /*Map responseMap = gson.fromJson(response, Map.class);
        if (responseMap.containsKey("errors")) {
            EbayErrors ebayErrors = gson.fromJson(response, EbayErrors.class);
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setErrors(ebayErrors);
            return (T) apiResponse;
        }*/
        return gson.fromJson(response, tClass);

    }
}
