import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
                for(int i = 2; i <= Math.sqrt(n); i++){
                    while(n % i == 0){
                        n /= i;
                        hm.put(i, hm.getOrDefault(i, 0) + 1);
                    }
                }
                if(n != 1){
                    hm.put(n, hm.getOrDefault(n, 0) + 1);
                }
            System.out.print("Test " + test++ + ": ");
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                System.out.print(entry.getKey() + "(" + entry.getValue() + ") ");
            }
            System.out.println();
        }
    }
}
