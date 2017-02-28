# eBay Java SDK

This is multi module Java SDK for eBay APIs. Currently, only core and order module are developed, any contribution on other modules will be very welcomed.

[![](https://jitpack.io/v/gittigidiyor/ebay-sdk-java.svg)](https://jitpack.io/#gittigidiyor/ebay-sdk-java)

## Order SDK

In this module, you can perform calls to Order APIs described [here](http://developer.ebay.com/Devzone/rest/api-ref/order/index.html)

### Initiate Checkout

In order to call initiate checkout endpoint, you need to get an auth token first. Please refer [here](http://developer.ebay.com/DevZone/XML/docs/HowTo/Tokens/GettingTokens.html#step2) for details.

```java
EbayOrder ebayOrder = new EbayOrderClient("<your_auth_token>");
InitiateCheckoutSessionRequest initiateCheckoutSessionRequest = new InitiateCheckoutSessionRequest();

Address shippingAddress = new Address();
shippingAddress.setAddressLine1("Barbaros Mh. Cigdem Sk. 1/14");
shippingAddress.setCity("Istanbul");
shippingAddress.setStateOrProvince("Atasehir");
shippingAddress.setPostalCode("34000");
shippingAddress.setCountry("TR");
shippingAddress.setRecipient("GG Technology");
shippingAddress.setPhoneNumber("111 222 33 44");

List<LineItemInput> lineItemInputs = new ArrayList<>();
LineItemInput lineItemInput = new LineItemInput();
lineItemInput.setQuantity(1);
lineItemInput.setItemId("v1|112086208159|411034601062");
lineItemInputs.add(lineItemInput);

initiateCheckoutSessionRequest.setShippingAddress(shippingAddress);
initiateCheckoutSessionRequest.setLineItemInputs(lineItemInputs);

CheckoutSessionResponse checkoutSessionResponse = ebayOrder.initiateCheckoutSession(initiateCheckoutSessionRequest);
```
