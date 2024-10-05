import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] ss = new String[n];
        for(int i = 0; i < n; i++){
            ss[i] = sc.nextLine();
        }

        boolean flag = true;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(i != j){
                    int k = circleString(ss[i], ss[j]);
                    if(k == -1){
                        flag = false;
                    }
                    else
                        cnt += k;
                }
            }
            min = Math.min(min, cnt);
        }
        if(!flag){
            System.out.println("-1");
        }
        else
            System.out.println(min);
    }
    public static int circleString(String a, String b){
        char[] c = b.toCharArray();
        char[] d = a.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(!Arrays.equals(c, d)){
            return -1;
        }
        int cnt = 0;
        while(!b.equals(a))
        {
            b = b.substring(1) + b.charAt(0);
            cnt++;
        }
        return cnt;
    }
}

/*
4
xzzwo
zwoxz
zzwox
xzzwo
 */