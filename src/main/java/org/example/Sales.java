package org.example;

import javax.xml.crypto.Data;

public class Sales {

    private String id;
    private Player buyer;
    private Game[] games;


    public Sales(String id, Player buyer) {
        this.id = id;
        this.buyer = buyer;
        this.games = Database.games;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getBuyer() {
        return buyer;
    }

    public void setBuyer(Player buyer) {
        this.buyer = buyer;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }


}
