package J04012;

public class Employee {
    private String ID, Name, position;
    private long DayOfWork, SalaryOneDay, Subsidy, Salary, Bonus, Income;

    public Employee(String name, long salaryOneDay, long dayOfWork, String position) {
        this.ID = "NV01";
        this.Name = name;
        this.SalaryOneDay = salaryOneDay;
        this.DayOfWork = dayOfWork;
        this.position = position;

        if(this.DayOfWork >= 25){
            this.Bonus = 20;
        } else if (this.DayOfWork >= 22) {
            this.Bonus = 10;
        }else{
            this.Bonus = 0;
        }

        if(position.equals("GD")) this.Subsidy = 250000;
        else if (position.equals("PGD")) this.Subsidy = 200000;
        else if (position.equals("TP")) this.Subsidy = 180000;
        else this.Subsidy = 150000;
        this.Salary = SalaryOneDay * dayOfWork;
        this.Income = (this.Salary * (100 + this.Bonus)) / 100 + this.Subsidy;
    }
    public void print(){
        System.out.println(ID + " " + Name + " " + Salary + " " + (Salary * Bonus) / 100 + " " + Subsidy + " " + Income);
    }


}
