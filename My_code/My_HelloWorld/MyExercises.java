package My_code.My_HelloWorld;
import javax.swing.*;

public class MyExercises {
    public static void main(String[] args) {
        String message = "Hello mjukvarutestare";
        JFrame frame = new JFrame("Hello, Java");
        frame.setSize(350,250);
        JLabel label = new JLabel(message,JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }    
    
}
