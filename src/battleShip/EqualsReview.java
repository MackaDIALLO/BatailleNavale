package battleShip;

import java.util.Objects;

public class EqualsReview {
    int obj1;
    long obj2;
    String obj3;
    boolean obj4;

    public EqualsReview(int obj1, long obj2, String obj3, boolean obj4) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj2 = obj2;
        this.obj2 = obj2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsReview that = (EqualsReview) o;
        return obj1 == that.obj1 &&
                obj2 == that.obj2 &&
                obj4 == that.obj4 &&
                Objects.equals(obj3, that.obj3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj1, obj2, obj3, obj4);
    }

}



