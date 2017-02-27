package com.huseyinbabal.ebay.sdk.order.model.request;

public class UpdateLineItemQuantityRequest {

    private Integer quantity;
    private String itemId;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
