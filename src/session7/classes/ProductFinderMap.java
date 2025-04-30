package session7.classes;

import java.util.HashMap;
import java.util.Map;

public class ProductFinderMap implements ProductFinder{
    private Map<Integer,Produit> prods = new HashMap<Integer,Produit>();

    @Override
    public Produit findById(Integer id) {
        if (id == null) {
            // You can either return null or throw an exception based on your application's requirements
            return null; // or throw new IllegalArgumentException("Id cannot be null");
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
