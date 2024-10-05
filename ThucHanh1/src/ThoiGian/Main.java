package ThoiGian;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<Student>();
        while (t-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        students.sort(Comparator.comparingLong(Student::getOnlineMinutes).reversed().thenComparing(Student::getName));

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
/*
3
Do Viet Anh
11/12/2021 16:35:00
11/12/2021 17:35:00
Le Tuan Anh
11/12/2021 16:45:00
11/12/2021 18:15:00
Nguyen Tuan Anh
11/12/2021 17:00:00
11/12/2021 19:15:00
 */