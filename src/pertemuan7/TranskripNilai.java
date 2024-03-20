package pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private final Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private final Mahasiswa mahasiswa;

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
}
