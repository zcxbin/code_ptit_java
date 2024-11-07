import java.io.*;
import java.util.*;

public class J07029 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> arrList = (ArrayList<Integer>) ois.readObject();
        ois.close();
        fis.close();

        Map<Integer, Integer> primeCount = new HashMap<>();

        for (int num : arrList) {
            if (isPrime(num)) {
                primeCount.put(num, primeCount.getOrDefault(num, 0) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> primeList = new ArrayList<>(primeCount.entrySet());
        primeList.sort((a, b) -> b.getKey() - a.getKey());

        int dem = 0;
        for (Map.Entry<Integer, Integer> entry : primeList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            dem++;
            if (dem == 10) break;
        }

    }
}
