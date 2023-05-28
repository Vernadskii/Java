/**
 * Our football team has finished the championship.
 * <p>
 * Our team's match results are recorded in a collection of strings. Each match is represented by
 * a string in the format "x:y", where x is our team's score and y is our opponents score.
 * <p>
 * For example: ["3:1", "2:2", "0:1", ...]
 * <p>
 * Points are awarded for each match as follows:
 * <p>
 * if x > y: 3 points (win)
 * if x < y: 0 points (loss)
 * if x = y: 1 point (tie)
 * We need to write a function that takes this collection and returns the number of points
 * our team (x) got in the championship by the rules given above.
 * <p>
 * Notes:
 * <p>
 * our team always plays 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
 */


class Pair {
    private final int ourTeam;
    private final int opponentTeam;

    public Pair(String pairText){
        ourTeam = Integer.parseInt(pairText.split(":", 2)[0]);
        opponentTeam = Integer.parseInt(pairText.split(":", 2)[1]);
    }

    public int getPoints(){
        int diff = ourTeam - opponentTeam;
        return diff > 0 ? 3 : diff == 0 ? 1 : 0;
    }

}

public class TotalPoints {

    public static int points(String[] games) {
        int result = 0;
        for (String pair : games)
        {
            Pair pairObj = new Pair(pair);
            result += pairObj.getPoints();
        }
        return result;
    }
}
