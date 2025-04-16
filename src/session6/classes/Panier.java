package session6.classes;

import java.util.LinkedList;
import java.util.List;

public class Panier {
    private List<Produit> panierListe;

    public Panier(){
        this.panierListe = new LinkedList<Produit>();
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
    public String priceCalcul(String monnaie){
        return "Total price " + priceCalcul() + " " + monnaie;
    }

    public List<Produit> getPanierListe() {
        return this.panierListe;
    }
}