import checks.LengthsCheck;
import common.Constants;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TriangleInputTest{

    @Test
    public void noTriangleTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        boolean answer = lengthsCheck1.isTriangle(1, 2, 3);
        assertEquals(false, answer);
    }



    @Test
    public void isScaleneTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        boolean answer = lengthsCheck1.isTriangle(2, 3, 4);
        assertEquals(true, answer);
    }

   /* @Test
    public void charInputTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        //lengthsCheck1.checkTheTrianglesSides("a", "2", "3");

        assertEquals(1, lengthsCheck1.showErrorMessage());


    }*/


    @Test
    public void noIsoscelesTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        boolean answer = lengthsCheck1.isIsosceles(1, 2, 3);
        assertEquals(false, answer);
    }

    @Test
    public void isIsoscelesTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        boolean answer = lengthsCheck1.isIsosceles(2, 2, 3);
        assertEquals(true, answer);
    }



    @Test
    public void noEquilateralTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        boolean answer = lengthsCheck1.isEquilateral(2, 2, 3);
        assertEquals(false, answer);
    }

    @Test
    public void isEquilateralTest() throws Exception {
        LengthsCheck lengthsCheck1 = new LengthsCheck();
        boolean answer = lengthsCheck1.isEquilateral(2, 2, 2);
        assertEquals(true, answer);
    }


}