package J04006;

import java.util.Scanner;

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sv.chuanHoaNgaySinh();
        sv.in();
    }
}
/*
Nguyen Hoa Binh
D20CQCN04-B
2/2/2002
2
 */