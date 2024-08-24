package J04006;

public class SinhVien {
    private String maSV = "B20DCCN001";
    private String name;
    private String className;
    private String date;
    private double point;

    public SinhVien(String name, String className, String date, double point) {
        this.maSV = maSV;
        this.name = name;
        this.className = className;
        this.date = date;
        this.point = point;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void chuanHoaNgaySinh(){
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.date = sb.toString();
    }
    public void in(){
        System.out.printf("%s %s %s %s %.2f", this.maSV, this.name, this.className, this.date, this.point);
    }
}
