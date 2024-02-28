package pertemuan2;

import java.util.Scanner;

public class TotalBanyakN {
    int[] n;

    public void createN(int p){
        Scanner sc = new Scanner(System.in);
        n = new int[p];
        for (int i = 0; n.length > i; i++){
            System.out.println("N ke " + (i + 1));
            n[i] = sc.nextInt();
        }
    }

    public void tampil(){
        int total = 0;
        for (int i = 0; n.length > i; i++){
            total += n[i];
        }
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        TotalBanyakN n = new TotalBanyakN();
        Scanner sc = new Scanner(System.in);

        System.out.println("Jumlah N: ");
        n.createN(sc.nextInt());
        n.tampil();
    }
}
