package Exam5;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV, name, maTeam;
    public SinhVien(String maSV, String name, String maTeam) {
        this.maSV = maSV;
        this.name = name;
        this.maTeam = maTeam;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getName() {
        return name;
    }

    public String getMaTeam() {
        return maTeam;
    }

    public String toString() {
        return maSV + " " + name;
    }
    public int compareTo(SinhVien other) {
        return this.name.compareTo(other.name);
    }
}
