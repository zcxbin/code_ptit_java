import java.util.*;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }



        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x : b){
            System.out.print(x + " ");
        }
    }
}
