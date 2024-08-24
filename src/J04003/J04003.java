package J04003;

import java.util.Scanner;

public class J04003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        PhanSo ps = new PhanSo(tuSo, mauSo);
        ps.toiGianPhanSo();
        System.out.println(ps.getX() + "/" + ps.getY());
    }
}
