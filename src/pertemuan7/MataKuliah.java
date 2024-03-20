package pertemuan7;

public class MataKuliah {
    private String kode, nama, index;
    private int sks;
    public MataKuliah(String kode, String nama, String index, int sks){
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public double nilaiIndex(){
        // berdasarkan index matakuliah
        // A=4, AB=3.5 B=3, BC=2.5, C=2, D=1, E=0
        switch (index){
            case "A" -> {
                return 4;
            }
            case "AB" -> {
                return 3.5;
            }
            case "B" -> {
                return 3;
            }
            case "BC" -> {
                return 2.5;
            }
            case "C" -> {
                return 2;
            }
            case "D" -> {
                return 1;
            }
            case "E" -> {
                return 0;
            }
        }
        return 0;
    }

    public String display(){
        return kode + " - " + nama + " - " + index;
    }
}
