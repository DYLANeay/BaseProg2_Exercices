package serie4.ex3;

abstract class SmartDevice {
    private boolean isOn ;
    public void turnOn(){
        this.isOn = true ;
    } public void turnOff(){
        this.isOn = false ;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public abstract void performFunction() ;
}