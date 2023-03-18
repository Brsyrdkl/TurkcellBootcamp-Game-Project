package org.example;

public class Campaign {
    private String campaignId;
    private double discountPercentage = 0.0;

    public Campaign(String campaignId, double discountPercentage) {
        this.campaignId = campaignId;
        this.discountPercentage = discountPercentage;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
