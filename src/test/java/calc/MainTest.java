package calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main calc = new Main();

    @Test
    public void testAddForEmptyString() {
        assertEquals(0, calc.add(""));
    }

    @Test
    public void testAddOneNumber() {
        assertEquals(1, calc.add("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test
    public void testAddForNNumbers(){
        assertEquals(10, calc.add("4,3,2,1"));
    }

    @Test
    public void testAddForOtherDelimeter(){
        assertEquals(10, calc.add("4\n3,2,1"));
    }
}