package com.huseyinbabal.ebay.sdk.order.model.request;

import com.huseyinbabal.ebay.sdk.order.model.common.PaymentInfo;

public class UpdatePaymentInfoRequest {

    private PaymentInfo creditCard;

    public PaymentInfo getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(PaymentInfo creditCard) {
        this.creditCard = creditCard;
    }
}
