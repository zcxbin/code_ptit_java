package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/J07058/MONHOC.in");
        Scanner sc = new Scanner(f);
        LinkedHashSet<Exam> exams = new LinkedHashSet<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Exam exam = new Exam(sc.nextLine(), sc.nextLine(), sc.nextLine());
            exams.add(exam);
        }
        List<Exam> examList = new ArrayList<>(exams);

        examList.sort((e1, e2) -> e1.getMaMon().compareTo(e2.getMaMon()));

        for (Exam exam : examList) {
            exam.print();
        }
    }
}
