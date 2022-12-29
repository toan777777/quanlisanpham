package Quanli_sanpham.model;

public class Candy extends Product {
    private int weight;

    public Candy(int weight) {
        this.weight = weight;
    }

    public Candy(int id, String nameproDuct, double price, int quantity, Category category, int weight) {
        super(id, nameproDuct, price, quantity, category);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "weight=" + weight +
                '}';
    }
}
