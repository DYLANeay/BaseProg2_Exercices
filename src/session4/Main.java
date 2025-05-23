package session4;

import session4.classes.*;

public class Main {
    public static void main(String[] args) {

        Panier panier = new Panier();
        Panier panier2 = new Panier();

//        Produit iphone = new Produit("iphone 16", 400, 50);
//        Produit play = new Produit("ps4", 400, 40);
        Produit af1 = new Shoes("AirForce 1", 100, 41); //Une shoes est un produit so OK
        Produit Ekedalen = new Table("Ekedalen", 190, 20);
        Produit adobe = new License("Adobe CC", 300, 2, "www.bs.ch" );
        Produit photoshop = new App("Photoshop", 90, 2, "www.yo.ch");

//        panier.addToCart(iphone);
//        panier.addToCart(play);
        panier.addToCart(af1); //possible car shoes EST AUSSI UN PRODUIT
        panier.addToCart(Ekedalen); //possible car table EST AUSSI UN PRODUIT
        panier.addToCart(adobe);
        panier.addToCart(photoshop);

        panier2.addToCart(Ekedalen);
        panier2.addToCart(af1);

        System.out.println(panier.priceCalcul());
        System.out.println(panier.priceCalcul("CHF"));

        //afficher le type de produit (la classe) en utilisant @Override
        // System.out.println(adobe.toString()); //bof pas ouf
        // => System.out.println(adobe.toString());

        //faire ça pour tous les produits
        for (Produit p : panier.getPanierListe()){
            System.out.println(p.toString());
        }

        System.out.println(panier2.priceCalcul());


        //simplement afficher les différentes properties de chaque class
        /*for(Produit p : panier.getPanierListe()){
            //=> Polymorphisme
            //instanceof permet de vérifier que p est une instance de Shoes, est donc évite l'erreur !
            if(p instanceof Shoes){
                Shoes s = (Shoes) p; //on cast chaque élément de la liste pour qu'il soit "Shoes"
                System.out.println(s.getSize());

            }else if (p instanceof Table){
                Table t = (Table) p;
                System.out.println(t.getPoids());
            } else if (p instanceof License) {
                License l = (License) p;
                System.out.println(l.getVersion());
                System.out.println(l.getDownloadLink());
            } else if (p instanceof App) {
                App a = (App) p;
                System.out.println(a.getVersion());
                System.out.println(a.getDownloadLink());
            }
            else{
                System.out.println(p.getPrice());
            }
        }*/



    }
}
