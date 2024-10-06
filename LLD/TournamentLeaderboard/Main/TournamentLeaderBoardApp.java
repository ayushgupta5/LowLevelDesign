package Main;

import Model.Leaderboard.LeaderBoard;
import Model.Match.Match;
import Model.Player.Player;
import Model.Tournament.Tournament;
import Service.Leaderboard.ILeaderBoardService;
import Service.Leaderboard.LeaderBoardService;
import Service.Match.IMatchService;
import Service.Match.MatchService;
import Service.Player.IPlayerService;
import Service.Player.PlayerService;
import Service.ScoreCalculator.IScoreCalculator;
import Service.ScoreCalculator.ScoreCalculator;
import Service.Tournament.ITournamentService;
import Service.Tournament.TournamentService;

import java.time.LocalDateTime;

public class TournamentLeaderBoardApp {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = startDate.plusHours(12);
        Tournament tournament = new Tournament(1, "ICC WorldCup", "Cricket", startDate, endDate);
        Player kohli = new Player(1, "Kohli", "kohli@gmail.com");
        Player rohit = new Player(1, "Rohit", "rohit@gmail.com");
        Match match = new Match(kohli, rohit, 10, 10);
        LeaderBoard leaderBoard = new LeaderBoard(kohli, 1);

        ITournamentService tournamentService = new TournamentService();
        tournamentService.addPlayer(kohli);
        tournamentService.addPlayer(rohit);
        tournamentService.startTournament(tournament);
        tournamentService.endTournament(tournament);

        IPlayerService playerService = new PlayerService();
        playerService.getDetails(kohli);
        playerService.updateScore(kohli);

        IMatchService matchService = new MatchService();
        matchService.playMatch(match);
        matchService.updateScores(match);

        ILeaderBoardService leaderBoardService = new LeaderBoardService();
        leaderBoardService.updateRankings(leaderBoard);
        leaderBoardService.displayLeaderboard(leaderBoard);


        IScoreCalculator scoreCalculator = new ScoreCalculator();
        scoreCalculator.calculateScore(match);
    }
}
