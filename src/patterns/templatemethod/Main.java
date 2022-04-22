package patterns.templatemethod;

public class Main {
    public static void main(String[] args) {
         Support support = new Support();
         Hunter hunter = new Hunter();

         int attackSupport = support.attack(50,4);
         int attackHunter = hunter.attack(70,10);

         System.out.println(attackSupport);
         System.out.println(attackHunter);
    }
}
