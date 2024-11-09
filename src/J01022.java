import java.util.Scanner;

public class J01022 {
    static long[] f =  new long[94];
    public static int Try(int n, long k){
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (k <= f[n - 2]) return Try(n - 2, k);
        else return Try(n - 1, k - f[n - 2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f[1] = f[2] = 1;
        for(int i = 3; i < 94; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
