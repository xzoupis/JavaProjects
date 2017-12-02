import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleInput{
    private JPanel TriangleInputRoot;
    private JTextField side1Length;
    private JTextField side2Length;
    private JTextField side3Length;
    private JButton clearButton;
    private JButton checkButton;


    private TriangleInput() {
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double side1 = Double.parseDouble(side1Length.getText());
                    double side2 = Double.parseDouble(side2Length.getText());
                    double side3 = Double.parseDouble(side3Length.getText());
                    if (side1>0 && side2>0 && side3>0) LengthsCheck.main(side1,side2,side3);
                    else ErrorMsg();

                }catch (NumberFormatException nfe){
                    ErrorMsg();
                }
            }
        });



        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                side1Length.setText("");
                side2Length.setText("");
                side3Length.setText("");
            }
        });
    }


    private static void ErrorMsg(){

        JOptionPane.showMessageDialog(null,
                "The given side lengths MUST be positive numbers!",
                "Triangle Identification App",
                JOptionPane.ERROR_MESSAGE);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle Identification App");
        frame.setContentPane(new TriangleInput().TriangleInputRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
        frame.setSize(330, 200);
        frame.setResizable(false);

        /* Center the window on the screen */
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

    }
}