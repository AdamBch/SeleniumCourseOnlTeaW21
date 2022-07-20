package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.*;

public class ExampleTest {

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @AfterEach
    public void testAfterEach() {
        System.out.println("testAfterEach");
    }
    @BeforeEach
    public void testBeforeEach() {
        System.out.println("testBeforeEach");
    }

    @BeforeAll
    public static void testBeforeAll() {
        System.out.println("testBeforeAll");
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("testAfterEach");
    }
}
