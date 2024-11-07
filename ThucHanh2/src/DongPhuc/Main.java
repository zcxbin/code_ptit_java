package DongPhuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DANGKY.in"));
        Scanner sc3 = new Scanner(new File("TRUYVAN.in"));

        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sv.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        ArrayList<DangKy> dk = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc2.nextLine();
            String[] ss = s.split("\\s+");
            dk.add(new DangKy(ss[0], ss[1]));
        }
        Collections.sort(dk);

        int m = Integer.parseInt(sc3.nextLine());
        for (int i = 0; i < m; i++) {
            String s = sc3.nextLine();
            String[] ss = s.split("\\s+");
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s%n", ss[0].toUpperCase(), ss[1].toUpperCase());
            for(DangKy j : dk){
                if(j.getStudentSize().equals(ss[1])){
                    {
                        for(SinhVien k : sv){
                            if(k.getStudentID().equals(j.getStudentID()) && k.getStudentSex().equals(ss[0])){
                                System.out.println(k);
                            }
                        }
                    }
                }
            }
        }
    }
}
