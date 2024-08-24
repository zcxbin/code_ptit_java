import java.util.Scanner;

public class J01021 {
    static int mod = (int) Math.pow(10, 9) + 7;

    static long binPow(long a, long b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1)
                res = res * a % mod;
            a = a * a % mod;
            b = b / 2;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(binPow(a, b));
        }
    }
}
