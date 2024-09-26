package J04013;

public class SinhVien {
    private String ID, name, status;
    private double mathPoint, physicalPoint, chemistryPoint, diemVung, sumPoint;

    public SinhVien(String ID, String name, double mathPoint, double physicalPoint, double chemistryPoint) {
        this.ID = ID;
        this.name = name;
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemistryPoint = chemistryPoint;

        if (ID.charAt(2) == '1') diemVung = 0.5;
        else if (ID.charAt(2) == '2') diemVung = 1.0;
        else diemVung = 2.5;

        sumPoint = mathPoint * 2 + physicalPoint + chemistryPoint;
        if(sumPoint + diemVung >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }

    public String toString(){
        String res = String.format("%s %s ", this.ID, this.name);
        if(diemVung == (int) diemVung)
            res += String.format("%.0f ", diemVung);
        else
            res += String.format("%.1f ", diemVung);
        if(sumPoint == (int) sumPoint)
            res += String.format("%.0f ", sumPoint);
        else
            res += String.format("%.1f ", sumPoint);
        res += String.format("%s", this.status);
        return res;
    }

}
