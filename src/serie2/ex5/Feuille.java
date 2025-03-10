package serie2.ex5;

public class Feuille {
    private String text;
    private int numberPages;

    public Feuille(String text, int numberPages){
        this.text=text;
        if (numberPages > -1) {
            this.numberPages = numberPages;
        } else {
            System.out.println("Veuillez renseigner un nombre > -1 ");
        }
    }

    public String getText(){
        return text;
    }

    public int getNumberPages() {
        return numberPages;
    }
}
