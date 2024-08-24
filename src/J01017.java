
import java.util.Scanner;

public class J01017 {

    static boolean checkNextNumber(String s){
        char[] ls;
        ls = s.toCharArray();
        for(int i = 1; i < ls.length; i++){
            if(Math.abs((int)ls[i] - (int)ls[i - 1]) != 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            if(checkNextNumber(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
/*

Input

Output

3
123212
5654345676
10233211123
 */