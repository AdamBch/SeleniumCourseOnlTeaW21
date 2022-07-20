package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdamTest {
    @Test
    public void testA() {
        System.out.println("Test A");
    }
    @Test
    public void testB() {
        System.out.println("Test B");
    }
    @Test
    public void someAssertions() {
        assertEquals(52, 52);
    }
    @AfterEach
    public void testAfterEach() {
        System.out.println("testAfterEach");
    }
}