package Model.Leaderboard;

import Model.Player.Player;

public class LeaderBoard {
    private Player player;
    private int ranking;

    public LeaderBoard(Player player, int ranking) {
        this.player = player;
        this.ranking = ranking;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "LeaderBoard{" +
                "player=" + player +
                ", ranking=" + ranking +
                '}';
    }
}
