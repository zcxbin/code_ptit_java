package DiemTrungBinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mark[] marks = new Mark[n];
        for (int i = 0; i < n; i++) {
            marks[i] = new Mark(sc.nextDouble());
        }
        ListMark listMarks = new ListMark(marks);
        System.out.println(listMarks.toString());
    }
}


/*
6
6.75 8 9.2 7.25 7.75 6.75
 */