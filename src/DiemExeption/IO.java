package DiemExeption;

import java.util.Scanner;

public class IO {
    public static double VaoRa() throws DiemException {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if(x < 0 || x > 10)
            throw new DiemException("Nhap diem ngoai le");
        return x;
    }
}
