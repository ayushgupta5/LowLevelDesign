package Service.Match;

import Model.Match.Match;

public class MatchService implements IMatchService {
    @Override
    public void scheduleMatch(Match match) {
        System.out.println("Scheduling the Match : " +match.toString());
    }

    @Override
    public void updateScore(Match match) {
        System.out.println("Updating the Score of the Match : " +match);
    }
}
