package Quanli_sanpham.model;

public class Drinks extends Product {
    private int volume;
    protected String bottleType;

    public Drinks() {
    }

    public Drinks(int volume, String bottleType) {
        this.volume = volume;
        this.bottleType = bottleType;
    }

    public Drinks(int id, String nameproDuct, double price, int quantity, Category category, int volume, String bottleType) {
        super(id, nameproDuct, price, quantity, category);
        this.volume = volume;
        this.bottleType = bottleType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBottleType() {
        return bottleType;
    }

    public void setBottleType(String bottleType) {
        this.bottleType = bottleType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "volume=" + volume +
                ", bottleType='" + bottleType + '\'' +
                '}';
    }

   public void display(){
       System.out.println("");
   }
}
