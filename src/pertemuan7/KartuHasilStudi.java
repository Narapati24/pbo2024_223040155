package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private final String semester;
    private double ips;
    private int SKS = 0;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester){
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah mataKuliah){
        daftarMataKuliah.add(mataKuliah);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk: daftarMataKuliah){
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS(){
        double index = 0;
        for (MataKuliah mk: daftarMataKuliah){
            index += mk.nilaiIndex() * mk.getSks();
            SKS += mk.getSks();
        }
        ips = index / SKS;
    }

    public double getIps() {
        return ips;
    }

    public int getSKS() {
        return SKS;
    }
}
