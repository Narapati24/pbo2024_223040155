package pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
        MataKuliah mk4 = new MataKuliah("004", "Praktikum Multimedia", "AB", 2);
        MataKuliah mk5 = new MataKuliah("005", "Praktikum Pemrograman", "A", 2);

        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        KartuHasilStudi khs2 = new KartuHasilStudi("20231");
        khs2.addMataKuliah(mk4);
        khs2.addMataKuliah(mk5);

        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.addKHS(khs2);
        transkrip.display();
    }
}
