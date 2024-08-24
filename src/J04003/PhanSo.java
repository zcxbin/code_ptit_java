package J04003;

public class PhanSo {
    private long x, y;

    public PhanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }
    public static long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    public void toiGianPhanSo(){
        long tmp = gcd(x, y);
        this.x /= tmp;
        this.y /= tmp;
    }
}
