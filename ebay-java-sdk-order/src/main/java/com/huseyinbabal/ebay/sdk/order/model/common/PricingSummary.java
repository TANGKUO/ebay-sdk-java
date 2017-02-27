package com.huseyinbabal.ebay.sdk.order.model.common;

public class PricingSummary {
    private Adjustment adjustment;
    private Price deliveryCost;
    private Price deliveryDiscount;
    private Price fee;
    private Price priceDiscount;
    private Price priceSubTotal;
    private Price tax;
    private Price total;

    public Adjustment getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(Adjustment adjustment) {
        this.adjustment = adjustment;
    }

    public Price getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(Price deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public Price getDeliveryDiscount() {
        return deliveryDiscount;
    }

    public void setDeliveryDiscount(Price deliveryDiscount) {
        this.deliveryDiscount = deliveryDiscount;
    }

    public Price getFee() {
        return fee;
    }

    public void setFee(Price fee) {
        this.fee = fee;
    }

    public Price getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Price priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Price getPriceSubTotal() {
        return priceSubTotal;
    }

    public void setPriceSubTotal(Price priceSubTotal) {
        this.priceSubTotal = priceSubTotal;
    }

    public Price getTax() {
        return tax;
    }

    public void setTax(Price tax) {
        this.tax = tax;
    }

    public Price getTotal() {
        return total;
    }

    public void setTotal(Price total) {
        this.total = total;
    }
}
