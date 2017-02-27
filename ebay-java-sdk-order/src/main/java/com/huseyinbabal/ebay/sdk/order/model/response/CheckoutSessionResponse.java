package com.huseyinbabal.ebay.sdk.order.model.response;

import com.huseyinbabal.ebay.core.http.client.service.ApiResponse;
import com.huseyinbabal.ebay.core.model.Address;
import com.huseyinbabal.ebay.sdk.order.model.common.*;

import java.util.ArrayList;
import java.util.List;

public class CheckoutSessionResponse extends ApiResponse {

    private List<PaymentMethod> acceptedPaymentMethods = new ArrayList<>();
    private String checkoutSessionId;
    private String expirationDate;
    private List<LineItem> lineItems = new ArrayList<>();
    private PricingSummary pricingSummary;
    private PaymentInstrument providedPaymentInstrument;
    private Address shippingAddress;
    private List<Warning> warnings = new ArrayList<>();

    public List<PaymentMethod> getAcceptedPaymentMethods() {
        return acceptedPaymentMethods;
    }

    public void setAcceptedPaymentMethods(List<PaymentMethod> acceptedPaymentMethods) {
        this.acceptedPaymentMethods = acceptedPaymentMethods;
    }

    public String getCheckoutSessionId() {
        return checkoutSessionId;
    }

    public void setCheckoutSessionId(String checkoutSessionId) {
        this.checkoutSessionId = checkoutSessionId;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public PricingSummary getPricingSummary() {
        return pricingSummary;
    }

    public void setPricingSummary(PricingSummary pricingSummary) {
        this.pricingSummary = pricingSummary;
    }

    public PaymentInstrument getProvidedPaymentInstrument() {
        return providedPaymentInstrument;
    }

    public void setProvidedPaymentInstrument(PaymentInstrument providedPaymentInstrument) {
        this.providedPaymentInstrument = providedPaymentInstrument;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<Warning> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }
}
