package com.huseyinbabal.ebay.sdk.order.model.constant;

public enum EbayOrderEnum {

    CHECKOUT_SESSION_ID("checkoutSessionId");

    private String value;

    EbayOrderEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
