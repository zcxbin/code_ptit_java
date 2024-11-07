package BanHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));

        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            customers.add(new Customer(i + 1, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for(int i = 0; i < m; i++){
            products.add(new Product(i + 1, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }
        int k = Integer.parseInt(sc3.nextLine());
        ArrayList<Order> orders = new ArrayList<>();
        for(int i = 0; i < k; i++){
            String[] s = sc3.nextLine().split(" ");
            String customerID = s[0];
            String productID = s[1];
            int quantity = Integer.parseInt(s[2]);
            Customer tmpCustomer = new Customer();
            Product tmpProduct = new Product();
            for(Customer customer : customers){
                if(customer.getCustomerId().equals(customerID)){
                    tmpCustomer = customer;
                }
            }
            for(Product product : products){
                if(product.getProductID().equals(productID)){
                    tmpProduct = product;
                }
            }
            orders.add(new Order(i + 1, tmpCustomer, tmpProduct, quantity));
        }
        for(Order order : orders){
            System.out.println(order);
        }
    }
}
