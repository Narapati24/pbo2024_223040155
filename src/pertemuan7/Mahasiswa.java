package pertemuan7;

public class Mahasiswa {
    private String NRP, nama;

    public Mahasiswa(){
        // TODO Auto Generate
    }

    public Mahasiswa(String nRP, String nama){
        super();
        NRP = nRP;
        this.nama = nama;
    }

    public String display(){
        return "NRP: " + NRP + ", Nama: " + nama;
    }

}
