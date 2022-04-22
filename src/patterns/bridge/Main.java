package patterns.bridge;

public class Main {
    public static void main(String[] args) {
        BuildMagic buildMagic = new BuildMagic(new ExplosionMagic(30,20));
        buildMagic.generate();

        buildMagic.setItem(new LifeTheft(10,50));
        buildMagic.generate();

        BuildKiller buildKiller = new BuildKiller(new LifeTheft(50,10));
        buildKiller.generate();
    }
}
