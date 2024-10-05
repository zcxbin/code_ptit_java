package B22DCCN417;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = sc.nextInt();
        System.out.println(rr(p1, p2, p3));
    }

    public static double rr(int p1, int p2, int p3)
    {
        int quantum = 2;
        Queue<Integer> q = new LinkedList<Integer>();
        int time = 0;
        q.add(p1);
        q.add(p2);
        q.add(p3);
        while(!q.isEmpty())
        {
            int a = q.poll();
            if(a>quantum)
            {
                time += quantum;
                q.add(a-quantum);
            }
            else{
                time += quantum;
            }
        }
        return (double)time/3;
    }
}