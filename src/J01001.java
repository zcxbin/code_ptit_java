import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieuDai = sc.nextInt();
        int chieuRong = sc.nextInt();
        if(chieuDai < 0 || chieuRong <= 0){
            System.out.println(0);
        }
        else{
            System.out.println((chieuDai + chieuRong) * 2 + " " + chieuDai * chieuRong);
        }
    }
}
