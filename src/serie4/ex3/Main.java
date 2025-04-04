package serie4.ex3;

public class Main {
    public static void main(String[] args) {
        SmartDevice p1 = new SmartPhone(90);
        SmartDevice w1 = new SmartWatch(0);

        ((SmartWatch) w1).addSteps(200);
        ((SmartWatch) w1).addSteps(200);

        p1.turnOn();
        w1.turnOn();

        p1.performFunction();
        w1.performFunction();

    }
}
