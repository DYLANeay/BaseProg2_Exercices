package session4.classes;

public class App extends Produit {
    private int version;
    private String downloadLink;
    public App(String name, int price, int version, String downloadLink) {
        super(name, price);
        this.version=version;
        this.downloadLink=downloadLink;
    }

    @Override
    public int getShippingCost() {
        return 0;
    }

    public int getVersion() {
        return version;
    }

    public String getDownloadLink() {
        return downloadLink;
    }
}
