package J04004;

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

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }
    public long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void congPhanSo(PhanSo a, PhanSo b){
        this.tuSo = a.getTuSo() * b.getMauSo() + a.getMauSo() * b.getTuSo();
        this.mauSo = a.getMauSo() * b.getMauSo();
    }
    public void rutGonPhanSo(){
        long tmp = gcd(this.tuSo, this.mauSo);
        this.tuSo /= tmp;
        this.mauSo /= tmp;
    }
}
