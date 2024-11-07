import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(sc.hasNext()){
            int x = Integer.parseInt(sc.next());
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<Integer, Integer> entry : list){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
