package DongPhuc;

public class DangKy implements Comparable<DangKy> {
    private String studentID, studentSize;

    public DangKy(String studentID, String studentSize) {
        this.studentID = studentID;
        this.studentSize = studentSize;
    }

    public int compareTo(DangKy o) {
        return this.studentID.compareTo(o.getStudentID());
    }

    public String getStudentID() {
        return studentID;
    }
    public String getStudentSize() {
        return studentSize;
    }
}
