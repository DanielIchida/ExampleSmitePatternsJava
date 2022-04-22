package patterns.builder;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        MagicGod magicGod = new MagicGod();
        player.selectGod(magicGod);
    }

}
