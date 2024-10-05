import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            long tichViTriChan = 1;
            long tongViTriLe = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    if (s.charAt(i) != '0')
                        tichViTriChan *= s.charAt(i) - '0';
                }
                else{
                    tongViTriLe += s.charAt(i) - '0';
                }
            }
            System.out.println(tichViTriChan + " " + tongViTriLe);

        }

    }
}
/*
3
12345678
20000
22334455667788
 */
