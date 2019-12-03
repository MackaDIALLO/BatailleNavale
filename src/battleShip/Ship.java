package battleShip;

public class Ship {

    private StateSquare[] square;
    private boolean horizontal;

    /** Creates a new instance of Bateau */
    public Ship(ModelBoat model, Direction orientation, Coordonates debut, int size) {

            square=new StateSquare[size];

        int x =0;
        int y = 0;
        if(horizontal){
                for(int i=0;i<size;i++){
                    square[i]=new StateSquare(x+i,y);
                }
            }else{
                for(int i=0;i<size;i++){
                    square[i]=new StateSquare (x,y+i);
                }
            }
        }
        public void move(int x,int y){
            for(int i=0;i<square.length;i++){
                square[i].move(x,y);
            }
        }
        public void shoot(int x, int y){
            for(int i=0;i<square.length;i++){
                square[i].shoot(x,y);
            }
        }
        public boolean destroyed(){
            boolean res=true;
            int i=0;
            while((i<square.length)&&res){
                res=(res)&&(square[i].getState()=="detruit");
                i++;
            }
            return res;
        }
        public String toString(){
            String s="("+square[0].getabcisse()+","+square[0].getordonnee()+")";
            for(int i=0;i<square.length;i++)
                s+=square[i].toString();
            return s;
        }
    }





