package serie1.ex1;

public class Imprimante {

    String name;
    String power;

    Imprimante(String name, String power) {
        this.name = name;
        if (power.equalsIgnoreCase("ON") || power.equalsIgnoreCase("OFF")) {
            this.power = power;
        } else {
            System.out.println("Invalid power type");
        }
    }

    String getPowerMode() {
        return this.power;
    }

    void changePowerMode(String power) {
        if (power.equalsIgnoreCase("ON") || power.equalsIgnoreCase("OFF")) {
            this.power = power;
        } else {
            System.out.println("Invalid Power Mode");
            return;
        }

    }
}
