package J04002;

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next().toLowerCase();
        color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
        Rectange hcn = new Rectange(width, height, color);
        if (hcn.getHeight() <= 0 || hcn.getWidth() <= 0) {
            System.out.println("INVALID");
        } else
            System.out.printf("%.0f %.0f %s", hcn.findPerimeter(), hcn.findArea(), hcn.getColor());

    }
}
