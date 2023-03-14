package playerTeams;
public class Team {
    String teamId;
    String continent;
    String name;
    public Team(String teamId, String continent, String name) {
        this.teamId = teamId;
        this.continent = continent;
        this.name = name;
    }
    public String getTeamId() {
        return teamId;
    }
    public String getTeamContinent() {
        return continent;
    }
    public String getName() {
        return name;
    }
}