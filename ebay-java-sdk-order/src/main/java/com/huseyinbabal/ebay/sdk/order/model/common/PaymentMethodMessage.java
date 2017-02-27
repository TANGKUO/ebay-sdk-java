package com.huseyinbabal.ebay.sdk.order.model.common;

public class PaymentMethodMessage {

    private String legalMessage;
    private Boolean requiredForUserConfirmation;

    public String getLegalMessage() {
        return legalMessage;
    }

    public void setLegalMessage(String legalMessage) {
        this.legalMessage = legalMessage;
    }

    public Boolean getRequiredForUserConfirmation() {
        return requiredForUserConfirmation;
    }

    public void setRequiredForUserConfirmation(Boolean requiredForUserConfirmation) {
        this.requiredForUserConfirmation = requiredForUserConfirmation;
    }
}
