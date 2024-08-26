package J04007;

public class Employee {
    private String id = "00001";
    private String name;
    private String gender;
    private String datOfBirth;
    private String address;
    private String maSoThue;
    private String dateOfWork;

    public Employee(String name, String gender, String datOfBirth, String address, String maSoThue, String dateOfWork) {
        this.name = name;
        this.gender = gender;
        this.datOfBirth = datOfBirth;
        this.address = address;
        this.maSoThue = maSoThue;
        this.dateOfWork = dateOfWork;
    }
    public void print(){
        System.out.println(this.id + " " + this.name + " " + this.gender + " " + this.datOfBirth + " " + this.address + " " + this.maSoThue + " " + this.dateOfWork);
    }
}
