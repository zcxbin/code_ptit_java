import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
                if (i > 0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
2
I like this program very much
much very program this like I
 */