package J04007;

import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        e.print();
    }
}

/*
Nguyen Van Hoa
Nam
22/11/1982
Mo Lao-Ha Dong-Ha Noi
8333123456
31/12/2013
 */