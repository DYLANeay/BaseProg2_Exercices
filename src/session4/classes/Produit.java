package session4.classes;

public abstract class Produit {
    private String name;
    private int price;
    private int shippingCost;

    public Produit(String name, int price){
        this.name=name;
        this.price=price;
//        this.shippingCost=shippingCost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract int getShippingCost();

//    public int getShippingCost() {
//        return shippingCost;
//    }
}
