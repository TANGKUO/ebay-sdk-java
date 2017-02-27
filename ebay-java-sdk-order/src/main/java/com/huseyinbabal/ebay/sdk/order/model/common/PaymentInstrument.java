package com.huseyinbabal.ebay.sdk.order.model.common;

public class PaymentInstrument {
    private PaymentInstrumentReference paymentInstrumentReference;
    private PaymentMethodBrand paymentMethodBrand;
    private String paymentMethodType;

    public PaymentInstrumentReference getPaymentInstrumentReference() {
        return paymentInstrumentReference;
    }

    public void setPaymentInstrumentReference(PaymentInstrumentReference paymentInstrumentReference) {
        this.paymentInstrumentReference = paymentInstrumentReference;
    }

    public PaymentMethodBrand getPaymentMethodBrand() {
        return paymentMethodBrand;
    }

    public void setPaymentMethodBrand(PaymentMethodBrand paymentMethodBrand) {
        this.paymentMethodBrand = paymentMethodBrand;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }
}
