package Exam5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Team> teams = new LinkedList<>();
        LinkedList<SinhVien> sv = new LinkedList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++) {
            String maTeam = "";
            if(i < 10) maTeam = "Team0" + String.valueOf(i);
            else maTeam = "Team" + String.valueOf(i);
            teams.add(new Team(maTeam, sc.nextLine(), sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            String maSinhVien = "";
            if(i < 10) maSinhVien = "C00" + String.valueOf(i);
            else if (i < 100) maSinhVien = "C0" + String.valueOf(i);
            else maSinhVien = "C" + String.valueOf(i);
            sv.add(new SinhVien(maSinhVien, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv);

        for(SinhVien sinhVien : sv){
            for(Team team : teams){
                if(team.getMaTeam().equals(sinhVien.getMaTeam())){
                    System.out.println(sinhVien.toString() + " " + team.toString());
                }
            }
        }

    }
}

/*
2
BAV_MIS
Banking Academy of Vietnam
FTU Knights1
Foreign Trade University
6
Le Trung Toan
Team01
Nguyen Trinh Quoc Long
Team01
Giang Minh Tung
Team01
Nguyen Hang Giang
Team02
Nguyen Thanh Nhan
Team02
Nguyen Viet Duc
Team02
 */