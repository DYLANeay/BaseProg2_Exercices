package serie4.ex3;

public class SmartWatch extends SmartDevice{
    int stepCount = 0;
    public SmartWatch(int stepCount) {
        super();
        this.stepCount=stepCount;
    }

    public void addSteps(int steps){
        this.stepCount+=steps;
    }

    @Override
    public void performFunction() {
        System.out.println("nombre de pas : " + this.stepCount);
    }
}
