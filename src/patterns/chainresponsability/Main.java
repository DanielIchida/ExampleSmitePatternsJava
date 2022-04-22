package patterns.chainresponsability;

public class Main {
    public static void main(String[] args) {
        TypeGod hunter = new Hunter();
        TypeGod warrior = new Warrior();
        TypeGod wizard = new Wizard();
        TypeGod noExits = new NoExistsGod();

        hunter.setNext(warrior);
        hunter.setNext(wizard);
        hunter.setNext(noExits);

        hunter.checking("HUNTER");
        hunter.checking("WARRIOR");
        hunter.checking("WIZARD");
        hunter.checking(null);
        hunter.checking("HUNTER");
    }
}
