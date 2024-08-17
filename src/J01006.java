import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fibo = new long[93];
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i <= 92; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        while(t-- > 0){
            System.out.println(fibo[sc.nextInt()]);
        }
    }
}
