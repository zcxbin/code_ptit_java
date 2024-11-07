package HuongDanDoAn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<Student> students = new ArrayList<>();

        while (sc1.hasNextLine()) {
            String studentID = sc1.nextLine().trim();
            String studentName = sc1.nextLine().trim();
            String studentClassname = sc1.nextLine().trim();
            String studentEmail = sc1.nextLine().trim();
            String studentPhoneNumber = sc1.nextLine().trim();
            students.add(new Student(studentID, studentName, studentClassname, studentEmail, "0" + studentPhoneNumber));
        }

        int n = Integer.parseInt(sc2.nextLine().trim());
        ArrayList<GiangVien> lecturers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String lecturerInfo = sc2.nextLine().trim();
            String lecturerName = lecturerInfo.substring(0, lecturerInfo.length() - 2).trim();
            int courseQuantity = Integer.parseInt(lecturerInfo.substring(lecturerInfo.length() - 1));

            for (int j = 0; j < courseQuantity; j++) {
                String projectInfo = sc2.nextLine().trim();
                String studentID = projectInfo.substring(0, 10).trim();
                String projectTitle = projectInfo.substring(10).trim();
                lecturers.add(new GiangVien(lecturerName, studentID, projectTitle));
            }
        }
        students.sort(Comparator.comparing(Student::getStudentID));

        for (Student student : students) {
            for (GiangVien giangVien : lecturers) {
                if (student.getStudentID().equals(giangVien.getStudentID())) {
                    System.out.println(student + " " + giangVien + " " + student.getPhone());
                    break;
                }
            }
        }
    }
}
