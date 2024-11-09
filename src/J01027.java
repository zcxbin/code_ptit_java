import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J01027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Test " + i + ":");
            LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                hm.put(x, hm.getOrDefault(x, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }

    }
}

