package com.huseyinbabal.ebay.sdk.order;

import com.huseyinbabal.ebay.core.model.Address;
import com.huseyinbabal.ebay.core.model.LineItemInput;
import com.huseyinbabal.ebay.sdk.order.model.request.InitiateCheckoutSessionRequest;
import com.huseyinbabal.ebay.sdk.order.model.response.CheckoutSessionResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hbabal on 23/12/16.
 */
public class Main {
    public static void main(String[] args) {
        EbayOrder ebayOrder = new EbayOrderClient("v^1.1#i^1#r^0#p^3#I^3#f^0#t^H4sIAAAAAAAAAOVXa2wUVRTu9kUqLZqIYqzCZoBIIbNz5707djdsX7Kkj4VtCRBqc2fm7nbo7swyd7btGiJNjYQEohJisBiV9IeGCApq8BEgsfLDR4wI6A9IVYIm8vAHxAQ0YryzfW1rBKSYNHH/bObec88933e+c+89oK+0bOnWFVuvVXhmFe7tA32FHg87G5SVliybU1T4cEkByDPw7O1b1FfcX/RzNYapZFpZjXDaMjHy9qaSJlZyg0EqY5uKBbGBFROmEFYcTYmFmxoVzgeUtG05lmYlKW+kLkhBFagQcQFJl0VZ1MmgOeay1QpSfskPBcBJUIwjwEOWzGOcQRETO9B0ghQHWIlmOZqTWoGssJICOJ8ssusp7xpkY8MyiYkPUKFctEpurZ0X6s0jhRgj2yFOqFAk3BBrCUfq6ptbq5k8X6FRGmIOdDJ48letpSPvGpjMoJtvg3PWSiyjaQhjigmN7DDZqRIeC+YOws8x7df0uCpDMaAivyBwd4fKBstOQefmcbgjhk7Hc6YKMh3Dyd6KUcKGuhFpzuhXM3ERqfO6f6syMGnEDWQHqfqa8Lq2WP1qyhuLRm2r29CR7iJleZ4HnCj5qZCDMKEQ2R2JBDaSXbYF9dHdRlyOcj1lu1rL1A2XOexttpwaREJHUwkCeQQRoxazxQ7HHTesfLvAGJG8vN7N7EgqM06n6SYXpQgb3tznrdMwposJJdw1ZXCAKEOUWVnTZT+UJinDrfU7VEfITVA4GmWQCrN0CtpdyEknoYZojVCbSSHb0BVBUAUJanGa5/waLeiiRgcCIqI5JCGJg7wA4sL/TiCOYxtqxkHjIpk6kUMapGKalUZRK2loWWqqSe7kGZVELw5SnY6TVhimp6fH18P7LDvBcACwzNqmxpjWiVKQGrc1bm1MGzlxaIiswobiZNMkml6iPbK5maBCvK1Hoe1kozZKkVSMKXdSbKGpo/8AErsgZxY8dz0mDmDa8Lni9mlWirEgKWR3qCMXsfd2jBg1kyX768j22QjqlpnM/st106I2nE5H9Alqc7U+A+hdQSoya5g1dIyU5GpSknSsZi2NBDEONFnQaSgDgdxj/mlh11G3oaEOQ59Z0jIzyeS0cDUlZhqkZiY8LUR1qDsywyAJAZ7jArJMQ13gaUEN6OTWYnVaAjpgedkv6iKcFubapEGO/dbsf3byFfd7dt1peVrYQfr04JH3x8zKqHvCkANGIk9jv+YHkA5IMkcLnCjQKg9EGrKcfLuQpwzk3eJ/e8Exk9uoUEHux/Z7joJ+z4ekEwMyoNlloKq0qK24qJzChoN8GJq6avX6DBj3YSNhkjbBRr4ulE1Dwy4s9TSd37FuS14Dt7cdPDTewpUVsbPz+jnwyMRMCXvvvApWYjlOAjIrAW49WDgxW8w+WDx3af0DT72w8MTF4fTQ9sa1XuZI/KUToGLcyOMpKSDKKnjiZeP4T7UL9Ja25YPb2+u8B+aBC4cG+p997cY3PW/UDx9Y3uKdvf+DNfjFbU3vtQ9dHap8f8/xc7vPDvxadGjWk98eu+os2ffu4ONnj71eOMhV/U59fmpxzan+Rc8f2/1nVa/v0ZODBTvPhyp3Vux7JnjYsyO2AMhzju5JPn1y5SdMdegV5bE5b/5YdvDafcz3F7fOPaKcuieyqX3bhmETV1/ab+y+PND2tbp4Q1/b6RvPfTV/pzX/cBs7cCFx/6dfXjq9ih1+52B5R+PK8iWHj+/5+I8rwi5cteX6mY+++2Xe9cubrpx+u3foVc+yM+rGZrZz8w8dle1UeVeps+OLymx02+butxrON3zmRed+G0njXyBGn3paDwAA");
        InitiateCheckoutSessionRequest initiateCheckoutSessionRequest = new InitiateCheckoutSessionRequest();
        Address shippingAddress = new Address();
        shippingAddress.setAddressLine1("Barbaros Mh. Cigdem Sk. 1/14");
        shippingAddress.setCity("Istanbul");
        shippingAddress.setStateOrProvince("Atasehir");
        shippingAddress.setPostalCode("34000");
        shippingAddress.setCountry("TR");
        shippingAddress.setRecipient("Kaan Emec");
        shippingAddress.setPhoneNumber("503 568 1586");
        List<LineItemInput> lineItemInputs = new ArrayList<>();
        LineItemInput lineItemInput = new LineItemInput();
        lineItemInput.setQuantity(1);
        lineItemInput.setItemId("v1|112086208159|411034601062");
        lineItemInputs.add(lineItemInput);
        initiateCheckoutSessionRequest.setShippingAddress(shippingAddress);
        initiateCheckoutSessionRequest.setLineItemInputs(lineItemInputs);
        CheckoutSessionResponse checkoutSessionResponse = ebayOrder.initiateCheckoutSession(initiateCheckoutSessionRequest);
        System.out.println(checkoutSessionResponse);
    }
}
