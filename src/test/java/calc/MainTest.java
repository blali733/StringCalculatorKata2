package calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {
    Main calc = new Main();

    @Test
    public void testAddForEmptyString() throws Exception {
        assertEquals(0, calc.add(""));
    }

    @Test
    public void testAddOneNumber() throws Exception  {
        assertEquals(1, calc.add("1"));
    }

    @Test
    public void testAddTwoNumbers() throws Exception  {
        assertEquals(3, calc.add("1,2"));
    }

    @Test
    public void testAddForNNumbers() throws Exception {
        assertEquals(10, calc.add("4,3,2,1"));
    }

    @Test
    public void testAddForOtherDelimiter() throws Exception {
        assertEquals(10, calc.add("4\n3,2,1"));
    }

    @Test
    public void testAddForCustomDelimiter() throws Exception {
        assertEquals(10, calc.add("//[;]\n4;3;2;1"));
    }

    @Test
    public void testAddForNegativeNumbers(){
        Boolean thrown = false;
        try {
            calc.add("//[;]\n-4;3;-2;1");
        }catch (Exception e){
            thrown = true;
            assertEquals("negatives not allowed: -4 -2", e.getMessage());
        }
        assertTrue(thrown);
    }

    @Test
    public void testAddForConsecutiveAdditions() throws Exception{
        assertEquals(5, calc.add("2,3"));
        assertEquals(5, calc.add("2,3"));
    }

    @Test
    public void testAddForLongNumbers() throws Exception {
        assertEquals(2, calc.add("2,1005"));
    }

    @Test
    public void testAddForLongDelimiters() throws Exception {
        assertEquals(10, calc.add("//[;;;]\n4;;;3;;;2;;;1"));
    }

    @Test
    public void testAddForMultipleDelimiters() throws Exception {
        assertEquals(10, calc.add("//[;;;][@]\n4;;;3@2;;;1"));
    }

    @Test
    public void testAddForMoreMultipleDelimiters() throws Exception {
        assertEquals(10, calc.add("//[;;;][@][%]\n4;;;3@2%1"));
    }
}