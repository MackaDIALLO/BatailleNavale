package battleShip;

public class StateSquare {
    private int abcisse;
    private int ordonnee;
    private String state;

    public StateSquare(int i, int j) {
        abcisse=i;
        ordonnee=j;
        state="intact";
    }
    public int getabcisse(){
        return abcisse;
    }
    public int getordonnee(){
        return ordonnee;
    }
    public void shoot(int i , int j) {
        if(abcisse==i && ordonnee==j) {
            if(state=="intact"){
                state="abime";
            }else if(state=="abime")
                state="detruit";
        }
    }
    public void move(int i,int j){
        if((i>=-1) && (i<=1) && (j>=-1) && (j<=1)){
            abcisse+=i;
            ordonnee+=j;
        }
    }
    public String getState(){
        return state;
    }
    public String toString() {
        String s="";
        if(state=="intact"){
            s="i";
        }else{
            if(state=="abime"){
                s="a";
            }else{
                s="d";
            }

        }
        return s;
    }

}