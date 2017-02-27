package com.huseyinbabal.ebay.sdk.order.model.response;

import com.huseyinbabal.ebay.core.http.client.service.ApiResponse;
import com.huseyinbabal.ebay.sdk.order.model.common.Warning;

import java.util.ArrayList;
import java.util.List;

public class OrderResponse extends ApiResponse {

    private String purchaseOrderHref;
    private String purchaseOrderId;
    private String purchaseOrderPaymentStatus;
    private List<Warning> warnings = new ArrayList<>();

    public String getPurchaseOrderHref() {
        return purchaseOrderHref;
    }

    public void setPurchaseOrderHref(String purchaseOrderHref) {
        this.purchaseOrderHref = purchaseOrderHref;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderPaymentStatus() {
        return purchaseOrderPaymentStatus;
    }

    public void setPurchaseOrderPaymentStatus(String purchaseOrderPaymentStatus) {
        this.purchaseOrderPaymentStatus = purchaseOrderPaymentStatus;
    }

    public List<Warning> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }
}
