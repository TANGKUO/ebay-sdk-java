package com.huseyinbabal.ebay.sdk.order.model.constant;

import com.huseyinbabal.ebay.core.http.client.constant.RequestMethod;
import com.huseyinbabal.ebay.core.http.client.service.ApiAction;
import com.huseyinbabal.ebay.sdk.order.model.response.CheckoutSessionResponse;
import com.huseyinbabal.ebay.sdk.order.model.response.OrderResponse;

public enum EbayOrderApiAction implements ApiAction {

    INITIATE_CHECKOUT_SESSION("/buy/order/v1/checkout_session/initiate", RequestMethod.POST, CheckoutSessionResponse.class),
    GET_CHECKOUT_SESSION("/buy/order/v1/checkout_session/%s", RequestMethod.GET, CheckoutSessionResponse.class),
    UPDATE_SHIPPING_ADDRESS("/buy/order/v1/checkout_session/%s/update_shipping_address", RequestMethod.POST, CheckoutSessionResponse.class),
    UPDATE_PAYMENT_INFO("/buy/order/v1/checkout_session/%s/update_payment_info", RequestMethod.POST, CheckoutSessionResponse.class),
    UPDATE_LINE_ITEM_QUANTITY("/buy/order/v1/checkout_session/%s/update_quantity", RequestMethod.POST, CheckoutSessionResponse.class),
    PLACE_ORDER("/buy/order/v1/checkout_session/%s/place_order", RequestMethod.POST, OrderResponse.class);

    private String path;
    private RequestMethod requestMethod;
    private Class<?> clazz;

    EbayOrderApiAction(String path, RequestMethod requestMethod, Class<?> clazz) {
        this.path = path;
        this.requestMethod = requestMethod;
        this.clazz = clazz;
    }

    public String getPath() {
        return path;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
