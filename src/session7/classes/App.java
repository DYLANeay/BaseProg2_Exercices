package session7.classes;

public class App extends Produit implements Downloadables {
    private int version;
    private String downloadLink;
    public App(String name, int price, int version, String downloadLink) {
        super(name, price);
        this.version=version;
        this.downloadLink=downloadLink;
    }

    @Override // permet de vérifier qu'un objet == un autre objet de par ses valeurs, et non par la référence que java donne de base aux objets
    public boolean equals (Object o) {
        if (o instanceof App app) {
            return this.getName().equals(app.getName()) && this.getPrice()==app.getPrice() && this.downloadLink.equals(app.getDownloadLink()) && this.version == app.getVersion();
        }

        return false;
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
