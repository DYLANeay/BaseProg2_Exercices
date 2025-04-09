package session5.classes;

public class Shoes extends Produit implements Wearables{

    private int size;

    public Shoes(String name, int price, int size){
        super(name, price); //crée une instance de produit, obligatoire
        this.size=size;

    }

    @Override
    public int getShippingCost() {
        return 9;
    }

    @Override
    public String toString(){
        return "Chaussures " + this.size;
    }

    @Override //pas nécessaire mais c'est plus propre
    public int getSize() {
        return size;
    }
}
