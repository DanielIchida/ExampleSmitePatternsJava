package patterns.templatemethod;

public class Support extends God{
    @Override
    public int damage(int point) {
        return point * 2;
    }

    @Override
    public int level(int numberLevel) {
        return numberLevel;
    }

    @Override
    public int improvement(int point) {
        return point + 10;
    }
}
