package com.huseyinbabal.ebay.core.http.client.service;

import com.huseyinbabal.ebay.core.http.client.constant.RequestMethod;

public interface ApiAction {
    public String getPath();
    public RequestMethod getRequestMethod();
    public <T extends ApiResponse> Class<T> getClazz();
}
