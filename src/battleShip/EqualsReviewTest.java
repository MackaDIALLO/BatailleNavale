package battleShip;

import static org.junit.jupiter.api.Assertions.*;

class EqualsReviewTest {

    @org.junit.jupiter.api.Test
    void testEquals() throws Exception {
        var e1 = new EqualsReview(5,12,"marcher",true);
        var e2 = new EqualsReview(5,12,"marcher",true);
        var e3 = new EqualsReview(6,114,"courrir",true);
        var e4 = new EqualsReview(5,12,"marcher",true);
        var e5 = new EqualsReview(5,12,"marcher",true);
        assertEquals(true, e1.equals(e3));
        //assertEquals(true, e1.equals(e3));
    }
    @org.junit.jupiter.api.Test
    void testHashCode() {
    }
}