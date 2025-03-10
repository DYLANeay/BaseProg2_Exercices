package serie2.ex5;

public class Main {
    public static void main(String[] args) {

        Imprimante brother = new Imprimante("Brother 451", "OFF", 0);
        brother.printSheet();

        brother.addSheets(25);
        brother.printSheet();

        brother.changePowerMode("ON");
        brother.printSheet();

        Feuille progAssessment = new Feuille("do the java exercises due for wednesday", 3);
        brother.addWaitingList(progAssessment);

        Feuille mathAssessment = new Feuille("do the fucking serie 9878 about dérivées", 13);
        brother.addWaitingList(mathAssessment);

        brother.printSheet();

        Feuille marketingAssessment = new Feuille("do the Landing Page", 2);
        brother.addWaitingList(marketingAssessment);


        brother.printAllSheets();

        brother.printSheet();



    }
}