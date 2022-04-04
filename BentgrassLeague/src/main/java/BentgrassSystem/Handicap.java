package BentgrassSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Handicap {
    private double handicapIndex;

}

//    private double handicapIndex;
//    private final double HANDICAP_MULTIPLIER = 0.96;
//
//    public Handicap(){
//        this.handicapIndex = handicapIndex;
//    }

//    (Score - Course Rating)

//    public void getDifferential() {
//
//        for (List<Results> results : season4Results) {
//            for (Results result : results) {
//                result.getRoundScores();
//                for (int i = 0; i < result.getRoundScores().length; i++) {
//                    double differential = (result.coursePlayed().getCourseRating() - result.getRoundScores()[i]);
//                    result.getGolfer().handicapDifferentials.add(differential);
//                }
//            }
//        }
//    }

//    public double diffUsed(List<Double> list, int differentialUsed) {
//        int sum = 0;
//        int avg = 0;
//        final double HANDICAP_MULTIPLIER = 0.96;
//        for (int i = 0; i < differentialUsed; i++) {
//            sum += list.get(i);
//        }
//        avg = sum / differentialUsed;
//        return avg * HANDICAP_MULTIPLIER;
//    }
//
//    public double calculatePlayerHandicap(Golfer golfer) {
//
//        List<Double> handicap;
//        double handicapIndex = 0.0;
//        while (golfer.handicapDifferentials.size() > 20) {
//            golfer.handicapDifferentials.remove(0);
//        }
//
//        int length = golfer.handicapDifferentials.size();
//        handicap = golfer.handicapDifferentials;
//        Collections.sort(handicap);
//
//        if (length < 5) {
//            return 0.0;
//        } else if (length <= 6) {
//            handicapIndex = diffUsed(handicap, 1);
//            return -handicapIndex;
//        } else if (length <= 8) {
//            handicapIndex = diffUsed(handicap, 2);
//            return -handicapIndex;
//        } else if (length <= 10) {
//            handicapIndex = diffUsed(handicap, 3);
//            return -handicapIndex;
//        } else if (length <= 12) {
//            handicapIndex = diffUsed(handicap, 4);
//            return -handicapIndex;
//        } else if (length <= 14) {
//            handicapIndex = diffUsed(handicap, 5);
//            return -handicapIndex;
//        } else if (length <= 16) {
//            handicapIndex = diffUsed(handicap, 6);
//            return -handicapIndex;
//        } else if (length == 17) {
//            handicapIndex = diffUsed(handicap, 7);
//            return -handicapIndex;
//        } else if (length == 18) {
//            handicapIndex = diffUsed(handicap, 8);
//            return -handicapIndex;
//        } else if (length == 19) {
//            handicapIndex = diffUsed(handicap, 9);
//            return -handicapIndex;
//        } else {
//            handicapIndex = diffUsed(handicap, 10);
//            return -handicapIndex;
//        }
//    }
//}

//    public double getHandicapIndex() {
//        this.handicapIndex = getHandicapIndex(this);
//        return handicapIndex;
//    }

    /*Use a list of 20 of the most recent score differentials, and take the 10 best differentials
        to get an average. Sort the handicapArray from best diff to worst diff.
     */
//    public double calculateHandicap(Golfer golfer) {
//        List<Double> handicap = new ArrayList<>();
//
//        while (golfer.handicapDifferentials.size() > 20) {
//            golfer.handicapDifferentials.remove(0);
//        }
//
//        int length = golfer.handicapDifferentials.size();
//        handicap = golfer.handicapDifferentials;
//        Collections.reverse(handicap);
//
//        if (length < 5) {
//            return 0.0;
//        } else if (length <= 6) {
//            this.handicapIndex = diffUsed(handicap, 1);
//            return handicapIndex;
//        } else if (length <= 8) {
//            this.handicapIndex = diffUsed(handicap, 2);
//            return handicapIndex;
//        } else if (length <= 10) {
//            this.handicapIndex = diffUsed(handicap, 3);
//            return handicapIndex;
//        } else if (length <= 12) {
//            this.handicapIndex = diffUsed(handicap, 4);
//            return handicapIndex;
//        } else if (length <= 14) {
//            this.handicapIndex = diffUsed(handicap, 5);
//            return handicapIndex;
//        } else if (length <= 16) {
//            this.handicapIndex = diffUsed(handicap, 6);
//            return handicapIndex;
//        } else if (length == 17) {
//            this.handicapIndex = diffUsed(handicap, 7);
//            return handicapIndex;
//        } else if (length == 18) {
//            this.handicapIndex = diffUsed(handicap, 8);
//            return handicapIndex;
//        } else if (length == 19) {
//            this.handicapIndex = diffUsed(handicap, 9);
//            return handicapIndex;
//        } else {
//            this.handicapIndex = diffUsed(handicap, 10);
//            return handicapIndex;
//        }
//    }
//
//    public double diffUsed(List<Double> list, int differentialUsed) {
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i < differentialUsed; i++) {
//            sum += list.get(i);
//        }
//        avg = sum / differentialUsed;
//        return avg * HANDICAP_MULTIPLIER;
//    }



