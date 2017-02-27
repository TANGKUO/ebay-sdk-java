package com.huseyinbabal.ebay.sdk.order.model.common;

import java.util.ArrayList;
import java.util.List;

public class LineItem {

    private Price baseUnitPrice;
    private Image image;
    private String itemId;
    private String lineItemId;
    private Price netPrice;
    private List<Promotion> promotions = new ArrayList<>();
    private Integer quantity;
    private Seller seller;
    private List<ShippingOption> shippingOptions = new ArrayList<>();
    private String shortDescription;
    private String title;

    public Price getBaseUnitPrice() {
        return baseUnitPrice;
    }

    public void setBaseUnitPrice(Price baseUnitPrice) {
        this.baseUnitPrice = baseUnitPrice;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Price getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Price netPrice) {
        this.netPrice = netPrice;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public void setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
