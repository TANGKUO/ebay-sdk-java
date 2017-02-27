package com.huseyinbabal.ebay.sdk.order;

import com.huseyinbabal.ebay.core.EbayClient;
import com.huseyinbabal.ebay.core.http.client.service.ApiRequest;
import com.huseyinbabal.ebay.sdk.order.model.constant.EbayOrderApiAction;
import com.huseyinbabal.ebay.sdk.order.model.request.InitiateCheckoutSessionRequest;
import com.huseyinbabal.ebay.sdk.order.model.request.UpdateLineItemQuantityRequest;
import com.huseyinbabal.ebay.sdk.order.model.request.UpdatePaymentInfoRequest;
import com.huseyinbabal.ebay.sdk.order.model.request.UpdateShippingAddressRequest;
import com.huseyinbabal.ebay.sdk.order.model.response.CheckoutSessionResponse;
import com.huseyinbabal.ebay.sdk.order.model.response.OrderResponse;

public class EbayOrderClient extends EbayClient implements EbayOrder {

    public EbayOrderClient(String authToken) {
        super(authToken);
    }

    @Override
    public CheckoutSessionResponse getCheckoutSession(String checkoutSessionId) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setApiAction(EbayOrderApiAction.GET_CHECKOUT_SESSION);
        apiRequest.setPathParams(new Object[]{checkoutSessionId});
        return perform(apiRequest);
    }

    @Override
    public CheckoutSessionResponse initiateCheckoutSession(InitiateCheckoutSessionRequest initiateCheckoutSessionRequest) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setApiAction(EbayOrderApiAction.INITIATE_CHECKOUT_SESSION);
        apiRequest.setData(initiateCheckoutSessionRequest);
        return perform(apiRequest);
    }

    @Override
    public CheckoutSessionResponse updateShippingAddress(UpdateShippingAddressRequest updateShippingAddressRequest) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setApiAction(EbayOrderApiAction.UPDATE_SHIPPING_ADDRESS);
        apiRequest.setData(updateShippingAddressRequest);
        return perform(apiRequest);
    }

    @Override
    public CheckoutSessionResponse updatePaymentInfo(String checkoutSessionId, UpdatePaymentInfoRequest updatePaymentInfoRequest) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setApiAction(EbayOrderApiAction.UPDATE_PAYMENT_INFO);
        apiRequest.setData(updatePaymentInfoRequest);
        apiRequest.setPathParams(new Object[]{checkoutSessionId});
        return perform(apiRequest);
    }

    @Override
    public CheckoutSessionResponse updateLineItemQuantity(UpdateLineItemQuantityRequest updateLineItemQuantityRequest) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setApiAction(EbayOrderApiAction.UPDATE_LINE_ITEM_QUANTITY);
        apiRequest.setData(updateLineItemQuantityRequest);
        return perform(apiRequest);
    }

    @Override
    public OrderResponse placeOrder(String checkoutSessionId) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setApiAction(EbayOrderApiAction.PLACE_ORDER);
        apiRequest.setPathParams(new Object[]{checkoutSessionId});
        return perform(apiRequest);
    }
}
