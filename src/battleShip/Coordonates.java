package battleShip;

public class Coordonates {
    private int ligne;
    private int colonne;

    public Coordonates(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }
}
