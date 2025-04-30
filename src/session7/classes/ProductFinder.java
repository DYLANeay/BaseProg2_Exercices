package session7.classes;

public interface ProductFinder {
    Produit findById(Integer id);
    void addProduit(Produit p);
    void clear();
}
