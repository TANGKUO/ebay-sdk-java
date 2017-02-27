package com.huseyinbabal.ebay.core.http.client.service;

import java.util.Map;

public class ApiRequest {
    private ApiAction apiAction;
    private Object data;
    private Object[] pathParams;
    private Map<String, String> queryParams;

    public ApiRequest() {
    }

    public ApiAction getApiAction() {
        return apiAction;
    }

    public void setApiAction(ApiAction apiAction) {
        this.apiAction = apiAction;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object[] getPathParams() {
        return pathParams;
    }

    public void setPathParams(Object[] pathParams) {
        this.pathParams = pathParams;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(Map<String, String> queryParams) {
        this.queryParams = queryParams;
    }
}
