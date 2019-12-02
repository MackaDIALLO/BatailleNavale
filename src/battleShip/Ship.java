package battleShip;

public class Ship {
    public Ship(MoadelBoat model , Direction orientation, coordonates) {
    private int length;
    private String direction;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
