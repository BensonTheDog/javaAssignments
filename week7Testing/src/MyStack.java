public class MyStack {
    // inner class for btnEnter and txtNumber Listener
    class EnterListener implements ActionListener
    {
        // event handler for JButton or Enter Key
        public void actionPerformed(ActionEvent e)
        {
            double dblA = 0;
            String strA;

            // read value from text fields into local variables
            strA = txtNumber.getText();
            txtNumber.setText("");  // clear
            txtNumber.requestFocus();

            // try to convert from String to double, return if fail
            try
            {
                dblA = Double.parseDouble(strA);
            }
            catch (NumberFormatException error)
            {
                return;
            }

            if ( !stk.push(dblA) )
                txtNumber.setText( "Stack Overflow");
        }
    } // end inner class EnterListener
    // inner class for OpListener
    class OpListener implements ActionListener
    {
        // event handler for JButton or Enter Key
        public void actionPerformed(ActionEvent e)
        {
            String strResult;
            Double dbl1, dbl2, dblResult;

            // pop two items
            if (!stk.testStack(2))
                return;
            dbl2 = stk.pop();
            dbl1 = stk.pop();

            // do the math
            if (e.getSource()== btnPlus)
                dblResult = dbl1 + dbl2;
            // else ... other operators ... ??

            // convert from double to  String
            NumberFormat tidy = NumberFormat.getInstance(Locale.US);
            tidy.setMaximumFractionDigits(10);
            strResult = tidy.format(dblResult);


            // write result back to TextA and push
            txtNumber.setText(strResult);
            stk.push(dblResult);
        }
    } // end inner class OpListener
}
