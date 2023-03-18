package org.example;

public class Game {

    private String id;
    private String name;
    private double price;
    private Campaign campaign;
    private int stock;

    public Game(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void campaignRearrange(Campaign campaign){
        if(campaign == null){
            this.setPrice(this.price);
        }
        else {
            this.setCampaign(campaign);
            this.setPrice(this.price - (this.price * (campaign.getDiscountPercentage()) / 100));
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}

