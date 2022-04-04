package BentgrassSystem;

import java.awt.geom.GeneralPath;
import java.util.*;

public class Bentgrass {
    private List<List<Results>> currentSeasonResults = new ArrayList<>();
    private List<GolfCourse> playedCourse = new ArrayList<>();
    private String name;
    List<Golfer> powerRankings;
    List<Golfer> memberList = new ArrayList<>();
    List<List<Results>> season4Results = new ArrayList<>();


    public static void main(String[] args) {
        Bentgrass app = new Bentgrass();
        app.run();

    }

    public void run() {
        addGolfers();
        addGolfCourse();
        addResults();


        openingPage();

        //Main Menu print
        //openingPage();
        //memberList.get(1).totalWins(season4Results);

        //Adding Results from most recent events


        //printAllMembers(memberList);


    }

    public void addGolfers() {
        Bentgrass bentgrass = new Bentgrass();
        //0
        memberList.add(new Golfer("feens24", bentgrass));
        memberList.add(new Golfer("augman69", bentgrass));
        memberList.add(new Golfer("TheReelSaGa", bentgrass));
        memberList.add(new Golfer("carstoni_92", bentgrass));
        memberList.add(new Golfer("joekeig", bentgrass));
        //5 IS NEXT LINE
        memberList.add(new Golfer("daddy-oh04667", bentgrass));
        memberList.add(new Golfer("UpDogg107", bentgrass));
        memberList.add(new Golfer("ajalves", bentgrass));
        memberList.add(new Golfer("Max-Power-Money", bentgrass));
        memberList.add(new Golfer("cwillllll08", bentgrass));
        //10 IS NEXT LINE
        memberList.add(new Golfer("richmagpies1862", bentgrass));
        memberList.add(new Golfer("Robo_Rameses", bentgrass));
        memberList.add(new Golfer("VictOHRay", bentgrass));
        memberList.add(new Golfer("doodys4", bentgrass));
        memberList.add(new Golfer("WTF_LOL_OMG_STFU", bentgrass));
        //15 IS NEXT LINE
        memberList.add(new Golfer("FatChaz15", bentgrass));
        memberList.add(new Golfer("diverhawks1", bentgrass));
        memberList.add(new Golfer("Josh_Allen17", bentgrass));
        memberList.add(new Golfer("MattNormus", bentgrass));
        memberList.add(new Golfer("Rontgen", bentgrass));
        //20 IS NEXT LINE
        memberList.add(new Golfer("EXTRA-ABSORBENT", bentgrass));
        memberList.add(new Golfer("B_ROB93", bentgrass));
        memberList.add(new Golfer("Duffman7171", bentgrass));
        memberList.add(new Golfer("buDliGhtBalliN", bentgrass));


    }

    public void addGolfCourse() {
        //0
        playedCourse.add(new GolfCourse("Safe Haven Shores TGCT", 71, 7154, 74.3));
        playedCourse.add(new GolfCourse("Sky Peaks Resort, Canada", 71, 6897, 79.4));
        playedCourse.add(new GolfCourse("Butter's Bay", 72, 7358, 73.4));
        playedCourse.add(new GolfCourse("Vintage Ranch", 72, 7451, 72.9));
        playedCourse.add(new GolfCourse("Whiskey Run", 73, 7285, 79.4));
        //5
        playedCourse.add(new GolfCourse("Dakota Downs", 71, 7192, 74.8));
        playedCourse.add(new GolfCourse("Old Faroe Dunes", 71, 6976, 72.7));
        playedCourse.add(new GolfCourse("Oasis Beach Golf Club", 72, 7599, 78.4));
        playedCourse.add(new GolfCourse("Rising Fawn Country Club", 72, 7184, 78.8));
        playedCourse.add(new GolfCourse("Remanent 1824", 72, 7451, 76.8));
        //10
        playedCourse.add(new GolfCourse("The Ramparts at Harp Head", 72, 7255, 75.9));
    }

    public void addResults() {

        {
            List<Results> week10event2 = new ArrayList<>();
            String wk10ev2 = "Week 10 - Event 2 (Regular)";
            GolfCourse rampartsAtHarpHead = playedCourse.get(10);

            week10event2.add(new Results(memberList.get(1), wk10ev2, rampartsAtHarpHead, new Integer[]{54, 59, 62}));
            week10event2.add(new Results(memberList.get(3), wk10ev2, rampartsAtHarpHead, new Integer[]{60, 61, 60}));
            week10event2.add(new Results(memberList.get(0), wk10ev2, rampartsAtHarpHead, new Integer[]{61, 58, 63}));
            week10event2.add(new Results(memberList.get(9), wk10ev2, rampartsAtHarpHead, new Integer[]{61, 62, 62}));
            week10event2.add(new Results(memberList.get(6), wk10ev2, rampartsAtHarpHead, new Integer[]{60, 60, 66}));
            week10event2.add(new Results(memberList.get(16), wk10ev2, rampartsAtHarpHead, new Integer[]{59, 62, 65}));
            week10event2.add(new Results(memberList.get(13), wk10ev2, rampartsAtHarpHead, new Integer[]{62, 60, 66}));
            week10event2.add(new Results(memberList.get(14), wk10ev2, rampartsAtHarpHead, new Integer[]{65, 59, 66}));
            week10event2.add(new Results(memberList.get(7), wk10ev2, rampartsAtHarpHead, new Integer[]{64, 63, 63}));
            week10event2.add(new Results(memberList.get(2), wk10ev2, rampartsAtHarpHead, new Integer[]{64, 63, 66}));
            week10event2.add(new Results(memberList.get(21), wk10ev2, rampartsAtHarpHead, new Integer[]{64, 65, 67}));
            week10event2.add(new Results(memberList.get(4), wk10ev2, rampartsAtHarpHead, new Integer[]{65, 66, 68}));
            week10event2.add(new Results(memberList.get(5), wk10ev2, rampartsAtHarpHead, new Integer[]{67, 63, 69}));
            week10event2.add(new Results(memberList.get(23), wk10ev2, rampartsAtHarpHead, new Integer[]{69, 65, 69}));

            season4Results.add(week10event2);
            addResultsToPlayer(week10event2);
        }

        {
            List<Results> week11event1 = new ArrayList<>();
            String wk11ev1 = "Week 11 - Event 1 (Regular)";
            GolfCourse remanent1824 = playedCourse.get(9);

            week11event1.add(new Results(memberList.get(1), wk11ev1, remanent1824, new Integer[]{58, 62, 60}));
            week11event1.add(new Results(memberList.get(14), wk11ev1, remanent1824, new Integer[]{64, 62, 63}));
            week11event1.add(new Results(memberList.get(0), wk11ev1, remanent1824, new Integer[]{62, 62, 66}));
            week11event1.add(new Results(memberList.get(2), wk11ev1, remanent1824, new Integer[]{70, 65, 68}));
            week11event1.add(new Results(memberList.get(13), wk11ev1, remanent1824, new Integer[]{68, 68, 71}));
            week11event1.add(new Results(memberList.get(5), wk11ev1, remanent1824, new Integer[]{75, 75, 67}));

            addResultsToPlayer(week11event1);
            season4Results.add(week11event1);
        }

        {
            List<Results> week11event2 = new ArrayList<>();
            String wk11ev2 = "Week 11 - Event 2 (Regular)";
            GolfCourse risingFawnCC = playedCourse.get(8);

            week11event2.add(new Results(memberList.get(1), wk11ev2, risingFawnCC, new Integer[]{60, 59, 57}));
            week11event2.add(new Results(memberList.get(6), wk11ev2, risingFawnCC, new Integer[]{63, 63, 61}));
            week11event2.add(new Results(memberList.get(17), wk11ev2, risingFawnCC, new Integer[]{60, 63, 66}));
            week11event2.add(new Results(memberList.get(9), wk11ev2, risingFawnCC, new Integer[]{59, 65, 65}));
            week11event2.add(new Results(memberList.get(15), wk11ev2, risingFawnCC, new Integer[]{65, 63, 63}));
            week11event2.add(new Results(memberList.get(12), wk11ev2, risingFawnCC, new Integer[]{62, 68, 65}));
            week11event2.add(new Results(memberList.get(2), wk11ev2, risingFawnCC, new Integer[]{67, 68, 62}));
            week11event2.add(new Results(memberList.get(0), wk11ev2, risingFawnCC, new Integer[]{68, 64, 69}));
            week11event2.add(new Results(memberList.get(21), wk11ev2, risingFawnCC, new Integer[]{69, 67, 69}));
            week11event2.add(new Results(memberList.get(13), wk11ev2, risingFawnCC, new Integer[]{69, 71, 66}));
            week11event2.add(new Results(memberList.get(5), wk11ev2, risingFawnCC, new Integer[]{69, 69, 75}));
            week11event2.add(new Results(memberList.get(4), wk11ev2, risingFawnCC, new Integer[]{70, 70, 77}));

            addResultsToPlayer(week11event2);
            season4Results.add(week11event2);
        }

        {
            List<Results> week12event1 = new ArrayList<>();
            String wk12ev1 = "Week 12 - Event 1 (Regular)";
            GolfCourse oasisBeachGolfClub = playedCourse.get(7);

            week12event1.add(new Results(memberList.get(1), wk12ev1, oasisBeachGolfClub, new Integer[]{58, 64, 59}));
            week12event1.add(new Results(memberList.get(3), wk12ev1, oasisBeachGolfClub, new Integer[]{57, 61, 68}));
            week12event1.add(new Results(memberList.get(15), wk12ev1, oasisBeachGolfClub, new Integer[]{63, 59, 65}));
            week12event1.add(new Results(memberList.get(12), wk12ev1, oasisBeachGolfClub, new Integer[]{60, 67, 65}));
            week12event1.add(new Results(memberList.get(2), wk12ev1, oasisBeachGolfClub, new Integer[]{64, 65, 69}));
            week12event1.add(new Results(memberList.get(17), wk12ev1, oasisBeachGolfClub, new Integer[]{65, 71, 65}));
            week12event1.add(new Results(memberList.get(13), wk12ev1, oasisBeachGolfClub, new Integer[]{70, 68, 67}));
            week12event1.add(new Results(memberList.get(14), wk12ev1, oasisBeachGolfClub, new Integer[]{69, 69, 72}));
            week12event1.add(new Results(memberList.get(4), wk12ev1, oasisBeachGolfClub, new Integer[]{73, 66, 73}));

            addResultsToPlayer(week12event1);
            season4Results.add(week12event1);
        }

        {
            List<Results> week12event2 = new ArrayList<>();
            String wk12ev2 = "Week 12 - Event 2 (Major)";
            GolfCourse oldFaroeDunes = playedCourse.get(6);

            week12event2.add(new Results(memberList.get(1), wk12ev2, oldFaroeDunes, new Integer[]{58, 58, 57, 57}));
            week12event2.add(new Results(memberList.get(3), wk12ev2, oldFaroeDunes, new Integer[]{57, 59, 59, 59}));
            week12event2.add(new Results(memberList.get(0), wk12ev2, oldFaroeDunes, new Integer[]{61, 61, 60, 63}));
            week12event2.add(new Results(memberList.get(17), wk12ev2, oldFaroeDunes, new Integer[]{66, 60, 60, 60}));
            week12event2.add(new Results(memberList.get(9), wk12ev2, oldFaroeDunes, new Integer[]{63, 63, 62, 63}));
            week12event2.add(new Results(memberList.get(12), wk12ev2, oldFaroeDunes, new Integer[]{66, 61, 61, 66}));
            week12event2.add(new Results(memberList.get(4), wk12ev2, oldFaroeDunes, new Integer[]{66, 57, 63, 68}));
            week12event2.add(new Results(memberList.get(6), wk12ev2, oldFaroeDunes, new Integer[]{64, 63, 66, 68}));
            week12event2.add(new Results(memberList.get(2), wk12ev2, oldFaroeDunes, new Integer[]{63, 66, 68, 64}));
            week12event2.add(new Results(memberList.get(21), wk12ev2, oldFaroeDunes, new Integer[]{64, 67, 68, 69}));

            addResultsToPlayer(week12event2);
            season4Results.add(week12event2);
        }

        {
            List<Results> week13event1 = new ArrayList<>();
            String wk13ev1 = "Week 13 - Event 1 (regular)";
            GolfCourse dakotaDowns = playedCourse.get(5);

            week13event1.add(new Results(memberList.get(1), wk13ev1, dakotaDowns, new Integer[]{61, 55, 60}));
            week13event1.add(new Results(memberList.get(0), wk13ev1, dakotaDowns, new Integer[]{61, 59, 57}));
            week13event1.add(new Results(memberList.get(20), wk13ev1, dakotaDowns, new Integer[]{62, 59, 61}));
            week13event1.add(new Results(memberList.get(3), wk13ev1, dakotaDowns, new Integer[]{64, 58, 62}));
            week13event1.add(new Results(memberList.get(15), wk13ev1, dakotaDowns, new Integer[]{62, 63, 60}));
            week13event1.add(new Results(memberList.get(9), wk13ev1, dakotaDowns, new Integer[]{60, 64, 61}));
            week13event1.add(new Results(memberList.get(17), wk13ev1, dakotaDowns, new Integer[]{62, 59, 65}));
            week13event1.add(new Results(memberList.get(12), wk13ev1, dakotaDowns, new Integer[]{63, 63, 66}));
            week13event1.add(new Results(memberList.get(2), wk13ev1, dakotaDowns, new Integer[]{64, 65, 66}));
            week13event1.add(new Results(memberList.get(4), wk13ev1, dakotaDowns, new Integer[]{65, 65, 71}));
            week13event1.add(new Results(memberList.get(22), wk13ev1, dakotaDowns, new Integer[]{66, 68, 68}));

            addResultsToPlayer(week13event1);
            season4Results.add(week13event1);
        }

        {
            List<Results> week13event2 = new ArrayList<>();
            String wk13ev2 = "Week 13 - Event 2 (Regular)";
            GolfCourse whiskeyRun = playedCourse.get(4);

            week13event2.add(new Results(memberList.get(3), wk13ev2, whiskeyRun, new Integer[]{62, 58, 63}));
            week13event2.add(new Results(memberList.get(17), wk13ev2, whiskeyRun, new Integer[]{63, 59, 65}));
            week13event2.add(new Results(memberList.get(15), wk13ev2, whiskeyRun, new Integer[]{63, 63, 64}));
            week13event2.add(new Results(memberList.get(9), wk13ev2, whiskeyRun, new Integer[]{65, 64, 61}));
            week13event2.add(new Results(memberList.get(1), wk13ev2, whiskeyRun, new Integer[]{64, 61, 65}));
            week13event2.add(new Results(memberList.get(20), wk13ev2, whiskeyRun, new Integer[]{63, 62, 65}));
            week13event2.add(new Results(memberList.get(13), wk13ev2, whiskeyRun, new Integer[]{65, 63, 70}));
            week13event2.add(new Results(memberList.get(21), wk13ev2, whiskeyRun, new Integer[]{67, 62, 69}));
            week13event2.add(new Results(memberList.get(5), wk13ev2, whiskeyRun, new Integer[]{66, 65, 67}));
            week13event2.add(new Results(memberList.get(22), wk13ev2, whiskeyRun, new Integer[]{66, 67, 69}));
            week13event2.add(new Results(memberList.get(2), wk13ev2, whiskeyRun, new Integer[]{66, 67, 71}));
            week13event2.add(new Results(memberList.get(4), wk13ev2, whiskeyRun, new Integer[]{67, 67, 71}));

            addResultsToPlayer(week13event2);
            season4Results.add(week13event2);
        }

        {
            List<Results> week14event1 = new ArrayList<>();
            String wk14ev1 = "Week 14 - Event 1 (Regular)";
            GolfCourse vintageRanch = playedCourse.get(3);

            week14event1.add(new Results(memberList.get(1), wk14ev1, vintageRanch, new Integer[]{59, 59, 63}));
            week14event1.add(new Results(memberList.get(3), wk14ev1, vintageRanch, new Integer[]{60, 65, 61}));
            week14event1.add(new Results(memberList.get(15), wk14ev1, vintageRanch, new Integer[]{62, 62, 65}));
            week14event1.add(new Results(memberList.get(9), wk14ev1, vintageRanch, new Integer[]{67, 66, 67}));
            week14event1.add(new Results(memberList.get(2), wk14ev1, vintageRanch, new Integer[]{69, 70, 69}));

            addResultsToPlayer(week14event1);
            season4Results.add(week14event1);
        }

        {
            List<Results> week14event2 = new ArrayList<>();
            String wk14ev2 = "Week 14 - Event 2 (Regular)";
            GolfCourse buttersBay = playedCourse.get(2);

            week14event2.add(new Results(memberList.get(1), wk14ev2, buttersBay, new Integer[]{60, 62, 62}));
            week14event2.add(new Results(memberList.get(15), wk14ev2, buttersBay, new Integer[]{65, 63, 62}));
            week14event2.add(new Results(memberList.get(3), wk14ev2, buttersBay, new Integer[]{64, 65, 62}));
            week14event2.add(new Results(memberList.get(9), wk14ev2, buttersBay, new Integer[]{67, 61, 65}));
            week14event2.add(new Results(memberList.get(17), wk14ev2, buttersBay, new Integer[]{64, 65, 69}));
            week14event2.add(new Results(memberList.get(0), wk14ev2, buttersBay, new Integer[]{69, 67, 69}));
            week14event2.add(new Results(memberList.get(6), wk14ev2, buttersBay, new Integer[]{69, 67, 70}));
            week14event2.add(new Results(memberList.get(5), wk14ev2, buttersBay, new Integer[]{68, 68, 70}));
            week14event2.add(new Results(memberList.get(4), wk14ev2, buttersBay, new Integer[]{65, 73, 70}));

            addResultsToPlayer(week14event2);
            season4Results.add(week14event2);

        }

        {
            List<Results> week15event1 = new ArrayList<>();
            String wk15ev1 = "Week 15 - Event 1 (Championship)";
            GolfCourse skyPeaksResort = playedCourse.get(1);


            week15event1.add(new Results(memberList.get(1), wk15ev1, skyPeaksResort, new Integer[]{53, 59, 59}));
            week15event1.add(new Results(memberList.get(3), wk15ev1, skyPeaksResort, new Integer[]{58, 61, 58}));
            week15event1.add(new Results(memberList.get(0), wk15ev1, skyPeaksResort, new Integer[]{59, 61, 62}));
            week15event1.add(new Results(memberList.get(20), wk15ev1, skyPeaksResort, new Integer[]{65, 62, 59}));
            week15event1.add(new Results(memberList.get(6), wk15ev1, skyPeaksResort, new Integer[]{66, 62, 59}));
            week15event1.add(new Results(memberList.get(15), wk15ev1, skyPeaksResort, new Integer[]{63, 68, 56}));
            week15event1.add(new Results(memberList.get(17), wk15ev1, skyPeaksResort, new Integer[]{62, 61, 65}));
            week15event1.add(new Results(memberList.get(12), wk15ev1, skyPeaksResort, new Integer[]{63, 62, 64}));
            week15event1.add(new Results(memberList.get(14), wk15ev1, skyPeaksResort, new Integer[]{62, 64, 65}));
            week15event1.add(new Results(memberList.get(2), wk15ev1, skyPeaksResort, new Integer[]{66, 65, 70}));

            addResultsToPlayer(week15event1);
            season4Results.add(week15event1);
        }

        {
            List<Results> week15event2 = new ArrayList<>();
            String wk15ev2 = "Week 15 - Event 2 (Season Final)";
            GolfCourse safeHavenShores = playedCourse.get(0);


            week15event2.add(new Results(memberList.get(15), wk15ev2, safeHavenShores, new Integer[]{63, 59, 60, 63}));
            week15event2.add(new Results(memberList.get(1), wk15ev2, safeHavenShores, new Integer[]{61, 61, 63, 65}));
            week15event2.add(new Results(memberList.get(6), wk15ev2, safeHavenShores, new Integer[]{62, 66, 64, 69}));
            week15event2.add(new Results(memberList.get(14), wk15ev2, safeHavenShores, new Integer[]{66, 64, 66, 67}));
            week15event2.add(new Results(memberList.get(0), wk15ev2, safeHavenShores, new Integer[]{66, 71, 66, 66}));
            week15event2.add(new Results(memberList.get(5), wk15ev2, safeHavenShores, new Integer[]{68, 68, 65, 73}));
            week15event2.add(new Results(memberList.get(2), wk15ev2, safeHavenShores, new Integer[]{67, 67, 72, 72}));

            addResultsToPlayer(week15event2);
            season4Results.add(week15event2);

        }
    }

    public void addResultsToPlayer(List<Results> event) {
        for (Results result : event) {
            result.getGolfer().tournamentResults.add(result);
            for (int score : result.getRoundScores()) {
                result.getGolfer().season4Scores.add(score);
                result.getGolfer().handicapDifferentials.add(score - (result.getCoursePlayed().getCourseRating()));
            }
        }
    }

    public void openingPage() {
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println("...........................BentGrass League Home Page.................................");
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println("......................................................................................");
        System.out.println();
        System.out.println("Please choose an option:  Player Stats | Power Rankings | Member List");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("Player Stats")) {
            System.out.println();
            lookForPlayer(input);
            System.out.println("Would you like to see any other players? Y/N");
            String yOrN = input.nextLine();
            while (yOrN.equalsIgnoreCase("Y")) {
                lookForPlayer(input);
                System.out.println("Would you like to see any other players? Y/N");
                yOrN = input.nextLine();
            }
            backToHomepage(input);

        } else if (choice.equalsIgnoreCase("Member List")) {
            for (Golfer golfer : memberList) {
                System.out.println(printInfo(golfer, season4Results));
                System.out.println(".......................................................................");
            }
            backToHomepage(input);
        } else if (choice.equalsIgnoreCase("Power Rankings")) {
            powerRank(memberList);
            for (Golfer golfer : powerRankings) {
                System.out.println((powerRankings.indexOf(golfer) + 1) + ".) " + golfer.getUserName() + " " + golfer.powerAlgo());
            }
        }

    }

    public void lookForPlayer(Scanner input) {
        System.out.println("Player name:");
        String userName = input.nextLine();
        for (Golfer golfer : memberList) {
            if (userName.equalsIgnoreCase("all")) {
                System.out.println(printInfo(golfer, season4Results));
                System.out.println(golfer.toString());
                System.out.println("------------------------------------------------------------------------");
            } else if (golfer.getUserName().contains(userName)) {
                System.out.println(printInfo(golfer, season4Results));
                System.out.println(golfer.toString());
                System.out.println("--------------------------------------------------------------------------------");
                //break;
            }
        }

    }

    public void backToHomepage(Scanner input) {
        System.out.println("Would you like to go back to the Homepage? Y/N");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            openingPage();
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println(".....................................................................................");
            System.out.println(".....................................................................................");
            System.out.println(".........................Thank you for coming!.......................................");
            System.out.println(".....................................................................................");
        }
    }

    public void printCurrentStats() {
        for (Golfer golfer : memberList) {
            System.out.println(golfer.toString());
            System.out.println();
        }
    }

    public void printAllMembers(List<Golfer> memberList, List<List<Results>> currentSeasonResults) {

        for (Golfer golfer : memberList) {
            System.out.println(printInfo(golfer, currentSeasonResults));
            System.out.println();
        }


    }

    public String printInfo(Golfer golfer, List<List<Results>> currentSeasonResults) {
        return "UserName: " + golfer.getUserName() + " Current Season | Tournaments played: " + golfer.getTournamentsPlayed() + " Total wins: " + golfer.totalWins(currentSeasonResults);
    }

    public List<Golfer> getMemberList() {
        return memberList;
    }


    public List<GolfCourse> getPlayedCourse() {
        return playedCourse;
    }

    public List<Golfer> getPowerRankings() {
        return powerRankings;
    }

    public List<List<Results>> getCurrentSeasonResults() {
        return currentSeasonResults;
    }

    public String getName() {
        return name;
    }


    public List<Golfer> powerRank(List<Golfer> memberList) {
        powerRankings = memberList;


        for (int i = 0; i < powerRankings.size(); i++) {
            {
                for (int j = powerRankings.size() - 1; j > i; j--) {
                    if (powerRankings.get(i).powerAlgo() > powerRankings.get(j).powerAlgo()) {

                        Golfer tmp = powerRankings.get(i);
                        powerRankings.set(i, memberList.get(j));
                        powerRankings.set(j, tmp);
                    }

                }
            }
        }
        for (int k = 0; k < memberList.size(); k++) {
                    if (memberList.get(k).getTournamentsPlayed() < 3) {
                        powerRankings.remove(memberList.get(k));
                    }
                }

        return powerRankings;
    }
}



//    public void fullLeaguePrint(List<Golfer> memberList){
//
//        for(Golfer member : memberList){
//            System.out.println(toString(member));
//        }
//    }




