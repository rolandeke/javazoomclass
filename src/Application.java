import java.util.Scanner;

public class Application    {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Application Started");

        System.out.println("Welcome to my football game");

        System.out.println("Press: ");
        System.out.println("1: To Create a Team\n2: To Create a Player\n3: To Create a new Manager");
        int userOpt = scanner.nextInt();
        scanner.nextLine();

        switch(userOpt){
            case 1:
                createTeam();
                break;
            case 2:
                createPlayer(createTeam());
                break;
            case 3:
                createManager();
                break;
            default:
                System.out.println("Invalid Option. Try Again");
        }

//        TeamManager blackPoolManager = new TeamManager("Blackpool Manager");
//
//        Team barca = new Team("Barcelona","Klopp","La Liga");
//        Team juve = new Team("Juventus","Kallon","La Liga");
//        Team manchester = new Team("Manchester United","Mourinho","EPL");
//        Team leoneStar = new Team("Mighty Leone Star","Manager","Africa League");
//        Team blackpool = new Team("Mighty Black River",blackPoolManager,"Africa League");
//
//
//        TeamManager manager = blackpool.getTeamManager();
//        System.out.println(manager.getManagerName());
//
//
//        System.out.println("Team Details");
//        System.out.println(manchester.getTeamName());
//        System.out.println(manchester.getManagerName());
//        System.out.println(manchester.getLeague());



//        Player messi = new Player("Messi",10,barca);
//        Player ronaldo = new Player("Ronaldo",7, juve);
//        Player bruno = new Player("Bruno",6,"Attack",manchester);
//
//        Player neymar = new Player();
//        neymar.setPlayerName("Neymar");
//        neymar.setPlayerJerseyNumber(8);
//        neymar.setPlayerTeam(barca);

//        String playerName = neymar.getPlayerName();
//
//        int playerNumber = neymar.getPlayerJerseyNumber();

//         Team playerTeam = messi.getPlayerTeam();
//        System.out.println("Messi's Team Detail");
//         System.out.println(playerTeam.getTeamName());
//         System.out.println(playerTeam.getManagerName());
//         System.out.println(playerTeam.getLeague());

//        System.out.println("Neymar Details");
//        System.out.println("Player Name: " + playerName);
//        System.out.println("Player Number: " + playerNumber + "\n\n");
//
//        System.out.println("Messi Details");
//        System.out.println(messi.getPlayerName());
//        System.out.println(messi.getPlayerJerseyNumber());
//        messi.kickBall();
//        messi.dribble();
//
//        neymar.dribble();;
//        neymar.kickBall();

//        Player kaiKamara = new Player("Kai Kamara",6,"Forward Attack",manchester);
//
//
//        System.out.println("\n\n\nKAI KAMARA DETAILS");
//        System.out.println(kaiKamara.getPlayerName());
//        System.out.println(kaiKamara.getPlayerJerseyNumber());
//        System.out.println(kaiKamara.getPlayerWing());
//
//        leoneStar.signPlayer(kaiKamara);

    }


    public static Team createTeam(){
        String teamName,league,managerName;

        System.out.println("You are now creating a new Team\nEnter all the necessary information below");
        System.out.print("TeamName: ");
        teamName = scanner.nextLine();
        System.out.print("League: ");
        league = scanner.nextLine();

        System.out.print("Manager Name: ");
        managerName = scanner.nextLine();

        Team userTeam = new Team(teamName,new TeamManager(managerName),league);
        return userTeam;
    }

    public static void createPlayer(Team _team){
        String name,wing;
        int jNumber;

        System.out.println("You are now creating a new Player\nEnter all the necessary information below");
        System.out.print("PlayerName: ");
        name = scanner.nextLine();
        System.out.print("Jersey Number: ");
        jNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Player Wing: ");
        wing = scanner.nextLine();

       Player userPlayer = new Player(name,jNumber,wing,_team);


        System.out.println("New Player Details");
        System.out.println("Player Name: " + userPlayer.getPlayerName());
        System.out.println("Player Jersey Number: " + userPlayer.getPlayerJerseyNumber());
        System.out.println("Player Wing: " + userPlayer.getPlayerWing());
        System.out.println("Player Team Name: " + userPlayer.getPlayerTeam().getTeamName());
        System.out.println("Player Team League: " + userPlayer.getPlayerTeam().getLeague());
    }

    public static void createManager(){
        String name;


        System.out.println("You are now creating a new Manager\nEnter all the necessary information below");
        System.out.print("Manager: ");
        name = scanner.nextLine();

        TeamManager userManager = new TeamManager(name);
    }
}
