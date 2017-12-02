import javax.swing.*;

public class LengthsCheck {



    private static boolean IsItATriangle(double side1Length, double side2Length, double side3Length){

            return ((side1Length + side2Length > side3Length) && (side1Length + side3Length > side2Length) && (side2Length + side3Length > side1Length));

    }

    private static boolean IsItEquilateral(double side1Length, double side2Length, double side3Length){

        return ((side1Length == side2Length) && (side1Length == side3Length));

    }

    private static boolean IsItIsosceles (double side1Length, double side2Length, double side3Length){

        return  ((side1Length == side2Length) || (side1Length == side3Length) || (side2Length == side3Length));
    }



   /* private static boolean IsItScalene(double side1Length, double side2Length, double side3Length){

        if ((side1Length + side2Length < side3Length) || (side1Length + side3Length < side2Length) || (side2Length + side3Length < side1Length))
            return false;
        else
            return true;
    }*/






    public static void main(double side1Length, double side2Length, double side3Length){


        if (!(IsItATriangle(side1Length, side2Length, side3Length))){
            JOptionPane.showMessageDialog(null,
                    "The given side lengths cannot create a triangle.",
                    "Triangle Identification App",
                    JOptionPane.ERROR_MESSAGE);
            return;}

        if (IsItEquilateral(side1Length, side2Length, side3Length)){
            JOptionPane.showMessageDialog(null,
                    "The given side lengths form an equilateral triangle!",
                    "Triangle Identification App",
                    JOptionPane.INFORMATION_MESSAGE);
            return;}

        if (IsItIsosceles(side1Length, side2Length, side3Length)){
            JOptionPane.showMessageDialog(null,
                    "The given side lengths form an isosceles triangle!",
                    "Triangle Identification App",
                    JOptionPane.INFORMATION_MESSAGE);
            return;}


        //if (IsItScalene(side1Length, side2Length, side3Length)){
        JOptionPane.showMessageDialog(null,
                "The given side lengths form an scalene triangle!",
                "Triangle Identification App",
                JOptionPane.INFORMATION_MESSAGE);
        //  return;}



    }
}
