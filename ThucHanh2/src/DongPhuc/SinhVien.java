package DongPhuc;

public class SinhVien {
    private String studentID, studentName, studentClassname, studentEmail, studentPhoneNumber, studentSex;
    public SinhVien(String studentID, String studentName, String studentClassname, String studentEmail, String studentPhoneNumber, String studentSex) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentClassname = studentClassname;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentEmail = studentEmail;
        this.studentSex = studentSex;
    }
    public String getStudentSex(){
        return studentSex;
    }
    public String getStudentID(){
        return studentID;
    }

    public String toString(){
        return studentID + " " + studentName + " " + studentClassname + " " + studentEmail + " " + studentPhoneNumber;
    }

}
