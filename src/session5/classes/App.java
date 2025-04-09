package session5.classes;

public class App extends Produit implements Downloadables{
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

    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public String getDownloadLink() {
        return downloadLink;
    }
}
