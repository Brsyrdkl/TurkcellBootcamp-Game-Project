package org.example;

import java.util.ArrayList;

public class Player extends User{

    private String id;
    private String eMail;
    private String password;
    private double money;
    private ArrayList<Game> games = new ArrayList<Game>();


    public Player(){

    }
    public Player(String id,String tcNumber, String firstName, String lastName, String yearOfBirth, String eMail, String password,double money) {
        super(tcNumber, firstName, lastName, yearOfBirth);
        this.id = id;
        this.eMail = eMail;
        this.password = password;
        this.money = money;
    }


    /*Getters and Setters */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
}
