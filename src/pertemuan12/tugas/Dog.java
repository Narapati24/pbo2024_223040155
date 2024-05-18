package pertemuan12.tugas;

public class Dog implements Hewan{
    public Dog(){
        super();
        sound();
    }
    @Override
    public void sound() {
        System.out.println("Wuff wuff");
    }
}
