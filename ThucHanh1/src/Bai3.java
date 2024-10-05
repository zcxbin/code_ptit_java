import java.util.Scanner;

public class Bai3 {
    public static Boolean isPrime(long n) {
        long sqr = (long) Math.sqrt(n);
        for(int i = 2; i <= sqr; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long max = -1;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    while(n % i == 0) {
                        n /= i;
                        max = Math.max(max, i);
                    }
                }
            }
            if(n != 1) max = Math.max(max, n);
            System.out.println(max);
        }
    }
}
