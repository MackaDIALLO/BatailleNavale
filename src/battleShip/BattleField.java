package battleShip;

public class BattleField {
   public static void main(String[] args) {

        Ship carrier = new Ship(ModelBoat.CARRIER,5,false, new Coordonates("B1"));
        //System.out.println("\nCarrier begin :" +carrier.getBegin());
        System.out.println("" +carrier.name+ " Begin :" +carrier.getBegin());
        System.out.println("Carrier end :" +carrier.getEnd()+ "\n");

        Ship submarine = new Ship(ModelBoat.SUBMARINE,3,true, new Coordonates("E3"));
        System.out.println("submarine begin :" +submarine.getBegin());
        System.out.println("submarine end :" +submarine.getEnd()+ "\n");

        Ship destroyer = new Ship(ModelBoat.DESTROYER,2,false, new Coordonates("D6"));
        System.out.println("destroyer begin :" +destroyer.getBegin());
        System.out.println("destroyer end :" +destroyer.getEnd()+ "\n");

        Ship cruiser = new Ship(ModelBoat.CRUISER,4,true, new Coordonates("C5"));
        System.out.println("cruiser begin :" +cruiser.getBegin());
        System.out.println("cruiser end :" +cruiser.getEnd()+ "\n");

        Ship ironclad = new Ship(ModelBoat.IRONCLAD,3,true, new Coordonates("A8"));
        System.out.println("ironclad begin :" +ironclad.getBegin());
        System.out.println("ironclad end :" +ironclad.getEnd());


        HidingBoard board = new HidingBoard();
        board.initialisation();
        board.boardDisplay();
    }

}
