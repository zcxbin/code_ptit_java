import java.util.Scanner;

public class J01009 {
    public static long factorial(int n) {
        long res = 0;
        for(int i = 1; i <= n; i++){
            long tmp = 1;
            for(int j = 1; j <= i; j++){
                tmp *= j;
            }
            res += tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
