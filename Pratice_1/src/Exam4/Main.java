package Exam4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();
            users.add(new User(username, password));
            sc.nextLine();
        }

        int m = Integer.parseInt(sc.nextLine());
        int[] loginCount = new int[n];

        for (int i = 0; i < m; i++) {
            String attemptUsername = sc.next();
            String attemptPassword = sc.next();
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (users.get(j).checkLogin(attemptUsername, attemptPassword)) {
                    loginCount[j]++;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(loginCount[i] + " ");
        }
    }
}
/*
4
tendangnhap matkhau
username password
nguoidung m4tkh4un4yr4tb40m4t
user2 password
6
tendangnhap matkhau
username matkhau
bfc34 contest
username password
tendangnhap matkhau
user2 password
 */