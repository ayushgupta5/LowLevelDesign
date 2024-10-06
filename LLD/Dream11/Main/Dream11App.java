package Main;

import Model.Contest.Contest;
import Model.Match.Match;
import Model.Payment.Payment;
import Model.Player.Player;
import Model.Team.Team;
import Model.User.User;
import Service.Contest.ContestService;
import Service.Contest.IContestService;
import Service.Match.IMatchService;
import Service.Match.MatchService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentStrategy;
import Service.Payment.PaymentService;
import Service.Payment.UPI;
import Service.Player.IPlayerService;
import Service.Player.PlayerService;
import Service.Team.ITeamService;
import Service.Team.TeamService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class Dream11App{
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "password", "123");
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(1);
        Match match = new Match(1, "Cricket", startTime, endTime);
        Contest contest = new Contest(1, match, 100.00, 100, "Cricket");
        Payment payment = new Payment(1, 100.00, "CreditCard", user);
        Player player = new Player(1, "Kohli", "Batsman", 9);
        Team team = new Team(1, user);

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);
        userService.addFunds();
        userService.withdrawFunds();

        IContestService contestService = new ContestService();
        contestService.createContest(contest);
        contestService.joinContest(contest);
        contestService.calculateLeaderboard(contest);

        ITeamService teamService = new TeamService();
        teamService.addPlayer(player);
        teamService.removePlayer(player);
        teamService.validateTeam(team);

        IPlayerService playerService = new PlayerService();
        playerService.getPoints(match);

        IMatchService matchService = new MatchService();
        matchService.scheduleMatch(match);
        matchService.updateScore(match);


        PaymentStrategy paymentStrategy;
        if(payment.getTransactionType() == "UPI") {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentStrategy.processPayment(payment);

        userService.logout(user);
    }
}
