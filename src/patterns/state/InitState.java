package patterns.state;

public class InitState implements IStateGod {
    @Override
    public void execute() {
        System.out.println("Init Base");
    }
}
