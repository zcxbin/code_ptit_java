package J04009;

public class Triangle {
    private Point A = new Point(), B = new Point(), C = new Point();
    private double AB, AC, BC;
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.dist(B);
        this.AC = A.dist(C);
        this.BC = B.dist(C);
    }

    public String toString(){
        if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB){
            return "INVALID";
        }

        double p = (AB + AC + BC) / 2;
        return String.format("%.2f", Math.sqrt(p * (p - AB) * (p - AC) * (p - BC)));
    }
}
