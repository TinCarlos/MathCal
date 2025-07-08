import java.awt.BorderLayout;
import java.awt.GridLayout;  // Added this
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIMathCalculator {
    // Moved main method inside class
    public static void main(String[] args){
        new GUIMathCalculator();
    }
    
    public GUIMathCalculator(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button1 = new JButton("1");
        button1.
        panel.setBorder(BorderFactory.createEmptyBorder(500, 500, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button1);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CalculatorGUI");
        frame.pack();
        frame.setVisible(true);
    }
}