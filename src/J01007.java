import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i <= 92; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        while(t-- > 0){
            long n = sc.nextLong();
            boolean check = false;
            for(int i = 0; i <= 92; i++){
                if(fibo[i] == n){
                    check = true;
                    break;
                }
                if(n < fibo[i])
                    break;
            }
            if(check){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
