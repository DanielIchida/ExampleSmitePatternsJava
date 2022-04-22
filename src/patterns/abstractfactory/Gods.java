package patterns.abstractfactory;

public class Gods {

    private final String name;

    public Gods(String name) {
        this.name = name;
    }

    public void createItems(Items items){
        System.out.println("Gods "+name);
        items.createAttacks().forEach(it ->{
             it.damage(10);
        });
        items.createDefends().forEach(it -> {
             it.protection(30);
        });
    }
}
