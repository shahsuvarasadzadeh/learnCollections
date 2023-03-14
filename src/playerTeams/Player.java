package playerTeams;
public class Player {
    String playerId;
    String name;
    String teamId;
    String continent;
    public Player(String playerId, String name, String teamId, String continent) {
        this.playerId = playerId;
        this.name = name;
        this.teamId = teamId;
        this.continent = continent;
    }
    public String getPlayerId() {
        return playerId;
    }
    public String getName() {
        return name;
    }
    public String getTeamId() {
        return teamId;
    }
    public String getContinent() {
        return continent;
    }
}