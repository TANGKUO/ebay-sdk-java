package com.huseyinbabal.ebay.sdk.order.model.common;

public class PaymentMethodBrand {

    private Image logoImage;
    private String paymentMethodBrandType;

    public Image getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(Image logoImage) {
        this.logoImage = logoImage;
    }

    public String getPaymentMethodBrandType() {
        return paymentMethodBrandType;
    }

    public void setPaymentMethodBrandType(String paymentMethodBrandType) {
        this.paymentMethodBrandType = paymentMethodBrandType;
    }
}
