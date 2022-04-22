package patterns.composite;

public class Main {
    public static void main(String[] args) {
        League premier = new League("PREMIER",null);
        premier.addNode(new Team("Liverpool",premier));
        premier.addNode(new Team("Machester City",premier));
        premier.addNode(new Team("Chelsea",premier));
        premier.showParents();
        premier.show();
    }
}
