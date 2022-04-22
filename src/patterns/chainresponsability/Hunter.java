package patterns.chainresponsability;

public class Hunter extends TypeGod{
    @Override
    public void checking(String typeGod) {
        if((typeGod != null) && typeGod.equalsIgnoreCase("HUNTER")){
            System.out.println("SELECT: "+typeGod);
        }else{
            if(this.getNext() != null){
                this.getNext().checking(typeGod);
            }
        }
    }
}
