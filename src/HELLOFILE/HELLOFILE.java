package HELLOFILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/HELLOFILE/Hello.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
