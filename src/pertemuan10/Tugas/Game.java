package pertemuan10.Tugas;

public class Game {
    protected String name;
    protected String license;

    public Game(String name, String license){
        this.name = name;
        this.license = license;
    }

    public void runGame(){
        System.out.println("Game " + name + " Running using license " + license);
    }

    public  void stopGame(){
        System.out.println("Game Stopped");
    }
}
