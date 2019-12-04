package battleShip;

public enum ModelBoat {
    CARRIER(5), SUBMARINE(3), DESTROYER(2), CRUISER(4),IRONCLAD(3);
    private final int length;

    public int getLength() {
        return length;
    }

    ModelBoat(int length) {
        this.length = length;
    }
}
