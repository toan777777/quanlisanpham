package Quanli_sanpham.model;

import Quanli_sanpham.model.Category;

public class Product {
    private int id;
    private String nameproDuct;
    private double price;
    private int quantity;
    private Category category;

    public Product() {
    }

    public Product(int id, String nameproDuct, double price, int quantity, Category category) {
        this.id = id;
        this.nameproDuct = nameproDuct;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameproDuct() {
        return nameproDuct;
    }

    public void setNameproDuct(String nameproDuct) {
        this.nameproDuct = nameproDuct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameproDuct='" + nameproDuct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=" + category ;
    }
    public void diplay(){
        System.out.printf("% -5s%-10s%-10s%-10s%",this.id,this.nameproDuct,this.price,this.quantity,this.category);
    }

}
