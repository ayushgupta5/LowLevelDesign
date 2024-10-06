package Service.Tournament;

import Model.Player.Player;
import Model.Tournament.Tournament;

public interface ITournamentService {
    void addPlayer(Player player);
    void startTournament(Tournament tournament);
    void endTournament(Tournament tournament);
}
