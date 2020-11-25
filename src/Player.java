public class Player {

    //Attributes
    private String PlayerName;
    private int JerseyNumber;
    private String PlayerWing;
    private Team Team;


    //Constructor
    public Player(){

    }
    public Player(String playerName,int jerseyNumber, Team team){

        this.PlayerName = playerName;
        this.JerseyNumber = jerseyNumber;
        this.Team = team;
    }

    public Player(String playerName,int jerseyNumber,String playerWing, Team team){

        this.PlayerName = playerName;
        this.JerseyNumber = jerseyNumber;
        this.PlayerWing = playerWing;
        this.Team = team;

    }


    //Getters and Setters
    public void setPlayerName(String _name){
        this.PlayerName = _name;
    }

    public String getPlayerName(){
        return this.PlayerName;
    }

    public void setPlayerJerseyNumber(int _number){
        this.JerseyNumber = _number;
    }
    public int getPlayerJerseyNumber(){
        return this.JerseyNumber;
    }

    public String getPlayerWing() {
        return PlayerWing;
    }

    public void setPlayerWing(String playerWing) {
        PlayerWing = playerWing;
    }

    public Team getPlayerTeam() {
        return this.Team;
    }

    public void setPlayerTeam(Team _team) {
         this.Team = _team;
    }

    public void kickBall(){
        System.out.println(this.PlayerName + " is kicking the ball");
    }

    public void dribble(){
        System.out.println(this.PlayerName + " is dribbling the ball");
    }



}
