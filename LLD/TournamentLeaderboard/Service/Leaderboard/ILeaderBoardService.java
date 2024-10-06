package Service.Leaderboard;

import Model.Leaderboard.LeaderBoard;

public interface ILeaderBoardService {
    void updateRankings(LeaderBoard leaderBoard);
    void displayLeaderboard(LeaderBoard leaderBoard);
}
