package serie4.ex3;

public class SmartPhone extends SmartDevice{
    int batteryLevel = 0;

    public SmartPhone(int batteryLevel){
        super();
        this.batteryLevel=batteryLevel;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void performFunction() {
        if (getIsOn() == true && this.batteryLevel>0){
            System.out.println("appel en cours");
        }else{
            System.out.println("L'appareil est étient ou n'a plus de batterie");
        }
    }
}
