package com.huseyinbabal.ebay.sdk.order.model.request;

import com.huseyinbabal.ebay.core.model.Address;
import com.huseyinbabal.ebay.core.model.CreditCard;
import com.huseyinbabal.ebay.core.model.LineItemInput;

import java.util.ArrayList;
import java.util.List;

public class InitiateCheckoutSessionRequest {
    private CreditCard creditCard;
    private Address shippingAddress;
    private List<LineItemInput> lineItemInputs = new ArrayList<>();

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<LineItemInput> getLineItemInputs() {
        return lineItemInputs;
    }

    public void setLineItemInputs(List<LineItemInput> lineItemInputs) {
        this.lineItemInputs = lineItemInputs;
    }
}
