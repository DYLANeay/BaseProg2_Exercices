package serie3;

import serie3.classes.*;

public class Main {
    public static void main(String[] args) {
        Train t1 = new Train();
        Wagon w1 = new WagonMarchandises(12, "CFF", 200);
        Wagon w2 = new WagonPassagers(10, 2000);
        Wagon w3 = new Locomotives(90);

        t1.addWagon(w1);
        t1.addWagon(w2);
        t1.addWagon(w3);

        for (Wagon w :  t1.getTrainComp()){
            if (w instanceof WagonPassagers){
                WagonPassagers wp1 = (WagonPassagers) w;
                System.out.println(wp1.getLength() + " + " + wp1.getPassengersNb());
            }
            else if (w instanceof Locomotives){
                Locomotives l1 = (Locomotives) w;
                //aucune info en plus à print
                System.out.println(l1.getLength());
            }
            else if (w instanceof WagonMarchandises){
                WagonMarchandises wm1 = (WagonMarchandises) w;
                System.out.println(wm1.getQuantity() +  " + " + wm1.getType() + " + " + wm1.getLength());
            }
        }
        System.out.println(w1.getLength());

        System.out.println("pour une longueur totale de : " + t1.getTotalLength());

    }
}
