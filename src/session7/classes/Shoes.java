package session7.classes;

public class Shoes extends Produit implements Wearables {

    private int size;

    public Shoes(String name, int price, int size){
        super(name, price); //crée une instance de produit, obligatoire
        this.size=size;

    }

    @Override // permet de vérifier qu'un objet == un autre objet de par ses valeurs, et non par la référence que java donne de base aux objets
    public boolean equals (Object o) {
        if (o instanceof Shoes) {
            if (this.getName().equals(((Shoes) o).getName()) && this.getPrice() == ((Shoes) o).getPrice() && this.getSize() == ((Shoes) o).getSize()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int getShippingCost() {
        return 9;
    }

    @Override
    public String toString(){
        return this.getName() + ", " + this.getPrice() + ", " + this.size;
    }

    @Override //pas nécessaire mais c'est plus propre
    public int getSize() {
        return size;
    }
}
