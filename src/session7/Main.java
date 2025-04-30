package session7;

import session7.classes.*;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.*;

import static session6.classes.Produit.getCounter;



public class Main {
    public static void main(String[] args) {

        Panier panier = new Panier();
        Panier panier2 = new Panier();

//        Produit iphone = new Produit("iphone 16", 400, 50);
//        Produit play = new Produit("ps4", 400, 40);
        Produit af1 = new Shoes("AirForce 1", 100, 41); //Une shoes est un produit so OK
        Produit af2 = new Shoes("AirForce 2", 100, 41); //Une shoes est un produit so OK
        Produit Ekedalen = new Table("Ekedalen", 190, 20);
        Produit adobe = new License("Adobe CC", 800, 2, "www.bs.ch" );
        Produit photoshop = new App("Photoshop", 90, 2, "www.yo.ch");
        Downloadables d1 = new App("Illustrator", 90, 2, "yooyoyo.ch");

        ProductFinderMap pf= new ProductFinderMap();
        pf.addProduit(af1);
        pf.addProduit(Ekedalen);
        pf.addProduit(adobe);
        pf.findById(1);

        for (Map.Entry<Integer,Produit> entry : pf.getProds().entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        } // infos incomplète car se base sur ToString pour retourner les valeurs

        Map<String, String> stringMap = new TreeMap<>(new StringComparator());
        stringMap.put("hey","hey");
        stringMap.put("hoi","hoi");
        for (Map.Entry<String,String> entry : stringMap.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }


    }

    public static void getTime() {
        ArrayList<Integer> timeArrayList = new ArrayList<>();
        LinkedList<Integer> timeLinkedList = new LinkedList<>();

        // Measure time for ArrayList
        double beginTimeArray = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            timeArrayList.add(0, i);
        }
        System.out.println("Time taken by ArrayList: " + (System.currentTimeMillis() - beginTimeArray) + " ms");

        // Measure time for LinkedList
        double beginTimeLinked = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            timeLinkedList.add(0, i);
        }
        System.out.println("Time taken by LinkedList: " + (System.currentTimeMillis() - beginTimeLinked) + " ms");
    }}
