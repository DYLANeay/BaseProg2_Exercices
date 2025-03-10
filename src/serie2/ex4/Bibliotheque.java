package serie2.ex4;

import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> biblio;

    public Bibliotheque(){
        this.biblio=new ArrayList<>();
    }


    public void addLivre(Livre livre){
        this.biblio.add(livre);
    }

    public ArrayList<Livre> getBiblio(){
        return this.biblio;

    }


}
