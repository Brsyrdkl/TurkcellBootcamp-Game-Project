package org.example;

public class CampaignManager {

    private Game[] games;

    public CampaignManager() {

    }
    public CampaignManager(Game[] games){
        this.games = games;
    }

    public void addCampaign(Campaign campaign,String gameId) {
        for (Game game : games) {
            if (game.getId().equals(gameId)) {
                game.campaignRearrange(campaign);
                System.out.println("Campaign added");
            }
        }

    }
    public void removeCampaign(String gameId) {
        for (Game game : games) {
            if (game.getId().equals(gameId)) {
                game.campaignRearrange(null);
                System.out.println("Campaign removed");
            }
        }
    }
    public void updateCampaign(String campaignId,String gameId,double newDiscountPercentage){
        for (Game game : games) {
            if (game.getId().equals(gameId) && game.getCampaign().getCampaignId().equals(campaignId)) {
                game.getCampaign().setDiscountPercentage(newDiscountPercentage);
                System.out.println("Campaign updated");
            }
        }
    }
}
