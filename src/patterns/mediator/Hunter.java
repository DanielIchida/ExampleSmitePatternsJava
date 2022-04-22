package patterns.mediator;

public class Hunter extends Gods {

    public Hunter(IMediator iMediator){
        this.setIMediator(iMediator);
    }

    @Override
    public void receive(int points) {
       System.out.println("Hunter receive attack "+(points + 11));
    }
}
