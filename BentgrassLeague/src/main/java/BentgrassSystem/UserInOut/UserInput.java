package BentgrassSystem.UserInOut;

import BentgrassSystem.Bentgrass;
import BentgrassSystem.Golfer;
import BentgrassSystem.Leaderboard;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);
    private static Leaderboard leaderboared = new Leaderboard();

    public static void MainPage(Bentgrass bentgrass) {
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println("...........................BentGrass League Home Page.................................");
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println();
        System.out.println("(1) Player Stats");
        System.out.println("(2) Member List ");
        System.out.println("(3) LeaderBoard ");
        System.out.println("(4) Match Maker ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                lookForPlayer(bentgrass);
                System.out.println("\nWould you like to see any other players? Y/N");
                String yOrN = scanner.nextLine();
                while (yOrN.equalsIgnoreCase("Y")) {
                    lookForPlayer(bentgrass);
                    System.out.println("Would you like to see any other players? Y/N");
                    yOrN = scanner.nextLine();
                }
                backToHomepage(bentgrass);
                break;

            case "2":
                for (int i  = 0; i < bentgrass.getMemberList().size(); i++) {
                    System.out.println(bentgrass.printInfo(bentgrass.getMemberList().get(i), bentgrass.getSeason4Results()));
                    System.out.println(".......................................................................");
                }
                backToHomepage(bentgrass);
                break;

            case "3":
                UserOutput.powerRank();

                break;
            case "4":

                break;
            default:
                break;
        }

    }

    public static void lookForPlayer(Bentgrass bentgrass) {
        System.out.println("Player name:");
        String userName = scanner.nextLine();
        for (Golfer golfer : bentgrass.getMemberList()) {
            if (userName.equalsIgnoreCase("all")) {
                System.out.println(bentgrass.printInfo(golfer, bentgrass.getSeason4Results()));
                System.out.println(golfer.toString());
                System.out.println("------------------------------------------------------------------------");
            } else if (golfer.getUserName().contains(userName)) {
                System.out.println(bentgrass.printInfo(golfer, bentgrass.getSeason4Results()));
                System.out.println(golfer.toString());
                System.out.println("--------------------------------------------------------------------------------");

            }
        }

    }

    public static void backToHomepage(Bentgrass bentgrass) {
        System.out.println("Would you like to go back to the Homepage? Y/N");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            MainPage(bentgrass);
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println(".....................................................................................");
            System.out.println(".....................................................................................");
            System.out.println(".........................Thank you for coming!.......................................");
            System.out.println(".....................................................................................");
        }
    }


}

