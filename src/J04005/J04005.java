package J04005;

import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(sv.getName() + " " + sv.getDate() + " " + sv.sumPoints());
    }
}


/*
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
 */