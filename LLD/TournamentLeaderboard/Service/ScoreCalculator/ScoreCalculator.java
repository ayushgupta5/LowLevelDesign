package Service.ScoreCalculator;

import Model.Match.Match;

public class ScoreCalculator implements IScoreCalculator{
    @Override
    public void calculateScore(Match match) {
        System.out.println("Calculating the Score of the Given Match  : " +match.toString());
    }
}
