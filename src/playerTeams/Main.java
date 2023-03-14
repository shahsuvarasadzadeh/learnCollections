package playerTeams;
import java.util.*;
import static playerTeams.PlayerTeam.findPlayers;
public class Main {
    public static void main(String[] args) {
        Collection<Team> teams = new ArrayList<>();
        Collection<Player> players = new ArrayList<>();
        teams.add(new Team("1", "Asia", "USA"));
        teams.add(new Team("2", "Africa", "USA"));
        teams.add(new Team("3", "Europe", "USA"));
        players.add(new Player("1", "Jinjuji", "3", "Asia"));
        players.add(new Player("2", "Nokammumu", "3", "Africa"));
        players.add(new Player("3", "Shahsuvar", "3", "Europe"));
        players.add(new Player("3", "Rahaddin", "3", "Europe"));
        Collection<Player> team = findPlayers(players, teams);
        for (Player t : team) {
            System.out.println(t.getTeamId()
                    +"-"+t.getContinent()+"-"+t.getName()+"-"+t.getPlayerId());
        }
    }
}