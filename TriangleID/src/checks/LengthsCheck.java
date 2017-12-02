package checks;

import common.Constants;

import javax.swing.*;


/**
 * It is the class that handles all the necessary checks
 * about the three input sides that each user can write.
 * <p>
 * If the given lengths are valid and can form a triangle, it checks if:
 * <p>
 * 1. The triangle formed is a Equilateral. <p>
 * 2. The triangle formed is a Isosceles. <p>
 * 3. The triangle formed is a Scalene.
 */
public class LengthsCheck {

    /**
     * Checks the three sides if the given lengths can form a triangle.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     * @return true, for making a triangle. <p> false, for not making a triangle.
     *
     */
    public boolean isTriangle(double side1Length, double side2Length, double side3Length) {
        return ((side1Length + side2Length > side3Length) && (side1Length + side3Length > side2Length) &&
                (side2Length + side3Length > side1Length) && (side1Length > 0 && side2Length > 0 && side3Length > 0) );
    }

    /**
     * Checks if all sides of the triangle are the same.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     * @return true, if the triangle formed is equilateral. <p> false, if it's not equilateral.
     *
     */
    public boolean isEquilateral(double side1Length, double side2Length, double side3Length) {
        return ((side1Length == side2Length) && (side1Length == side3Length));
    }



    /**
     * Checks if any two of the sides of the triangles are the same.
     * @param side1Length It is the first side of triangle.
     * @param side2Length It is the second side of triangle.
     * @param side3Length It is the third side of triangle.
     *
     * @return true, if the triangle formed is isosceles. <p> false, if it's not isosceles.
     *
     */
    public boolean isIsosceles(double side1Length, double side2Length, double side3Length) {
        return ((side1Length == side2Length) || (side1Length == side3Length) || (side2Length == side3Length));
    }

    /**
     * Shows error message in the GUI.
     */
    public static int showErrorMessage() {
        JOptionPane.showMessageDialog(null,
                Constants.ERROR_MESSSAGE_SIDES_MUST_POSITIVE,
                Constants.ERROR_TITLE_CANNOT_CREATE_TRIANGLE,
                JOptionPane.ERROR_MESSAGE);
        return -1;
    }

    /**
     * Checks if the three sides are valid and if not, show the error messages.
     * If sides are valid a pop-up window comes up with the type of the triangle
     * that will will be formed.
     *
     * @param input1 It is the first side of triangle.
     * @param input2 It is the second side of triangle.
     * @param input3 It is the third side of triangle.
     *
     */
    public void checkTheTrianglesSides(String input1, String input2, String input3) {

        try {
            double side1Length = Double.parseDouble(input1);
            double side2Length = Double.parseDouble(input2);
            double side3Length = Double.parseDouble(input3);


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

        }catch (NumberFormatException nfe) {
            showErrorMessage();
        }
    }
}
