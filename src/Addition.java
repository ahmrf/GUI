/**
 * Created by ahmrf on 6/30/2015.
 */

import javax.swing.JOptionPane;
public class Addition {
    public static void main(String[] args){
        String firstNumber = JOptionPane.showInputDialog("Enter first number");
        String secondNumber = JOptionPane.showInputDialog("Enter second number");
        int firstInt = Integer.parseInt(firstNumber);
        int secondInt = Integer.parseInt(secondNumber);
        JOptionPane.showMessageDialog(null, "The sum is " + (firstInt + secondInt), "Addition", JOptionPane.PLAIN_MESSAGE);
    }
}
