package serie3.classes;

public class WagonPassagers extends Wagon{
    int passengersNb = 0;

    public WagonPassagers(int length, int passengersNb){

        super(length);
        this.passengersNb=passengersNb;
    }

    public int getPassengersNb() {
        return passengersNb;
    }

}
