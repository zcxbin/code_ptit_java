package J04004;

import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo1= sc.nextLong();
        long mauSo1= sc.nextLong();
        long tuSo2= sc.nextLong();
        long mauSo2= sc.nextLong();
        PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
        PhanSo ps2 = new PhanSo(tuSo2, mauSo2);
        PhanSo ps3 = new PhanSo(1, 1);
        ps3.congPhanSo(ps1, ps2);
        ps3.rutGonPhanSo();
        System.out.println(ps3.getTuSo() + "/" + ps3.getMauSo());
    }
}
