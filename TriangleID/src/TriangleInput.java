import checks.LengthsCheck;
import common.Constants;
import definitions.Definitions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TriangleInput {

    private JPanel TriangleInputRoot;
    private JTextField side1Length;
    private JTextField side2Length;
    private JTextField side3Length;
    private JButton clearButton;
    private JButton checkButton;

    /**
     * The basic constructor the Triangle Input.
     * Initialize all the callbacks which needs
     * the check button and clear button
     */
    private TriangleInput() {
        checkButton.addActionListener(checkButtonActionListener);
        clearButton.addActionListener(clearButtonActionListener);
    }

    /**
     * Ιt is the main method of the program
     * Show the main JFRAME GUI.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame(Constants.ERROR_TITLE_CANNOT_CREATE_TRIANGLE);
        frame.setContentPane(new TriangleInput().TriangleInputRoot);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(Definitions.WIDTH_FRAME, Definitions.HEIGHT_FRAME);
        frame.setResizable(false);

        // Center the window on the screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

    }




    ActionListener checkButtonActionListener = e -> {


    /** Takes the three sides as input
     * and then checks and the three sides
     * to define the kind of triangle.
     */
    LengthsCheck lengthsCheck = new LengthsCheck();

    String side1 = side1Length.getText();
    String side2 = side2Length.getText();
    String side3 = side3Length.getText();

    lengthsCheck.checkTheTrianglesSides(side1, side2, side3);

    };


    private ActionListener clearButtonActionListener = e -> {
        side1Length.setText("");
        side2Length.setText("");
        side3Length.setText("");
    };
}