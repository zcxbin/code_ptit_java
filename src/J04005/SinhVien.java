package J04005;

public class SinhVien {
    private String name;
    private String date;
    private double point1, point2, point3;

    public SinhVien(String name, String date, double point1, double point2, double point3) {
        this.name = name;
        this.date = date;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public double getPoint3() {
        return point3;
    }

    public void setPoint3(double point3) {
        this.point3 = point3;
    }

    public double sumPoints() {
        return point1 + point2 + point3;
    }
}
