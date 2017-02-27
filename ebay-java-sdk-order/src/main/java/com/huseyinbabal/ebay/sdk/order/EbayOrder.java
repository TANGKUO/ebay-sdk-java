package com.huseyinbabal.ebay.sdk.order;

import com.huseyinbabal.ebay.sdk.order.model.request.InitiateCheckoutSessionRequest;
import com.huseyinbabal.ebay.sdk.order.model.request.UpdateLineItemQuantityRequest;
import com.huseyinbabal.ebay.sdk.order.model.request.UpdatePaymentInfoRequest;
import com.huseyinbabal.ebay.sdk.order.model.request.UpdateShippingAddressRequest;
import com.huseyinbabal.ebay.sdk.order.model.response.CheckoutSessionResponse;
import com.huseyinbabal.ebay.sdk.order.model.response.OrderResponse;

public interface EbayOrder {
    CheckoutSessionResponse getCheckoutSession(String checkoutSessionId);
    CheckoutSessionResponse initiateCheckoutSession(InitiateCheckoutSessionRequest initiateCheckoutSessionRequest);
    CheckoutSessionResponse updateShippingAddress(UpdateShippingAddressRequest updateShippingAddressRequest);
    CheckoutSessionResponse updatePaymentInfo(String checkoutSessionId, UpdatePaymentInfoRequest updatePaymentInfoRequest);
    CheckoutSessionResponse updateLineItemQuantity(UpdateLineItemQuantityRequest updateLineItemQuantityRequest);
    OrderResponse placeOrder(String checkoutSessionId);
}
