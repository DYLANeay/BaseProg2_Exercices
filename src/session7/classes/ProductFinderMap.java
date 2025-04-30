package session7.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductFinderMap implements ProductFinder{
    private Map<Integer,Produit> prods = new TreeMap<>(); // garantit l'ordre, au contraire de HashMap !

    @Override
    public Produit findById(Integer id) {
        if (id == null) {
            return null;
        }
        return prods.get(id);
    }
    @Override
    public void addProduit(Produit p) {
        this.prods.put(p.getId(), p);
    }
    @Override
    public void clear() {
        this.prods.clear();
    }

    public Map<Integer, Produit> getProds() {
        return this.prods;
    }
}
