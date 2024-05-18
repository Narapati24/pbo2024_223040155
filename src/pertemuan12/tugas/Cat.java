package pertemuan12.tugas;

public class Cat implements Hewan {
    public Cat(){
        super();
        sound();
    }
    @Override
    public void sound() {
        System.out.println("Meaw");
    }
}
