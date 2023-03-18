package org.example;

public class Main {
    public static void main(String[] args) {

        PlayerManager playerManager = new PlayerManager(Database.edevlets);
        CampaignManager campaignManager = new CampaignManager(Database.games);
        campaignManager.addCampaign(new Campaign("1",10.0),"2");
        playerManager.register(Database.player1);
        playerManager.buyGame(Database.player1,Database.games[1]);
        playerManager.showMoney(Database.player1);
        campaignManager.removeCampaign("2");
        playerManager.buyGame(Database.player1,Database.games[2]);
        playerManager.showMoney(Database.player1);

    }
}