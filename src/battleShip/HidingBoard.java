package battleShip;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HidingBoard {

    public static void main(String[] args) {


            Map<Integer, String> board = new HashMap<>();
            board.put(10, "1");
            board.put(20, "2");
            board.put(30, "3");
            board.put(40, "4");
            board.put(50, "5");

            System.out.println("Parcours de l'objet HashMap : ");
            Set<Entry<Integer, String>> setHm = board.entrySet();
            Iterator<Entry<Integer, String>> it = setHm.iterator();
            while(it.hasNext()){
                Entry<Integer, String> e = it.next();
                System.out.println(e.getKey() + " : " + e.getValue());
            }

            System.out.println("Valeur pour la clé 8 : " + board.get(8));


        }
    }

