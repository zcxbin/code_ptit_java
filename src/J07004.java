import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] nums = new int[100005];
        while(sc.hasNext()){
            nums[Integer.parseInt(sc.next())]++;
        }
        for(int i = 0; i < 100005; i++){
            if(nums[i] != 0){
                System.out.println(i + " " + nums[i]);
            }
        }
    }
}
