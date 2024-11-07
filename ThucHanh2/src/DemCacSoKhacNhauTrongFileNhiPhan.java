import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class DemCacSoKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        TreeSet<Integer> nums = new TreeSet<>();

        for (String s : list) {
            String[] parts = s.split("\\s+");
            for (String part : parts) {
                try {
                    nums.add(Integer.parseInt(part));
                } catch (NumberFormatException ignored) {
                }
            }
        }

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
