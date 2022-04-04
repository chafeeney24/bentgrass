package BentgrassSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Results {
    private int roundsPlayed;
    private GolfCourse coursePlayed;
    private String eventName;
    private Golfer golfer;
    private List<Integer> roundScores = new ArrayList<>();
    private int totalScore;




    public Results(Golfer golfer, String eventName, GolfCourse coursePlayed, Integer[] roundScores){
        this.golfer = golfer;
        this.eventName = eventName;
        this.coursePlayed = coursePlayed;
        this.roundsPlayed = roundScores.length;
        this.roundScores.addAll(Arrays.asList(roundScores));
        totalScore = getTotalScore();

    }

    public int getTotalScore(){
        totalScore = 0;
        for(Integer score : roundScores){
            totalScore += score;
        }
          return totalScore;
    }


    public GolfCourse coursePlayed(){
        return coursePlayed;
    }


    public Integer[] getRoundScores() {

        return roundScores.toArray(new Integer[0]);
    }

    public GolfCourse getCoursePlayed() {
        return coursePlayed;
    }

    public void setCoursePlayed(GolfCourse coursePlayed) {
        this.coursePlayed = coursePlayed;
    }


    public String getEventName() {
        return eventName;
    }

    public Golfer getGolfer() {
        return golfer;
    }

    public int getRoundsPlayed() {
        roundsPlayed = roundScores.size();
        return roundsPlayed;
    }
}
