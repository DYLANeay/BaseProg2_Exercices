package serie1.ex2;

public class Car {
    String color;
    String brand;
    String model;
    int buildingYear;
    String powerMode;
    int currentSpeed;

    Car(String color, String brand, String model, int buildingYear, String powerMode, int currentSpeed) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.buildingYear = buildingYear;
        this.powerMode = powerMode;
        if (this.powerMode=="OFF"){
            this.currentSpeed = 0;
        }else {
            this.currentSpeed = currentSpeed;
        }
    }

    void startCar() {
        if (this.powerMode.equalsIgnoreCase("ON")) {
            System.out.println("Car is already driving");
        } else {
            System.out.println("Car starts");
            this.powerMode = "ON";
            this.currentSpeed++;
        }

    }

    void stopCar() {
        if (this.powerMode.equalsIgnoreCase("OFF")) {
            System.out.println("Car is already stopped");
        } else {
            System.out.println("Car stops");
            this.powerMode = "OFF";
            this.currentSpeed=0;
        }
    }

    void accelerate() {
        this.currentSpeed+=10;
        this.powerMode="ON";
        System.out.println("Car is accelerating and is driving at " + this.currentSpeed);

    }

    void brake() {
        if (this.currentSpeed>=10){
            this.currentSpeed-=10;
            System.out.println("Car is braking and is driving at " + this.currentSpeed);
        }else{
            this.currentSpeed=0;
            System.out.println("Car is stopping");
            this.powerMode="OFF";
        }




    }
}
