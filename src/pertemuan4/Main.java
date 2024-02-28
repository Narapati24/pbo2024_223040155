package pertemuan4;

public class Main {
    public static void main(String[] args) {
        // contoh main
        Lingkaran l = new Lingkaran(5);

        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l2 = null;
        System.out.println(l1.getJari2());
        if (l2!=null) System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l1 = null;
        l2 = null;
        l3 = null;

        // latihan main
        Student x = new Student();
        Student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println(x.getNrp());
        Student z = new Student();
        z.setNrp("03");
        x = z;
        System.out.println(x.getNrp());
        System.out.println(y.getNrp());

    }
}
