package Service.Player;

import Model.Player.Player;

public class PlayerService implements IPlayerService {
    @Override
    public void getDetails(Player player) {
        System.out.println("Getting the Details : " + player.toString());
    }

    @Override
    public void updateScore(Player player) {
        System.out.println("Updating the Scores : " + player.toString());
    }
}
