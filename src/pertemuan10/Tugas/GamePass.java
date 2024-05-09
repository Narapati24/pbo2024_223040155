package pertemuan10.Tugas;

public class GamePass extends Game{
    private String key;
    public GamePass(String name, String license, String key){
        super(name, license);
        this.key = key;
    }
    public void getSkin(){
        System.out.println("Skin recived from " + key);
    }
}
