package session7.classes;

import java.util.Comparator;

//Changer la logique pour le tri d'un TreeMap
public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        int diff = i1-i2;

        if(diff==0){
            return 0;
        }
        if(diff<0){
            return -1;
        }else{
            return 1;
        }
    }
}
