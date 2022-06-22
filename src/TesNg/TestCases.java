package TesNg;

import org.testng.annotations.Test;

public class TestCases {
    @Test(priority = 1)
    void setup() {
        System.out.println("I am inside set up");
    }

    @Test(priority = 2)
    void testSteps() {
        System.out.println("I am inside test Steps");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("I am inside tearDown");
    }

}
