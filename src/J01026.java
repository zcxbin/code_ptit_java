import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            double tmp = Math.sqrt(n);
            if((int) tmp * (int)tmp == n){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
