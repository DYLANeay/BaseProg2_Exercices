package session7.classes;

public class License extends Produit implements Downloadables {
    private int version;
    private String downloadLink;

    public License(String name, int price, int version, String downloadLink) {
        super(name, price);
        this.version=version;
        this.downloadLink=downloadLink;
    }

    @Override
    public String toString(){
        return  super.toString() + ", License version " + this.version; //super permet d'accéder ici à la méthode de base toString, sans prendre en compte l'override
    }
    @Override
    public int getShippingCost() {
        return 0;
    }

    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public String getDownloadLink() {
        return downloadLink;
    }
}
