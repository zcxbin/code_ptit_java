package Polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("POLYGON.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Point[] points = new Point[n];
            for (int i = 0; i < n; i++) {
                points[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            Polygon polygon = new Polygon(points);
            System.out.println(polygon.getArea());
        }
    }
}
