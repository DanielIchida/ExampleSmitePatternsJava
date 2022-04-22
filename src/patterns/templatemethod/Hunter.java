package patterns.templatemethod;

public class Hunter extends God {
    @Override
    public int damage(int point) {
        return point * 4;
    }

    @Override
    public int level(int numberLevel) {
        return numberLevel;
    }

    @Override
    public int improvement(int point) {
        return point + 30;
    }
}
