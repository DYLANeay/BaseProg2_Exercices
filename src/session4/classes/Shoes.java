package session4.classes;

public class Shoes extends Produit {

    private int size;

    public Shoes(String name, int price, int shippingCosts, int size){
        super(name, price, shippingCosts); //crée une instance de produit, obligatoire
        this.size=size;
    }

    public int getSize() {
        return size;
    }
}
