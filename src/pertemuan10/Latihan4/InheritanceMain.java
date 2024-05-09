package pertemuan10.Latihan4;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1001", "Narapati Keysa Anandi", "Bandung");
        System.out.println(mhs.getNrp()
                            + "-" + mhs.getNama()
                            + "-" + mhs.getAlamat());
    }
}
