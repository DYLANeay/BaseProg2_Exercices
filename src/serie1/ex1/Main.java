package serie1.ex1;

public class Main {
    public static void main(String[] args) {

        Imprimante imp = new Imprimante("XCZEW", "OFF");
        System.out.println(imp.getPowerMode());

        imp.changePowerMode("av");

        System.out.println(imp.getPowerMode());


    }
}