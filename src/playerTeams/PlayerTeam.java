package playerTeams;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
public class PlayerTeam {
    public static Collection<Player> findPlayers(Collection<Player> players, Collection<Team> teams) {
        Set<String> str = teams.stream()
                .filter(team -> team
                        .getName()
                        .equals("USA"))
                .map(Team::getTeamId).collect(Collectors.toSet());
        return players.stream()
                .filter(one -> one
                        .getContinent()
                        .equals("Europe") && str.contains(one.getTeamId()))
                .toList();
    }
}