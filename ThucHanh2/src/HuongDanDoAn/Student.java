package HuongDanDoAn;

public class Student implements Comparable<Student> {
    private String studentID, studentName, className, email, phone;

    public Student(String studentID, String studentName, String className, String email, String phone) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.className = className;
        this.email = email;
        this.phone = phone;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }
}
