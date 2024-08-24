
import java.util.Scanner;

public class J01018 {

    static boolean checkNextNumber(String s){
        char[] ls;
        ls = s.toCharArray();
        for(int i = 1; i < ls.length; i++){
            if(Math.abs((int)ls[i] - (int)ls[i - 1]) != 2) return false;
        }
        return true;
    }
    static boolean checkSumDigit(String s){
        char[] ls;
        ls = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < ls.length; i++){
            sum += ls[i] - '0';
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            if(checkNextNumber(s) && checkSumDigit(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

/*
3
1353
246864
123435
 */