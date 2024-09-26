package J04019;

public class Triangle {
    private Point A = new Point(), B = new Point(), C = new Point();
    private double AB, AC, BC;
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        AB = A.getDist(B);
        AC = A.getDist(C);
        BC = B.getDist(C);
    }
    public boolean valid(){
        if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        return String.format("%.3f", AB + AC + BC);
    }
}
