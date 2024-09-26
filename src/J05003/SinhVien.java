package J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String maSV, name, className;
    private Date dateOfBirth;
    private double gpa;

    public SinhVien(String maSV, String name, String className, String dateOfBirth, double gpa) throws ParseException {
        this.maSV = maSV;
        this.name = name;
        this.className = className;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.gpa = gpa;
    }

    public String toString(){
        return maSV + " " + name + " " + className + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth) + " " + String.format("%.2f", gpa);
    }
}
