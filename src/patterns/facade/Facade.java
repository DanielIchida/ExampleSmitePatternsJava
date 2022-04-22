package patterns.facade;

public class Facade {

    private final Authentication authentication;
    private final TypeGame typeGame;
    private final SelectTeams selectTeams;
    private final GameStart gameStart;

    public Facade(){
        authentication = new Authentication();
        typeGame = new TypeGame();
        selectTeams = new SelectTeams();
        gameStart = new GameStart();
    }

    public void play(){
        authentication.login();
        typeGame.jungle();
        selectTeams.players(6);
        gameStart.init();
    }

    public void stop(){
        gameStart.exit();
        authentication.logout();
    }

}
