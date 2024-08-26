package J04010;

public class Circle {
    private Point A = new Point(), B = new Point(), C = new Point();
    private double R, AB, AC, BC;

    public Circle(double x1, double y1, double x2, double y2, double x3, double y3){
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        AB = A.getDist(B);
        AC = A.getDist(C);
        BC = B.getDist(C);
    }

    public String toString(){
        if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB){
            return "INVALID";
        }

        double p = (AB + AC + BC) / 2;
        double s = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
        R = (AB * AC * BC) / (4 * s);
        return String.format("%.3f", Math.PI * R * R);
    }
}
