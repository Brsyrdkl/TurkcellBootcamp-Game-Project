package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {

    private Edevlet[] eDevlets;

    private ArrayList<Player> players;

    public PlayerManager(Edevlet[] eDevlets) {
        this.players = new ArrayList<Player>();
        this.eDevlets = eDevlets;
    }

    public boolean isVerify(Player player, Edevlet[] eDevlet) {
        for (int i = 0; i < eDevlet.length; i++) {
            if (player.getTcNumber() == eDevlet[i].getTcNumber() &&
                    player.getFirstName() == eDevlet[i].getFirstName() &&
                    player.getLastName() == eDevlet[i].getLastName() &&
                    player.getYearOfBirth() == eDevlet[i].getYearOfBirth()) {
                return true;
            }
        }
        return false;
    }

    public void verifyInformation(Player player){

        if(isVerify(player,eDevlets)){
            System.out.println("Player is verified");
        }
        else{
            System.out.println("Player is not verified");
        }
    }

    public void register(Player player) {
        System.out.println("Kayýt Oluþturuldu");
        players.add(player);
    }

    public void remove(Player player) {
        players.remove(player);
    }

    public void updateInformation(Player player) {

        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).getId() == player.getId()) {
                System.out.println("Player is already exist");
            }
            else{
                players.add(player);
            }
        }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose information what you want to:");
        System.out.println("1. ID");
        System.out.println("2. TC Number");
        System.out.println("3. First Name");
        System.out.println("4. Last Name");
        System.out.println("5. Year of birth");
        System.out.println("6. Email");
        System.out.println("7. Password");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter your new ID: ");
                player.setId(scanner.next());
                break;
            case 2:
                System.out.print("Enter your new TC Number: ");
                player.setTcNumber(scanner.next());
                break;
            case 3:
                System.out.print("Enter your new First Name: ");
                player.setFirstName(scanner.next());
                break;
            case 4:
                System.out.print("Enter your new Last Name: ");
                player.setLastName(scanner.next());
                break;
            case 5:
                System.out.print("Enter your new Year of birth: ");
                player.setYearOfBirth(scanner.next());
                break;
            case 6:
                System.out.print("Enter your new Email: ");
                player.seteMail(scanner.next());
                break;
            case 7:
                System.out.print("Enter your new Password: ");
                player.setPassword(scanner.next());
                break;
            default:
                break;
        }*/

    }

    public void buyGame(Player player, Game game) {
        if(isVerify(player,eDevlets)){
            System.out.println("Player is verified,Now you can buy a new game");
            if (player.getMoney() < game.getPrice()) {
                System.out.println("Sorry, you don't have enough money to buy this game.");
            }
            else if(player.getGames().contains(game)){
                System.out.println("Sorry, you already have this game.");
            }
            else {
                player.setMoney(player.getMoney() - game.getPrice());
                player.getGames().add(game);
                this.players.add(player);
                System.out.println("You have successfully bought the game " + game.getName() + ".");
            }
        }
        else{
            System.out.println("Player is not verified,Please try again.");
        }

    }
    public void showMoney(Player player){
        System.out.println(player.getFirstName() + "'s money is " + player.getMoney());
    }


    public Edevlet[] geteDevlets() {
        return eDevlets;
    }

    public void seteDevlets(Edevlet[] eDevlets) {
        this.eDevlets = eDevlets;
    }

}
