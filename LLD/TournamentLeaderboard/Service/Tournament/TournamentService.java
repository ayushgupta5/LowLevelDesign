package Service.Tournament;

import Model.Player.Player;
import Model.Tournament.Tournament;

public class TournamentService implements ITournamentService {
    @Override
    public void addPlayer(Player player) {
        System.out.println("Adding the Player in the Tournament : " +player.toString());
    }

    @Override
    public void startTournament(Tournament tournament) {
        System.out.println("Starting the Tournament : " +tournament.toString());
    }

    @Override
    public void endTournament(Tournament tournament) {
        System.out.println("Ending the Tournament : " +tournament.toString());
    }
}
