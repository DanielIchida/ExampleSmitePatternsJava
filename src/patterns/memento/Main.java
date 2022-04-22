package patterns.memento;

public class Main {
    public static void main(String[] args) {
         Health health = new Health(100,0);
         Caretaker caretaker = new Caretaker();
         caretaker.setMemento(health.createMemento());
         System.out.println("Init Health -> "+health.getDamage()+ " - "+health.getTheftLife());
         health.setDamage(70);
         health.setTheftLife(5);
         System.out.println("Receive Health -> "+health.getDamage()+ " - "+health.getTheftLife());
         health.setMemento(caretaker.getMemento());
         System.out.println("Init Health -> "+health.getDamage()+ " - "+health.getTheftLife());


    }
}
