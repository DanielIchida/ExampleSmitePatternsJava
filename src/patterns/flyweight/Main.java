package patterns.flyweight;

public class Main {
    public static void main(String[] args) {
        FactoryGods factoryGods = new FactoryGods();
        IGods zeus = factoryGods.getGods("ZEUS",TypeGods.WIZARD);
        IGods apolo = factoryGods.getGods("APOLO",TypeGods.HUNTER);
        IGods ymir = factoryGods.getGods("YMIR",TypeGods.GUARDIAN);
        IGods zeu1 = factoryGods.getGods("ZEUS",TypeGods.WIZARD);

        System.out.println();

        zeus.skill(100,100);
        apolo.skill(300,300);
        ymir.skill(100,100);

    }
}
