package patterns.observer;

public class Main {
    public static void main(String[] args) {

         GoldFury observer = new GoldFury();

         observer.add(new Gods("Zeus"));
         observer.add(new Gods("Poseidon"));
         observer.add(new Gods("Hades"));

         observer.setPoints(10);

    }
}
