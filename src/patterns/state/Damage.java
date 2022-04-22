package patterns.state;

public class Damage implements IStateGod {
    @Override
    public void execute() {
        System.out.println("Damage");
    }
}
