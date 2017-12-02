package checks;

import common.Constants;

import javax.swing.*;


/**
 * It is the class that handles all the necessary checks
 * about the three input sides that each user can write.
 * <p>
 * The checks are the belows:
 * <p>
 * 1. isTriangle <p>
 * 2. isEquilateral <p>
 * 3. isIsosceles
 */
public class LengthsCheck {

    /**
     * Checks the three sides if the given lengths can form a triangle.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     * @return true for making a triangle, false for not.
     *
     */
    private boolean isTriangle(double side1Length, double side2Length, double side3Length) {
        return ((side1Length + side2Length > side3Length) && (side1Length + side3Length > side2Length) && (side2Length + side3Length > side1Length));
    }

    /**
     * Checks if all sides of the triangle are the same.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     * @return true if the triangle formed is equilateral, false if it's not.
     *
     */
    private boolean isEquilateral(double side1Length, double side2Length, double side3Length) {
        return ((side1Length == side2Length) && (side1Length == side3Length));
    }



    /**
     * Checks if any two of the sides of the triangles are the same.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     * @return true if the triangle formed is isosceles, false if it's not.
     *
     */
    private boolean isIsosceles(double side1Length, double side2Length, double side3Length) {
        return ((side1Length == side2Length) || (side1Length == side3Length) || (side2Length == side3Length));
    }

    /**
     * Checks if the three sides are valid and show the error messages.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     */
    public void checkTheTrianglesSides(double side1Length, double side2Length, double side3Length) {
        if (!(isTriangle(side1Length, side2Length, side3Length))) {
            JOptionPane.showMessageDialog(null,
                    Constants.ERROR_MESSSAGE_CANNOT_CREATE_TRIANGLE,
                    Constants.ERROR_TITLE_CANNOT_CREATE_TRIANGLE,
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isEquilateral(side1Length, side2Length, side3Length)) {
            JOptionPane.showMessageDialog(null,
                    Constants.ERROR_MESSSAGE_SIDES_EQUIL_TRIANGLE,
                    Constants.ERROR_TITLE_CANNOT_CREATE_TRIANGLE,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (isIsosceles(side1Length, side2Length, side3Length)) {
            JOptionPane.showMessageDialog(null,
                    Constants.MESSSAGE_TRIANGLE_IS_ISOSCELES,
                    Constants.ERROR_TITLE_CANNOT_CREATE_TRIANGLE,
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,
                Constants.MESSSAGE_TRIANGLE_IS_SCALENE,
                Constants.ERROR_TITLE_CANNOT_CREATE_TRIANGLE,
                JOptionPane.INFORMATION_MESSAGE);

    }
}
