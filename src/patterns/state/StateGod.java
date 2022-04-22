package patterns.state;

public class StateGod {

    private IStateGod iStateGod;

    public StateGod(){
        this.iStateGod = new InitState();
    }

    public void setIStateGod(IStateGod iStateGod) {
        this.iStateGod = iStateGod;
    }

    public void execute(){
        this.iStateGod.execute();
    }
}
