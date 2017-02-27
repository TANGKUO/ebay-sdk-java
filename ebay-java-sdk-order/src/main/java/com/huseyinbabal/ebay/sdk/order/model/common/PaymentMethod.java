package com.huseyinbabal.ebay.sdk.order.model.common;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethod {

    private String label;
    private Image logoImage;
    private List<PaymentMethodBrand> paymentMethodBrands = new ArrayList<>();
    private List<PaymentMethodMessage> paymentMethodMessages = new ArrayList<>();
    private String paymentMethodType;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Image getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(Image logoImage) {
        this.logoImage = logoImage;
    }

    public List<PaymentMethodBrand> getPaymentMethodBrands() {
        return paymentMethodBrands;
    }

    public void setPaymentMethodBrands(List<PaymentMethodBrand> paymentMethodBrands) {
        this.paymentMethodBrands = paymentMethodBrands;
    }

    public List<PaymentMethodMessage> getPaymentMethodMessages() {
        return paymentMethodMessages;
    }

    public void setPaymentMethodMessages(List<PaymentMethodMessage> paymentMethodMessages) {
        this.paymentMethodMessages = paymentMethodMessages;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }
}
