package session4;

import session4.classes.Panier;
import session4.classes.Produit;
import session4.classes.Shoes;
import session4.classes.Table;

public class Main {
    public static void main(String[] args) {

        Panier panier = new Panier();
        Produit iphone = new Produit("iphone 16", 400, 50);
        Produit play = new Produit("ps4", 400, 40);
        Produit af1 = new Shoes("AirForce 1", 100, 10, 41); //Une shoes est un produit so OK
        Produit Ekedalen = new Table("Ekedalen", 190, 5, 20);

        panier.addToCart(iphone);
        panier.addToCart(play);
        panier.addToCart(af1); //possible car shoes EST AUSSI UN PRODUIT
        panier.addToCart(Ekedalen); //possible car table EST AUSSI UN PRODUIT

        System.out.println(panier.priceCalcul());


        System.out.println(Ekedalen.getClass());

        for(Produit p : panier.getPanierListe()){
            //=> Polymorphisme
            //instanceof permet de vérifier que p est une instance de Shoes, est donc évite l'erreur !
            if(p instanceof Shoes){
                Shoes s1 = (Shoes) p; //on cast chaque élément de la liste pour qu'il soit "Shoes"
                System.out.println(s1.getSize());


            }else if (p instanceof Table){
                Table t1 = (Table) p;
                System.out.println(t1.getPoids());
            }
            else{
                System.out.println(p.getPrice());
            }

        }

    }
}
