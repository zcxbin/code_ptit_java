import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        while(sc.hasNext()){
            String word = sc.next();
            if(word.length() > res.length()){
                res = word;
            }
        }
        sc.close();
        System.out.println(res + " - " + res.length());
    }
}
/*
Lap trinh C++
Cau truc du lieu va giai do
 */