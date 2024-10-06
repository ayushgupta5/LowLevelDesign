package Model.Match;

import Model.Player.Player;

public class Match {
    private Player player1;
    private Player player2;
    int score1;
    int score2;

    public Match(Player player1, Player player2, int score1, int score2) {
        this.player1 = player1;
        this.player2 = player2;
        this.score1 = score1;
        this.score2 = score2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    @Override
    public String toString() {
        return "Match{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", score1=" + score1 +
                ", score2=" + score2 +
                '}';
    }
}
