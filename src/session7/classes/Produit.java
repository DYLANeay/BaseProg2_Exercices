package session7.classes;

public abstract class Produit {
    private String name;
    private int price;
    private int shippingCost;
    private Integer id;

    private static int counter = 0;

    public Produit(String name, int price){
        this.name=name;
        this.price=price;
//        this.shippingCost=shippingCost;
        counter++;
        this.id=counter;
    }

    public Integer getId() {
        return id;
    }

    public static int getCounter(){
        return counter;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    public abstract int getShippingCost();

    public static int incrementCounter(){
        return counter++;
    }

//    public int getShippingCost() {
//        return shippingCost;
//    }
}
