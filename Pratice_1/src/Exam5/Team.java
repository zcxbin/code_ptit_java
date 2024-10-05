package Exam5;

public class Team {
    private String maTeam, teamName, uniName;

    public Team(String maTeam, String teamName, String uniName) {
        this.maTeam = maTeam;
        this.teamName = teamName;
        this.uniName = uniName;
    }
    public String getMaTeam() {
        return maTeam;
    }
    public String getTeamName() {
        return teamName;
    }
    public String getUniName() {
        return uniName;
    }

    public String toString() {
        return teamName + " " + uniName;
    }
}
