import java.util.Scanner;

public class J01014 {
    static boolean checkSNT(long n){
        double sqr = Math.sqrt(n);
        for(int i = 2; i <= sqr; i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            double sqr = Math.sqrt(n);
            long res = 0;
            if(checkSNT(n)){
                res = n;
            }
            else{
                for(int i = 2; i <= sqr; i++){
                    if(n % i == 0){
                        if(checkSNT(i)){
                            res = i;
                        }
                        if(n / i != i && checkSNT(n / i)){
                            res = n / i;
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
