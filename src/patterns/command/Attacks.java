package patterns.command;

public class Attacks {

    public void execute(String attack){
        if(attack.compareTo("PHYSICAL") == 0){
           System.out.println("Attack Physical");
        }else if(attack.compareTo("MAGIC") == 0){
            System.out.println("Attack Magic");
        }else if(attack.compareTo("LONG_DISTANCE") == 0){
            System.out.println("Attack Long Distance");
        }
    }

}
