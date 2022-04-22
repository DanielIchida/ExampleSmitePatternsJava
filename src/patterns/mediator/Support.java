package patterns.mediator;

public class Support extends Gods{

    public Support(IMediator iMediator) {
        this.setIMediator(iMediator);
    }

    @Override
    public void receive(int points) {
        System.out.println("Support receive attack "+(points + 11));
    }
}
