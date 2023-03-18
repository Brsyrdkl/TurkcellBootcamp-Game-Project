package org.example;

public class Database {

    public static final Edevlet[] edevlets = new Edevlet[]{
            new Edevlet ("1","11111","Baris","Yurdakul","05.06.2000"),
            new Edevlet("2","22222","Hamza", "Pamuk","01.02.1992"),
            new Edevlet("3","33333","Büþra", "Çiftlik","03.06.1995"),
            new Edevlet("4","44444","Alperen", "Sezgin","12.06.1998")};

    public static final Game[] games = new Game[]{
            new Game("1","Minecraft",50.0,100),
            new Game("2","Valorant",40.0,100),
            new Game("3","CS:GO",30.0,100)};

    public static final Player player1 = new Player("1","11111","Baris","Yurdakul","05.06.2000","barisyurdakul.by@gmail.com","123456",5000);
}
