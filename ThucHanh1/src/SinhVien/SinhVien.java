package SinhVien;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, name, className, email, phoneNumber;

    public SinhVien(String maSV, String name, String className, String email, String phoneNumber) {
        this.maSV = maSV;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return String.format("%s %s %s %s 0%s", maSV, name, className, email, phoneNumber);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.className.equals(o.className)){
            return this.maSV.compareTo(o.maSV);
        }
        return this.className.compareTo(o.className);
    }
}
