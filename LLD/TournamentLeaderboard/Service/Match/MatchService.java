package Service.Match;

import Model.Match.Match;

public class MatchService implements  IMatchService {

    @Override
    public void playMatch(Match match) {
        System.out.println("Playing the Match : " + match.toString());
    }

    @Override
    public void updateScores(Match match) {
        System.out.println("Updating the Scores : " + match.toString());
    }
}
