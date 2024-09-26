package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/J07022/DATA.in"));
        long sum = 0;
        LinkedList<String> list = new LinkedList<>();
        while(sc.hasNext()) {
            String number = sc.next();
            try{
                int num = Integer.parseInt(number);
            }catch (NumberFormatException e) {
                list.addLast(number);
            }
        }
        list.sort(String.CASE_INSENSITIVE_ORDER);
        for(String s : list) {
            System.out.print(s + " ");
        }
    }
}
