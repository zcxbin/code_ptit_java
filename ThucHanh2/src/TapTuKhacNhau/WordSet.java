package TapTuKhacNhau;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class WordSet {
    private Set<String> words;

    public WordSet(String line) {
        words = new TreeSet<>(Arrays.asList(line.toLowerCase().split("\\s+")));
    }

    public String union(WordSet other) {
        TreeSet<String> unionSet = new TreeSet<>(words);
        unionSet.addAll(other.words);
        return String.join(" ", unionSet);
    }

    public String intersection(WordSet other) {
        TreeSet<String> intersectionSet = new TreeSet<>(words);
        intersectionSet.retainAll(other.words);
        return String.join(" ", intersectionSet);
    }
}
