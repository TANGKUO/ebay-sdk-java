package com.huseyinbabal.ebay.core.model;

public enum Brand {
    VISA("VISA"),
    MASTERCARD("MASTERCARD");

    private String value;

    Brand(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
