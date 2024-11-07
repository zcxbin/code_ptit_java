package DiemTrungBinh;

import java.util.Arrays;

public class ListMark {
    private Mark[] listMarks;

    public ListMark(Mark[] listMarks) {
        this.listMarks = listMarks;
    }

    public String toString() {
        double[] marksArray = Arrays.stream(listMarks)
                .mapToDouble(Mark::getMark)
                .toArray();
        Arrays.sort(marksArray);
        double min = marksArray[0];
        double max = marksArray[marksArray.length - 1];
        double sum = 0.0;
        int count = 0;
        for (double mark : marksArray) {
            if (mark != min && mark != max) {
                sum += mark;
                count++;
            }
        }
        double average = sum / count;
        return String.format("%.2f", average);
    }
}