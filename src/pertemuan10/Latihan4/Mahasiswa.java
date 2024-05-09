package pertemuan10.Latihan4;

public class Mahasiswa extends Orang {
    private String nrp;
    Mahasiswa(String nrp, String nama, String alamat){
        super(nama, alamat);
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }
}
