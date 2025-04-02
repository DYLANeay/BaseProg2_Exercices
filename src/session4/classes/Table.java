package session4.classes;

public class Table extends Produit {
    private int poids;

    public Table(String name, int price, int poids){
        super(name, price);
        this.poids=poids;
    }

    @Override
    public int getShippingCost() {
        return (int) (this.poids/10);
    }


    @Override
    public String toString(){
        return "Table " + this.poids;
    }

    public int getPoids() {
        return this.poids;
    }
}
