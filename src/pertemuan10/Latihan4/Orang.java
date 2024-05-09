package pertemuan10.Latihan4;

public class Orang {
    protected String nama;
    protected String alamat;

    Orang(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
