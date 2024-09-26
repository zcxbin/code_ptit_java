package J07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/J07002/DATA.in"));
        long sum = 0;
        while(sc.hasNextLine()) {
            String number = sc.next();
            try{
                int num = Integer.parseInt(number);
                sum += num;
            }catch (NumberFormatException e) {
            }
        }
        System.out.println(sum);
    }
}
