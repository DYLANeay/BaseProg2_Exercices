package session4.classes;

public class Table extends Produit {
    private int poids;

    public Table(String name, int price, int shippingCosts, int poids){
        super(name, price, shippingCosts);
        this.poids=poids;
    }

    public int getPoids() {
        return this.poids;
    }
}
