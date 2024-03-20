package pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa){
        super();
        this.mahasiswa = mahasiswa;

        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK(){
        // TODO IPK THINGS
        int jumlahSKS = 0;
        for (KartuHasilStudi khs: kartuHasilStudi){
            khs.hitungIPS();
            jumlahSKS += khs.getSKS();
            ipk += (khs.getIps() * khs.getSKS());
        }
        ipk /= jumlahSKS;
    }

    public void addKHS(KartuHasilStudi khs){
        kartuHasilStudi.add(khs);
    }

    public void display(){
        hitungIPK();

        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs: kartuHasilStudi){
            System.out.println(khs.display());
        }
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
