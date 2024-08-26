package J04015;

public class Teacher {
    private String ID, Name;
    private long Level, Salary, Subsidy, Income;

    public Teacher(String ID, String name, long salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;

        if(ID.charAt(1) == 'T')
            this.Subsidy = 2000000;
        else if (ID.charAt(1) == 'P')
            this.Subsidy = 900000;
        else this.Subsidy = 500000;
        Level = Integer.parseInt(ID.substring(2));
        Income = Salary * Level + Subsidy;
    }

    public void print(){
        System.out.println(ID + " " + Name + " " + Level + " " + Subsidy + " " + Income);
    }


}
