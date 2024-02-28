package pertemuan2;

import java.util.Scanner;

public class PersegiPanjang2 {
    double panjang, lebar;

    public double hitungLuas() {return panjang * lebar;}
    public double hitungKeliling() {return 2 * (panjang + lebar);}
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        PersegiPanjang2 p = new PersegiPanjang2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Panjang: ");
        p.panjang = sc.nextDouble();

        System.out.println("Masukan Lebar: ");
        p.lebar = sc.nextDouble();

        p.tampil();
    }
}
