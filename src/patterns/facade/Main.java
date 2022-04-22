package patterns.facade;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.play();
        System.out.println("---------");
        facade.stop();

    }
}
