package patterns.mediator;

public class Killer extends Gods{

    public Killer(IMediator iMediator) {
        this.setIMediator(iMediator);
    }

    @Override
    public void receive(int points) {
        System.out.println("Killer receive attack "+(points + 20));
    }
}
