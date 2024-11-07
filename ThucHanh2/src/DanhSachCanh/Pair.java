package DanhSachCanh;

public class Pair<T extends Number, U extends Number> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return String.format("(%s,%s)", first, second);
    }
}
