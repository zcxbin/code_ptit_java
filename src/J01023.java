import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class J01023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            set.add(sc.nextInt());
        }
        for(Integer i : set){
            System.out.print(i + " ");
        }
    }
}
