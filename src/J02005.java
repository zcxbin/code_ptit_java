import java.util.*;

public class J02005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[108];
        for (int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; ++i)
            b[i] = sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer> se = new LinkedHashSet<>();
        int i = 0, j = 0;
        while(i < n && j < m){
            if(a[i] == b[j]){
                se.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else j++;
        }
        for(int x : se)
            System.out.print(x + " ");
    }
}