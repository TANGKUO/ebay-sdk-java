package com.huseyinbabal.ebay.sdk.order.model.common;

public class Adjustment {
    private Price amount;
    private String label;

    public Price getAmount() {
        return amount;
    }

    public void setAmount(Price amount) {
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
