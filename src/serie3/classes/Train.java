package serie3.classes;

import java.util.ArrayList;

public class Train {
    ArrayList<Wagon> trainComp;

    public Train (){
        this.trainComp= new ArrayList<Wagon>();
    }

    public void addWagon(Wagon wagon){
        this.trainComp.add(wagon);
    }

    public ArrayList<Wagon> getTrainComp() {
        return trainComp;
    }

    public int getTotalLength(){

        int totalLength = 0;

        for (Wagon w : this.trainComp){
            totalLength+=w.getLength();         ;
        }

        return totalLength;
    }
}
