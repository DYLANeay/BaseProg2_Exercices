package session7.classes;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int comp = o1.compareTo(o2);

        if(comp==0){
            return 0;
        }

        if(comp<0){
            return 1;
        }
        else{
            return -1;
        }
    }
}
