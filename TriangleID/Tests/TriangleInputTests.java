import checks.LengthsCheck;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleInputTests extends LengthsCheck{

    LengthsCheck lengthsCheck1 = new LengthsCheck();


    @Test
    public void noTriangleTest() throws Exception {
        boolean answer = lengthsCheck1.isTriangle(1, 2, 3);
        assertEquals(false, answer);
    }

    @Test
    public void isScaleneTest() throws Exception {
        boolean answer = lengthsCheck1.isTriangle(2, 3, 4);
        assertEquals(true, answer);
    }


    @Test
    public void testNumberFormatException() {
        boolean thrown = false;

        try {
            lengthsCheck1.checkTheTrianglesSides("a", "2", "3");
        }catch (NumberFormatException nfe) {
            thrown =true;
        }

        assertTrue(thrown);
    }

    @Test
    public void noIsoscelesTest() throws Exception {
        boolean answer = lengthsCheck1.isIsosceles(1, 2, 3);
        assertEquals(false, answer);
    }

    @Test
    public void isIsoscelesTest() throws Exception {
        boolean answer = lengthsCheck1.isIsosceles(2, 2, 3);
        assertEquals(true, answer);
    }

    @Test
    public void noEquilateralTest() throws Exception {
        boolean answer = lengthsCheck1.isEquilateral(2, 2, 3);
        assertEquals(false, answer);
    }

    @Test
    public void isEquilateralTest() throws Exception {
        boolean answer = lengthsCheck1.isEquilateral(2, 2, 2);
        assertEquals(true, answer);
    }

}