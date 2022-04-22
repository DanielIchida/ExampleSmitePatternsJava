package patterns.observer;

public class GoldFury extends Observer{

    private int points = 0;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
        notifications(points);
    }
}
