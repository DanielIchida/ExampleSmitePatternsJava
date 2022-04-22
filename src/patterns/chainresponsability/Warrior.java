package patterns.chainresponsability;

public class Warrior extends TypeGod{

    @Override
    public void checking(String typeGod) {
        if((typeGod != null) && typeGod.equalsIgnoreCase("WARRIOR")){
           System.out.println("SELECT: "+typeGod);
        }else{
            if(this.getNext() != null){
               this.getNext().checking(typeGod);
            }
        }
    }
}
