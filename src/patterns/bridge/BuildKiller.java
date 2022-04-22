package patterns.bridge;

public class BuildKiller extends GenerateBuild{

    public BuildKiller(Item item){
        this.setItem(item);
    }

    @Override
    public void generate() {
        this.getItem().skill();
    }
}
