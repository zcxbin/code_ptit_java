package Polygon;


public class Polygon {
    private int soDinh;
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
        this.soDinh = points.length;
    }

    public String getArea(){
        double area = 0;
        for(int i = 0; i < soDinh - 1; i++){
            area += ((points[i].getX() * points[i+1].getY()) - (points[i].getY() * points[i+1].getX()));
        }
        area += (points[soDinh - 1].getX() * points[0].getY()) - (points[soDinh - 1].getY() * points[0].getX());
        return String.format("%.3f", area / 2.0);
    }
}
