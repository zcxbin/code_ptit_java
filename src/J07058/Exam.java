package J07058;

public class Exam {
    private String ID, Name, ExamFormat;

    public Exam(String ID, String name, String examFormat) {
        this.ID = ID;
        this.Name = name;
        this.ExamFormat = examFormat;
    }
    public String getMaMon() {
        return ID;
    }
    public void print(){
        System.out.println(ID + " " + Name + " " + ExamFormat);
    }
}
