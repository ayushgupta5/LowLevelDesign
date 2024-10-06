package Service.Team;

import Model.Player.Player;
import Model.Team.Team;

public class TeamService implements ITeamService {
    @Override
    public void addPlayer(Player player) {
        System.out.println("Adding the Player : " +player.toString());
    }

    @Override
    public void removePlayer(Player player) {
        System.out.println("Removing the Player : " +player.toString());
    }

    @Override
    public void validateTeam(Team team) {
        System.out.println("Validating the Team : " + team.toString());
    }
}
