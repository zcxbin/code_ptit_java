import java.util.*;

public class J01013
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2000005];
        a[0] = a[1] = 1;
        for(int i = 2; i <= 1420; i++){
            if(a[i] == 0){
                for(int j = i * i; j <= 2000000; j += i){
                    if(a[j] == 0)
                        a[j] = i;
                }
            }
        }
        for(int i = 2; i <= 2000000; i++){
            if(a[i] == 0)
                a[i] = i;
        }

        int t = sc.nextInt();
        long sum = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            while(n > 1) {
                sum += a[n];
                n /= a[n];
            }
        }
        System.out.println(sum);
    }
}