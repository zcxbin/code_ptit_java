package HuongDanDoAn;

public class GiangVien {
    private String lecturerName, studentID, projectTitle;

    public GiangVien(String lecturerName, String studentID, String projectTitle) {
        this.lecturerName = lecturerName;
        this.studentID = studentID;
        this.projectTitle = projectTitle;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return lecturerName + " " + projectTitle;
    }
}
