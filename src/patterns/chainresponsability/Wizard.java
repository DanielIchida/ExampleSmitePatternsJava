package patterns.chainresponsability;

public class Wizard extends TypeGod{
    @Override
    public void checking(String typeGod) {
        if((typeGod != null) && typeGod.equalsIgnoreCase("WIZARD")){
            System.out.println("SELECT: "+typeGod);
        }else{
            if(this.getNext() != null){
                this.getNext().checking(typeGod);
            }
        }
    }
}
