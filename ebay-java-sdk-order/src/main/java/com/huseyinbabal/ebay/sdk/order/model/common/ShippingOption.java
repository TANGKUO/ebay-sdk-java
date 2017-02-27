package com.huseyinbabal.ebay.sdk.order.model.common;

public class ShippingOption {

    private Price baseDeliveryCost;
    private Price deliveryDiscount;
    private String maxEstimatedDeliveryDate;
    private String minEstimatedDeliveryDate;
    private Boolean selected;
    private String shippingCarrierName;
    private String shippingOptionId;
    private String shippingServiceName;

    public Price getBaseDeliveryCost() {
        return baseDeliveryCost;
    }

    public void setBaseDeliveryCost(Price baseDeliveryCost) {
        this.baseDeliveryCost = baseDeliveryCost;
    }

    public Price getDeliveryDiscount() {
        return deliveryDiscount;
    }

    public void setDeliveryDiscount(Price deliveryDiscount) {
        this.deliveryDiscount = deliveryDiscount;
    }

    public String getMaxEstimatedDeliveryDate() {
        return maxEstimatedDeliveryDate;
    }

    public void setMaxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
        this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
    }

    public String getMinEstimatedDeliveryDate() {
        return minEstimatedDeliveryDate;
    }

    public void setMinEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
        this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getShippingCarrierName() {
        return shippingCarrierName;
    }

    public void setShippingCarrierName(String shippingCarrierName) {
        this.shippingCarrierName = shippingCarrierName;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    public String getShippingServiceName() {
        return shippingServiceName;
    }

    public void setShippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
    }
}
