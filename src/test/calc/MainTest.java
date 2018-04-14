package calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main calc = new Main();

    @Test
    public void testAddForEmptyString() {
        assertEquals(0, calc.add(""));
    }
}