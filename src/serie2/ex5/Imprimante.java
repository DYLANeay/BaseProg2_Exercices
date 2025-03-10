package serie2.ex5;

import java.util.ArrayList;

public class Imprimante {
    private String name;
    private String power;
    private int sheetNumber;
    private ArrayList<Feuille> waitingList; //arraylist qui contient toutes mes feuilles

    //constructeur
    public Imprimante(String name, String power, int sheetNumber) {
        this.name = name;
        if (power.equalsIgnoreCase("ON") || power.equalsIgnoreCase("OFF")) {
            this.power = power;
        } else {
            System.out.println("Invalid power type");
            this.power = "OFF"; // Défaut à OFF si incorrect
        }
        this.sheetNumber = Math.max(sheetNumber, 0);
        this.waitingList = new ArrayList<>();
    }

    // Imprimer une feuille
    public void printSheet() {
        if (this.sheetNumber > 0 && this.power.equals("ON") && !this.waitingList.isEmpty()) {
            Feuille first = this.waitingList.get(0);
            System.out.println("Vous avez imprimé la première feuille de la liste d'attente : ");
            System.out.println("+--------------------------------------+");
            System.out.println("|                                      |");
            System.out.println("|                                      |");
            System.out.println(first.getText());
            System.out.println("|                                      |");
            System.out.println("|                                      |");
            System.out.println("+--------------------------------------+");

            this.waitingList.remove(0);
            this.sheetNumber--; // Réduction du nombre de feuilles après impression

        } else if (this.sheetNumber < 1) {
            System.out.println("Erreur : Vous n'avez plus de feuilles");
        } else if (this.power.equals("OFF")) {
            System.out.println("Erreur : Veuillez allumer l'imprimante");
        } else {
            System.out.println("Erreur : Veuillez ajouter des feuilles à imprimer dans l'imprimante");
        }
    }

    // Imprimer toutes les feuilles
    public void printAllSheets() {
        if (this.sheetNumber > 0 && this.power.equals("ON") && !this.waitingList.isEmpty()) {
            while (!this.waitingList.isEmpty() && this.sheetNumber > 0) {
                printSheet();  // Évite la duplication de code
            }
        } else if (this.sheetNumber < 1) {
            System.out.println("Erreur : Vous n'avez plus de feuilles");
        } else if (this.power.equals("OFF")) {
            System.out.println("Erreur : Veuillez allumer l'imprimante");
        } else {
            System.out.println("Erreur : Veuillez ajouter des feuilles à imprimer dans l'imprimante");
        }
    }

    //Ajouter une feuille dans la liste d'attente
    public void addWaitingList(Feuille feuille) {
        this.waitingList.add(feuille);
    }

    // Ajouter des feuilles blanches
    public void addSheets(int nmbr) {
        if (nmbr > 0) {
            this.sheetNumber += nmbr;
            System.out.println(nmbr + " feuilles ajoutées. Total : " + this.sheetNumber);
        } else {
            System.out.println("Nombre invalide de feuilles à ajouter.");
        }
    }


    public int getSheetNumber() {
        return sheetNumber;
    }

    public ArrayList<Feuille> getWaitingList() {
        return this.waitingList;
    }

    public String getPowerMode() {
        return this.power;
    }

    //changer le mode d'alim de l'imprimante
    public void changePowerMode(String power) {
        if (power.equalsIgnoreCase("ON") || power.equalsIgnoreCase("OFF")) {
            this.power = power;
            System.out.println("L'imprimante est maintenant " + this.power);
        } else {
            System.out.println("Invalid Power Mode");
        }
    }
}
