package BentgrassSystem.UserInOut;

import BentgrassSystem.Bentgrass;
import BentgrassSystem.Golfer;
import BentgrassSystem.Results;

import java.sql.SQLOutput;
import java.util.List;

public class UserOutput {
    public static Bentgrass bentgrass = new Bentgrass();

    public static void printCurrentStats(Bentgrass bentgrass) {
        for (Golfer golfer : bentgrass.getMemberList()) {
            System.out.println(golfer.toString());
            System.out.println();
        }
    }

    public static void printAllMembers(List<Golfer> memberList, List<List<Results>> currentSeasonResults) {

        for (Golfer golfer : memberList) {
            System.out.println(printInfo(golfer, currentSeasonResults));
            System.out.println();
        }


    }

    public static String printInfo(Golfer golfer, List<List<Results>> currentSeasonResults) {
        return "UserName: " + golfer.getUserName() + " Current Season | Tournaments played: " + golfer.getTournamentsPlayed() + " Total wins: " + golfer.totalWins(currentSeasonResults);
    }

    public static void powerRank() {

        List<Golfer> powerRankings = bentgrass.getMemberList();


        for (int i = 0; i < powerRankings.size(); i++) {
            {
                for (int j = powerRankings.size() - 1; j > i; j--) {
                    if (powerRankings.get(i).powerAlgo() > powerRankings.get(j).powerAlgo()) {

                        Golfer tmp = powerRankings.get(i);
                        powerRankings.set(i, bentgrass.getMemberList().get(j));
                        powerRankings.set(j, tmp);
                    }

                }
            }
        }
        for (int k = 0; k < bentgrass.getMemberList().size(); k++) {
            if (bentgrass.getMemberList().get(k).getTournamentsPlayed() < 3) {
                powerRankings.remove(bentgrass.getMemberList().get(k));
            }
        }
        for (Golfer golfer : powerRankings) {
            if(golfer.powerAlgo() > 0.01)
            System.out.println(golfer);
        }

    }
}
