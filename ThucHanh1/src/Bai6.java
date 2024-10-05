
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] ss = sc.nextLine().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String i : ss){
                sb.append(Character.toUpperCase(i.charAt(0)));
                sb.append(i.substring(1).toLowerCase());
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            String[] ss1 = sb.toString().split("\\s+");
            if(n == 1){
                System.out.print(ss1[ss1.length - 1] + " ");
                for(int i = 0; i < ss1.length - 2; i++){
                    System.out.print(ss1[i] + " ");
                }
                System.out.println(ss1[ss1.length - 2]);
            }
            else{
                for(int i = 1; i < ss1.length; i++){
                    System.out.print(ss1[i] + " ");
                }
                System.out.print(ss1[0]);
            }
            System.out.println();
        }
    }
}
/*
2
1
NguyeN    vAn    Nam
2
hoAng  le Nhat THONG chi
 */