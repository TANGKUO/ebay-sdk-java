package com.huseyinbabal.ebay.core.error;

import java.util.ArrayList;
import java.util.List;

public class EbayErrors {

    private List<EbayError> errors = new ArrayList<>();

    public List<EbayError> getErrors() {
        return errors;
    }

    public void setErrors(List<EbayError> errors) {
        this.errors = errors;
    }
}
