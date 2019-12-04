package battleShip;

public class Ship {

    ModelBoat name;
    //ModelBoat length;
    //Direction isVertical;
    private Coordonates begin;
    private Coordonates end;
    private Coordonates[] touchedSquares;
    private int nbTouched;



    /*private StateSquare[] square;
    private boolean horizontal;*/

    /**
     * Création d'une instance de Bateau
     */
    public Ship(ModelBoat name, int length, boolean isVertical, Coordonates begin) {

        this.name = name;
        //this.length = length;
        this.begin = begin;
        //this.isVertical = isVertical;

        if (isVertical) {

            end = new Coordonates(this.begin.getColumn(), this.begin.getLine() + length - 1);
        } else {
            end = new Coordonates(this.begin.getColumn() + length - 1, this.begin.getLine());
        }

        touchedSquares = new Coordonates[length];
        nbTouched = 0;
    }

    public Coordonates getBegin(){
        return begin;
    }

    public Coordonates getEnd() {
        return end;
    }

    /** une méthode qui vérifie si un bateau est sur une cordonnée.*/
    public boolean isIn (Coordonates c){
        return c.getColumn() >= begin.getColumn()
                && c.getColumn() <= end.getColumn()
                && c.getLine() >= begin.getLine()
                && c.getLine() <= end.getLine();
    }

    /**Une méthode qui vérifie si deux bateaux se chevauchent*/
    public boolean overLaps(Ship s) {
        if (this.begin.getLine() == this.end.getLine()) {
            return s.begin.getColumn() >= this.begin.getColumn()
                    && s.begin.getColumn() <= this.end.getColumn()
                    && this.begin.getLine() >= s.begin.getColumn()
                    && this.begin.getLine() <= s.end.getLine();
        } else {
            return s.begin.getLine() >= this.begin.getLine()
                    && s.begin.getLine() <= this.end.getLine()
                    && this.begin.getColumn() >= s.begin.getColumn()
                    && this.begin.getColumn() <= s.end.getColumn();
        }

    }

    /**Une méthode qui vérifie si un navire est touché*/
    public boolean isTouched(Coordonates c){
        for ( int i=0; i<touchedSquares.length; i++){
            if(touchedSquares[i].equals(c)) {
                return true;
            }
        }
        return false;
    }

    /**Une méthode qui vérifie si un navire a été touché par un tir*/
    public boolean isShoot(Coordonates c){
        if(this.isIn(c)){
            touchedSquares[nbTouched] = c;
            nbTouched++;
            return true;
        }
        return false;
    }

    /** Méthode qui existe déjà mais ici , elle marche si jamais au moins le bateau a été touché une fois*/
    public boolean isTouched(){
        return nbTouched > 0;
    }

    public boolean isDestroyed(){
        /*for ( int i=0; i<touchedSquares.length; i++){
         if(touchedSquares[i].equals(c)) {
         return true;*/
        return touchedSquares.length == nbTouched;

    }



    }










