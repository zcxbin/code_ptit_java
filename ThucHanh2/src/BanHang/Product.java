package BanHang;

public class Product {
    private String productID, nameProduct, unit;
    private int cost, price;
    public Product(){}
    public Product(int productID, String nameProduct, String unit, int cost, int price) {
        this.productID = String.format("MH%03d", productID);
        this.nameProduct = nameProduct;
        this.unit = unit;
        this.cost = cost;
        this.price = price;
    }
    public String getProductID() {
        return productID;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return nameProduct + " " + unit + " " + cost + " " + price;
    }
}
