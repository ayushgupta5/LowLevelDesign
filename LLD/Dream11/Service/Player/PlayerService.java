package Service.Player;

import Model.Match.Match;

public class PlayerService implements IPlayerService {
    @Override
    public void getPoints(Match match) {
        System.out.println("Getting the Point in the Match : " + match.toString());
    }
}
