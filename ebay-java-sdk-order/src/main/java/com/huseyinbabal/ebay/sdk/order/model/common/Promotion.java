package com.huseyinbabal.ebay.sdk.order.model.common;

public class Promotion {

    private Price discount;
    private String message;
    private String promotionCode;
    private String getPromotionType;

    public Price getDiscount() {
        return discount;
    }

    public void setDiscount(Price discount) {
        this.discount = discount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getGetPromotionType() {
        return getPromotionType;
    }

    public void setGetPromotionType(String getPromotionType) {
        this.getPromotionType = getPromotionType;
    }
}
