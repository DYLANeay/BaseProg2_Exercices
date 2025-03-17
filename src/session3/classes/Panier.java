package session3.classes;

import java.util.ArrayList;

public class Panier {
    private ArrayList<Produit> panierListe;

    public Panier(){
        this.panierListe = new ArrayList<Produit>();
    }

    public void addToCart(Produit prod){
        this.panierListe.add(prod);
    }

    public int priceCalcul(){

        int total = 0;

        for(Produit prod : this.panierListe){
            total+= prod.getPrice()+ prod.getShippingCost();
        }

        return total;
    }

    public ArrayList<Produit> getPanierListe() {
        return this.panierListe;
    }
}
