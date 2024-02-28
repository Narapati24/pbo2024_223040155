package pertemuan2;

import java.util.Scanner;

public class IndeksNilaiMatkul {
    int nilai;
    public String checkIndex(){
        String index;
        if(nilai > 100){ index = "Nilai di luar jangkauan"; }
        else if (nilai > 80) { index = "A"; }
        else if (nilai > 75) { index = "AB"; }
        else if (nilai > 55) { index = "B"; }
        else if (nilai > 50) { index = "BC"; }
        else if (nilai > 40) { index = "C"; }
        else if (nilai > 20) { index = "D"; }
        else { index = "E"; }
        return index;
    }

    public void tampil(){System.out.println("Indexnya: " + checkIndex());}

    public static void main(String[] args) {
        IndeksNilaiMatkul p = new IndeksNilaiMatkul();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Nilai: ");
        p.nilai = sc.nextInt();

        p.tampil();
    }

}
