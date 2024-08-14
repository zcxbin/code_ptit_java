package J01010;
import java.util.*;

public class J01010 {
    public static Character chuyenDoiKyTu(char c) {
        if(c == '0' || c == '8' || c == '9') {
            return '0';
        } else if(c == '1') {
            return '1';
        } else {
            return 'I';
        }
    }

    public static StringBuilder chuyenDoiTu(String s) {
        StringBuilder tmp = new StringBuilder();
        Set<Character> se = new HashSet<>();
        for(char c : s.toCharArray()) {
            char convertedChar = chuyenDoiKyTu(c);
            if(convertedChar == 'I') {
                return new StringBuilder("INVALID");
            } else {
                se.add(convertedChar);
                tmp.append(convertedChar);
            }
        }
        if(se.size() == 1 && se.contains('0')) {
            return new StringBuilder("INVALID");
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0) {
            String s = sc.nextLine().trim();
            StringBuilder result = chuyenDoiTu(s);
            if (!result.toString().equals("INVALID")) {
                String resultStr = result.toString().replaceFirst("^0+", "");
                if (resultStr.isEmpty()) {
                    resultStr = "INVALID";
                }
                System.out.println(resultStr);
            } else {
                System.out.println("INVALID");
            }
        }

        sc.close();
    }
}

