package battleShip;

public enum ModelBoat {
    CARRIER(5), SUBMARINE(3), DESTROYER(2), CRUISER(4),IRONCLAD(3);
    private final int size;

    public int getSize() {
        return size;
    }

    ModelBoat(int size) {
        this.size = size;
    }
}
