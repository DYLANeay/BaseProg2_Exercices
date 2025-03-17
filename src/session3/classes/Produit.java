package session3.classes;

public class Produit {
    private String name;
    private int price;
    private int shippingCost;

    public Produit(String name, int price, int shippingCost){
        this.name=name;
        this.price=price;
        this.shippingCost=shippingCost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getShippingCost() {
        return shippingCost;
    }
}
