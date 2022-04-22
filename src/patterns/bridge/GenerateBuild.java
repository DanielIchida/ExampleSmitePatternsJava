package patterns.bridge;

public abstract class GenerateBuild {

    Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public abstract void generate();


}
