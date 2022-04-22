package patterns.state;

public class Main {
    public static void main(String[] args) {

        StateGod stateGod = new StateGod();
        stateGod.execute();

        stateGod.setIStateGod(new Damage());
        stateGod.execute();

    }
}
