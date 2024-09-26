package J05033;

import java.util.*;

public class J05033
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        while (t-- > 0)
            times.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        Collections.sort(times);
        for (Time time : times)
            System.out.println(time);
    }
}