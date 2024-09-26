package J04013;

import java.util.Scanner;

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(sv.toString());
    }
}
/*
KV2A002
Hoang Thanh Tuan
5
6
5

KV2B123
Ly Thi Thu Ha
8
6.5
7
 */