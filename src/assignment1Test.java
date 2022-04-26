import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class assignment1Test {


    @org.junit.jupiter.api.Test
    void even() {
        assignment1 watermelon = new assignment1();
        assertTrue(watermelon.watermelomweight(20));
    }
    @org.junit.jupiter.api.Test
    void odd() {
        assignment1 watermelon = new assignment1();
        assertFalse(watermelon.watermelomweight(7));
    }

    @org.junit.jupiter.api.Test
    void negativeOdd() {
        assignment1 watermelon = new assignment1();
        assertThrows(IllegalArgumentException.class, () -> { watermelon.watermelomweight(-5);});
    }

    @org.junit.jupiter.api.Test
    void negativeEven() {
        assignment1 watermelon = new assignment1();
        assertThrows(IllegalArgumentException.class, () -> { watermelon.watermelomweight(-6);});
    }

    @Test
    void eq() {
        assignment1 phy = new assignment1();
        int x[] = {1, -1, 0};
        int y[] = {2, 3, -5};
        int z[] = {3, 4, -7};
        assertTrue(phy.physicseq(3, x, y, z));
    }

    @Test
    void eq1() {
        assignment1 phy = new assignment1();
        int x[] = {3, 8};
        int y[] = {9, -2};
        int z[] = {-6, 6};
        assertFalse(phy.physicseq(2, x, y, z));
    }

    @Test
    void eq2() {
        assignment1 phy = new assignment1();
        int x[] = {6};
        int y[] = {0};
        int z[] = {10};
        assertFalse(phy.physicseq(1, x, y, z));
    }

    @Test
    void eq3() {
        assignment1 phy = new assignment1();
        int x[] = {2};
        int y[] = {2};
        int z[] = {2};
        assertThrows(IllegalArgumentException.class, () -> {
            phy.physicseq(0, x, y, z);
        });
    }

    @Test
    void eq4() {
        assignment1 phy = new assignment1();
        int x[] = {2,6};
        int y[] = {8,-3};
        int z[] = {12,-9};
        assertThrows(IllegalArgumentException.class, () -> {
            phy.physicseq(-2, x, y, z);
        });
    }
    @Test
    void eq5() {
        assignment1 phy = new assignment1();
        int x[] = {-1,2};
        int y[] = {2,5};
        int z[] = {6,-7};
        assertThrows(ArrayIndexOutOfBoundsException.class , () ->
        {phy.physicseq(3,x,y ,z);});
    }



}