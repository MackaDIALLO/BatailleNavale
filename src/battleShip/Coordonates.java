package battleShip;

public class Coordonates {
    private int line;
    private int column;
    private static final char beginChar = 'A';

    /**Constructeur de la classe Coordonates*/
    public Coordonates(String coordonates) {
        column = coordonates.charAt(0) - beginChar;
        String line = coordonates.substring(1, 2);
        this.line = Integer.parseInt(line);
    }

    public Coordonates(int column, int line) {
        this.line = line;
        this.column = column;
    }

    /*public Coordonates(int column) {
        this.column = column;
    }*/



    public boolean equals(Coordonates c){
        return column == c.column && line == c.line;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
    public String toString(){
        String coordonates = new String();
        coordonates =coordonates + (char)(column + beginChar) + line;
        return coordonates;
        //return (char)(column + beginChar) + line + "";
    }
}