import java.io.*;
import java.util.*;

public class J07015 {

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public static <List> void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> arrList = (ArrayList<Integer>) ois.readObject();

        Map<Integer, Integer> primeCount = new HashMap<>();

        for (int num : arrList) {
            if (isPrime(num)) {
                primeCount.put(num, primeCount.getOrDefault(num, 0) + 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> primeNumbers = new ArrayList<>(primeCount.entrySet());
        primeNumbers.sort(Map.Entry.comparingByKey());
        for(Map.Entry<Integer, Integer> entry : primeNumbers){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
