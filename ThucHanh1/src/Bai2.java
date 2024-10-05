import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            int tmpInt = 0;
            StringBuilder tmpStr = new StringBuilder();
            for(char c : arr) {
                if(Character.isDigit(c))
                    tmpInt = tmpInt + c - '0';
                else
                    tmpStr.append(c);
            }
            System.out.println(tmpStr.toString() + tmpInt);
        }
    }
}

/*
2
AC2BEW3
ACCBA10D2EW304134
 */