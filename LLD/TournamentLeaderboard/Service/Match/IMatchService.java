package Service.Match;

import Model.Match.Match;

public interface IMatchService {
    void playMatch(Match match);
    void updateScores(Match match);
}
