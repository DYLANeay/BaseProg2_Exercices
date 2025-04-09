package session5.classes;

public abstract class Produit {
    private String name;
    private int price;
    private int shippingCost;

    public static int shareByAllInstance = 0;

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

    public static int getShareByAllInstance(){
        return shareByAllInstance; //sans le this car la variable ne diffère pas de chaque instance
    }

    public abstract int getShippingCost();

//    public int getShippingCost() {
//        return shippingCost;
//    }
}
