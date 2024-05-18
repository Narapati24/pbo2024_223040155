package pertemuan12.inter;

public class InterfaceMain {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("IF111", "123");
        System.out.println("Otentikasi: " + kartu.otetinkasi("123"));
    }
}
