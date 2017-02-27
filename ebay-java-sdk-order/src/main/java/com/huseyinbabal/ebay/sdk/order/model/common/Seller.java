package com.huseyinbabal.ebay.sdk.order.model.common;

public class Seller {

    private String feedbackPercentage;
    private Integer feedbackScore;
    private String sellerAccountType;
    private String username;

    public String getFeedbackPercentage() {
        return feedbackPercentage;
    }

    public void setFeedbackPercentage(String feedbackPercentage) {
        this.feedbackPercentage = feedbackPercentage;
    }

    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(Integer feedbackScore) {
        this.feedbackScore = feedbackScore;
    }

    public String getSellerAccountType() {
        return sellerAccountType;
    }

    public void setSellerAccountType(String sellerAccountType) {
        this.sellerAccountType = sellerAccountType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
