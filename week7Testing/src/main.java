import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class main
{
    public static void main(String[] args)
    {
        // establish main frame in which program will run
        Calculator myCalculator
                = new Calculator("CS 1B RPN Calculator");
        myCalculator.setSize(250, 300);
        myCalculator.setLocationRelativeTo(null);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show everything to the user
        myCalculator.setVisible(true);
    }
}

//Calculator class is derived from JFrame class
class Calculator  extends JFrame
{
    private JButton btnPlus, btnMinus, btnMult, btnDiv, btnEnter;
    private JTextField txtNumber;
    private JLabel lblInstructions;
    private JPanel pnlButtons, pnlTextEnter;

    // Calculator constructor
    public Calculator(String title)
    {
        // pass the title up to the JFrame constructor
        super(title);

        // set up main components for the JFrame
        pnlTextEnter = new JPanel( new GridLayout(1, 2, 10, 10));
        pnlButtons = new JPanel( new GridLayout(2, 2, 20, 20));
        lblInstructions = new JLabel("Use Reverse Polish Noatation");

        // use border layout and put three above components in frame
        setLayout (new BorderLayout(20, 10));
        add(pnlTextEnter, BorderLayout.NORTH );
        add(pnlButtons, BorderLayout.CENTER);
        add(lblInstructions, BorderLayout.SOUTH);

        // set up the components for the pnlTextEnter Panel
        btnEnter = new JButton("Enter");
        txtNumber = new JTextField("0.0", 15);

        // add components to pnlTextEnter Panel
        pnlTextEnter.add(txtNumber);
        pnlTextEnter.add(btnEnter);

        // set up the components for the pnlButtons Panel
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");

        // add components to pnlButtons Panel
        pnlButtons.add(btnPlus);
        pnlButtons.add(btnMinus);
        pnlButtons.add(btnMult);
        pnlButtons.add(btnDiv);

        // place borders around three sub-panels
        pnlTextEnter.setBorder(new TitledBorder("Entry and Result"));
        pnlButtons.setBorder(new TitledBorder("Operator Buttons"));
    }

} // end class Calculator