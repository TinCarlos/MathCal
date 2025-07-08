import java.awt.BorderLayout;
import java.awt.GridLayout;  // Added this
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIMathCalculator implements ActionListener{
    // Moved main method inside class
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    
    public GUIMathCalculator(){
        frame = new JFrame();
        panel = new JPanel();
        JButton button1 = new JButton("1");
        button1.addActionListener(this);
        label = new JLabel("Number of clicks: 0");
        panel.setBorder(BorderFactory.createEmptyBorder(500, 500, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button1);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CalculatorGUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUIMathCalculator();
    }

    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Pressed" + count +  "times");
    }
}