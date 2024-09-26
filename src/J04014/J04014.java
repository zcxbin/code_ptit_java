package J04014;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PhanSo ps1 = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo ps2 = new PhanSo(sc.nextLong(), sc.nextLong());

            PhanSo ps3 = ps1.congPhanSo(ps2);
            ps3.rutGonPhanSo();
            PhanSo ps4 = ps3.nhanPhanSo(ps1).nhanPhanSo(ps2);
            ps4.rutGonPhanSo();

            // In kết quả
            ps3.print();
            ps4.print();
            System.out.println();
        }
    }
}
