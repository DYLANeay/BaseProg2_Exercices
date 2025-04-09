package session5;

import session5.classes.*;

import java.math.BigDecimal;

import static session5.classes.Produit.getCounter;

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
        Downloadables d1 = new App("Illustrator", 90, 2, "yooyoyo.ch");

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

        System.out.println(d1.getDownloadLink());

        System.out.println(Produit.shareByAllInstance);
        af1.shareByAllInstance = 1;
        System.out.println(af1.shareByAllInstance);
        System.out.println(af1.getShareByAllInstance());

        System.out.println(getCounter());

        //big decimal essai
        BigDecimal n1 = BigDecimal.valueOf(0.3);
        BigDecimal n2 = BigDecimal.valueOf(0.5);
        BigDecimal n3 = n1.add(n2);
        System.out.println(n3); // donne exactement la valeur attendue, contrairement à double qui aurait essayé d'arrondir bizarrement




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
