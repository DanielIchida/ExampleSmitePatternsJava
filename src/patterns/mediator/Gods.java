package patterns.mediator;

public abstract class Gods {

    protected IMediator iMediator;

    public IMediator getIMediator() {
        return iMediator;
    }

    public void setIMediator(IMediator iMediator) {
        this.iMediator = iMediator;
    }

    public void communicate(int points){
        this.getIMediator().attack(points,this);
    }

    public abstract void receive(int points);
}
