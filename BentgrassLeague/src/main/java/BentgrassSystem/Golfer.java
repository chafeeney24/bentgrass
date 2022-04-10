package BentgrassSystem;

import java.util.*;

public class Golfer {
    private String userName;
    private int rank;
    private int tournamentsPlayed;
    private double handicap;
    List<Results>CurrentSeasonScores;
    List<Double> handicapDifferentials = new ArrayList<>();
    List<Integer> playerSeason4Scores = new ArrayList<>();
    List<Results> tournamentResults = new ArrayList<>();



    public Golfer(String userName) {
        this.userName = userName;
    }

    public double powerAlgo() {
        double avgScore = scoringAverage(playerSeason4Scores);
        double handicap = calculatePlayerHandicap();
        int powerVariable = 3;

        double powerNumber = avgScore - (handicap * powerVariable);

        return powerNumber;
    }

    public double scoringAverage(List<Integer> seasonScores) {
        double avg = 0.0;
        int sum = 0;
        if (playerSeason4Scores.size() == 0)
            return 0.0;
        for (Integer score : playerSeason4Scores) {
            sum += score;
        }
        avg = (double) sum / playerSeason4Scores.size();

        return avg;
    }

    public double calculatePlayerHandicap() {

        List<Double> handicap;
        double handicapIndex = 0.0;
        while (this.handicapDifferentials.size() > 20) {
            this.handicapDifferentials.remove(0);
        }

        int length = this.handicapDifferentials.size();
        handicap = this.handicapDifferentials;
        Collections.sort(handicap);

        if (length < 5) {
            return 0.0;
        } else if (length <= 6) {
            handicapIndex = diffUsed(handicap, 1);
            return -handicapIndex;
        } else if (length <= 8) {
            handicapIndex = diffUsed(handicap, 2);
            return -handicapIndex;
        } else if (length <= 10) {
            handicapIndex = diffUsed(handicap, 3);
            return -handicapIndex;
        } else if (length <= 12) {
            handicapIndex = diffUsed(handicap, 4);
            return -handicapIndex;
        } else if (length <= 14) {
            handicapIndex = diffUsed(handicap, 5);
            return -handicapIndex;
        } else if (length <= 16) {
            handicapIndex = diffUsed(handicap, 6);
            return -handicapIndex;
        } else if (length == 17) {
            handicapIndex = diffUsed(handicap, 7);
            return -handicapIndex;
        } else if (length == 18) {
            handicapIndex = diffUsed(handicap, 8);
            return -handicapIndex;
        } else if (length == 19) {
            handicapIndex = diffUsed(handicap, 9);
            return -handicapIndex;
        } else {
            handicapIndex = diffUsed(handicap, 10);
            return -handicapIndex;
        }
    }

    public double diffUsed(List<Double> list, int differentialUsed) {
        int sum = 0;
        int avg = 0;
        final double HANDICAP_MULTIPLIER = 0.96;
        for (int i = 0; i < differentialUsed; i++) {
            sum += list.get(i);
        }
        avg = sum / differentialUsed;
        return avg * HANDICAP_MULTIPLIER;
    }

    public String toString(){

        return "Player Stats: " + this.userName + " | Power Number: " + String.format("%.2f", powerAlgo()) + " | Scoring average: " +
                String.format("%.2f", scoringAverage(playerSeason4Scores)) + " | handicap: " + String.format("%.1f", calculatePlayerHandicap());
    }


    public int totalWins(List<List<Results>> currentSeason){
        int totalWins = 0;
        for(int i = 0; i < currentSeason.size(); i++){
           List<Results> temp = currentSeason.get(i);
           if(this.equals(temp.get(0).getGolfer())){
                totalWins++;
            }
        }
        return totalWins;
    }


    public List<Results> getCurrentSeasonScores() {
        return CurrentSeasonScores;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getHandicap() {
        return calculatePlayerHandicap();
    }

    public int getRank() {
        return rank;
    }

    public int getTournamentsPlayed() {
        return tournamentResults.size();
    }

    public void setTournamentsPlayed(int tournamentsPlayed) {
        this.tournamentsPlayed = tournamentsPlayed;
    }


    public List<Integer> getPlayerSeason4Scores() {
        return playerSeason4Scores;
    }


    public List<Results> getTournamentResults() {
        return tournamentResults;
    }

    public void setTournamentResults(List<Results> tournamentResults) {
        this.tournamentResults = tournamentResults;
    }



}
