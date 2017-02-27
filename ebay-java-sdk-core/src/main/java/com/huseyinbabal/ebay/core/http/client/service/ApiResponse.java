package com.huseyinbabal.ebay.core.http.client.service;

import com.huseyinbabal.ebay.core.error.EbayError;

import java.util.ArrayList;
import java.util.List;

public class ApiResponse {

    private List<EbayError> errors = new ArrayList<>();

    public List<EbayError> getErrors() {
        return errors;
    }

    public void setErrors(List<EbayError> errors) {
        this.errors = errors;
    }
}
