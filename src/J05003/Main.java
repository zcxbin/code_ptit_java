package J05003;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedList<SinhVien> sv = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String maSV = "";
            if(i + 1 < 10)
                maSV = "B20DCCN00" + String.valueOf(i + 1);
            else{
                maSV = "B20DCCN0" + String.valueOf(i + 1);
            }
            sv.add(new SinhVien(maSV, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for (SinhVien s : sv) {
            System.out.println(s.toString());
        }
    }
}
/*
10
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19

 */