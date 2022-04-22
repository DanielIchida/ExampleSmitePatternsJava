package patterns.bridge;

public class BuildMagic extends GenerateBuild{

        public BuildMagic(Item item){
            this.setItem(item);
        }

    @Override
    public void generate() {
        this.getItem().skill();
    }
}
