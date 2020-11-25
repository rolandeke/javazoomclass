public class Team {

    private String TeamName;
    private String ManagerName;
    private TeamManager  TeamManager;
    private String League;


    //constructor
    public Team() {

    }

    public Team(String teamName, String managerName, String league) {
        TeamName = teamName;
        ManagerName = managerName;
        League = league;
    }

    public Team(String teamName, TeamManager teamManager, String league){
        this.TeamName = teamName;
        this.TeamManager = teamManager;
        this.League = league;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String managerName) {
        ManagerName = managerName;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String league) {
        League = league;
    }

    public TeamManager getTeamManager() {
        return TeamManager;
    }

    public void setTeamManager(TeamManager teamManager) {
        TeamManager = teamManager;
    }

    public void signPlayer(Player _player){
        System.out.println(TeamName + " has signed " + _player.getPlayerName());
    }
}