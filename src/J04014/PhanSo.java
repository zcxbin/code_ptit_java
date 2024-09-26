package J04014;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public PhanSo congPhanSo(PhanSo ps) {
        long tu = (long) Math.pow(this.tuSo * ps.getMauSo() + ps.getTuSo() * this.mauSo, 2);
        long mau = (long)Math.pow(this.mauSo * ps.getMauSo(), 2);
        return new PhanSo(tu, mau);
    }

    public PhanSo nhanPhanSo(PhanSo ps) {
        long tu = this.tuSo * ps.getTuSo();
        long mau = this.mauSo * ps.getMauSo();
        return new PhanSo(tu, mau);
    }

    public void rutGonPhanSo() {
        long gcd = gcd(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }

    public void print() {
        System.out.print(this.tuSo + "/" + this.mauSo + " ");
    }
}
