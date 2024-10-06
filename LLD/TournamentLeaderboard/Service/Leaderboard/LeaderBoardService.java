package Service.Leaderboard;

import Model.Leaderboard.LeaderBoard;

public class LeaderBoardService implements ILeaderBoardService {
    @Override
    public void updateRankings(LeaderBoard leaderBoard) {
        System.out.println("Update the Ranking in the Tournament : " +leaderBoard.toString());
    }

    @Override
    public void displayLeaderboard(LeaderBoard leaderBoard) {
        System.out.println("Display the Leaderboard : " +leaderBoard.toString());
    }
}
