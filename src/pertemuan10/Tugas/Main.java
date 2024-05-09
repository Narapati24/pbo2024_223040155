package pertemuan10.Tugas;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game("NEED FOR SPEED", "19d72dhgsa");
        game1.runGame();
        game1.stopGame();

        GamePass game2 = new GamePass("GOD OF WAR", "64efgsue7se", "SUPERNOVA");
        game2.runGame();
        game2.getSkin();
        game2.stopGame();
    }
}
