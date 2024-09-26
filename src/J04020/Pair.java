package J04020;

public class Pair<T extends Number, U extends Number> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime(){
        return isPrime(first.intValue()) && isPrime(second.intValue());
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public String toString(){
        return first.toString() + " " + second.toString();
    }
}
