package BanHang;

public class Customer {
    private String customerID, customerName, sex, DOB, address;

    public Customer() {}
    public Customer(int customerID, String customerName, String sex, String DOB, String address) {
        this.customerID = String.format("KH%03d", customerID);
        this.customerName = customerName;
        this.sex = sex;
        this.DOB = DOB;
        this.address = address;
    }
    public String getCustomerId() {
        return customerID;
    }
    public String toString(){
        return customerName + " " + address;
    }
}
