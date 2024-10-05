package SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> sv = new ArrayList<SinhVien>();
        while(sc.hasNext()){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();
            String phoneNumber = sc.nextLine();
            sv.add(new SinhVien(id, name, className, email, phoneNumber));
            if(!sc.hasNextLine())
                break;
        }
        sv.sort((o1, o2) -> o1.compareTo(o2));
        for(SinhVien s : sv){
            System.out.println(s.toString());
        }
    }
}
/*
B21DCCN123
Tran Van Toan
D21CQCN01-B
toantv@gmail.com
987654321
B21DCCN111
Ly Van Binh
D21CQCN01-B
binhlv@gmail.com
978652142
B21DCAT661
Hoang Tam Anh
D21CQAT01-B
anhht@gmail.com
966554321
 */