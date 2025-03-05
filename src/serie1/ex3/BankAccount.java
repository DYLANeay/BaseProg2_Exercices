package serie1.ex3;

public class BankAccount {
    int amount;

    BankAccount(int amount) {
        do {
            if (amount > 100) {
                this.amount = amount;
            } else {
                System.out.println("Veuillez entrer une valeur supérieur à 100 francs !");
            }
        } while (amount < 100);

    }

    void putMoney(int number) {
        this.amount += number;
        System.out.println("Vous avez déposé " + number + " avec succès");
        System.out.println("Somme actuelle : " + this.amount);
    }

    void retireMoney(int number) {
        if ((this.amount - number) < 0) {
            System.out.println("Vous n'avez pas assez d'argent sur votre compte :(");
        } else {
            this.amount -= number;
            System.out.println("Vous avez retiré " + number + " avec succès");
            System.out.println("Somme actuelle : " + this.amount);
        }
    }
}
