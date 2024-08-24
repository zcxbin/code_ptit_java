import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int res = 0;
            double sqr = Math.sqrt(n);
            System.out.println(sqr);
            for(int i = 1; i <= sqr; i++){
                if(n % i == 0){
                    if(i % 2 == 0){
                        res++;
                    }
                    if(n / i != i &&(n / i) % 2 == 0){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
