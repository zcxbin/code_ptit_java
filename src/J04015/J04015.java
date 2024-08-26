package J04015;

import java.util.Scanner;

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
        teacher.print();
    }
}
