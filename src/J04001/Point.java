package J04001;

public class Point {
    private double x;
    private double y;
    private double dist;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public double distance(Point p1, Point p2){
        return p1.distance(p2);
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public String toString(){
        return String.format("%.4f", dist);
    }
}
