package serie1.ex2;

public class Main
{
    public static void main(String[] args) {
        Car car = new Car("blue", "BMW", "M3", 2023, "OFF", 0);

        car.accelerate();
        car.brake();
        car.accelerate();

        car.startCar();
        car.stopCar();
        System.out.println(car.powerMode);
    }
}
