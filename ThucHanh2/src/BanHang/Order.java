package BanHang;

public class Order {
    private String orderID;
    private Customer customer;
    private Product product;
    private int quantity;
    public Order(int orderID, Customer customer, Product product, int quantity) {
        this.orderID = String.format("HD%03d", orderID);
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    public String toString(){
        return orderID + " " + customer.toString() + " " + product.toString() + " " + quantity + " " + quantity * product.getPrice();
    }
}
