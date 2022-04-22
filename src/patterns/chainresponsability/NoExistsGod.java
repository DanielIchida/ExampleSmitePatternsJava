package patterns.chainresponsability;

public class NoExistsGod extends TypeGod{
    @Override
    public void checking(String typeGod) {
        if(typeGod == null){
            System.out.println("NO EXIST GODS");
        }else{
            if(this.getNext() != null){
                this.getNext().checking(typeGod);
            }
        }
    }
}
