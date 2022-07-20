package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTests {
    @Test
    public void costamCostam() {
        assertEquals(42, 42);
        assertEquals(3.14, 3.14, 0.01); //ostatnie to ilosc miejsc po przecinku
        assertEquals(true, true);
        assertNotEquals(true, false);
        assertTrue(true);
        assertFalse(false);
        Object o = new Object();
        Object o2 = o;
        assertSame(o, o2);
        assertArrayEquals(new int[]{1,2}, new int[]{1,2});


    }
}
