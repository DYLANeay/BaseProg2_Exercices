package serie3.classes;

public class WagonMarchandises extends Wagon{

    String type;
    int quantity;

    public WagonMarchandises(int length, String type, int quantity){
        super(length);
        this.type=type;
        this.quantity=quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
