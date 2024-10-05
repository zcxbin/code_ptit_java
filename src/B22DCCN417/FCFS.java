package B22DCCN417;

import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = sc.nextInt();
        System.out.println(fcfs(p1, p2, p3));
    }

    public static double fcfs(int p1, int p2, int p3)
    {
        int wait = p1*2+p2;
        return (double)wait/3;
    }
}
