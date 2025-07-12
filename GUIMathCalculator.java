import java.awt.BorderLayout;
import java.awt.GridLayout;  // Added this
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIMathCalculator extends Calculator implements ActionListener {
    // Moved main method inside class
    private int count = 0;
    private JLabel label1;
    private JFrame frame;
    private JPanel panel;
    private Integer a;
    private Integer b;
    
    public GUIMathCalculator(){
        frame = new JFrame();
        panel = new JPanel();
        a = null;
        b = null;



        //initalizing buttons 
        JButton button0 = new JButton("0");
        button0.setMnemonic(0);
        button0.setSelected(true);
        JButton button1 = new JButton("1");
        button0.setMnemonic(1);
        button0.setSelected(true);
        JButton button2 = new JButton("2");
        button0.setMnemonic(2);
        button0.setSelected(true);
        JButton button3 = new JButton("3");
        button0.setMnemonic(3);
        button0.setSelected(true);
        JButton button4 = new JButton("4");
        button0.setMnemonic(4);
        button0.setSelected(true);
        JButton button5 = new JButton("5");
        button0.setMnemonic(5);
        button0.setSelected(true);
        JButton button6 = new JButton("6");
        button0.setMnemonic(6);
        button0.setSelected(true);
        JButton button7 = new JButton("7");
        button0.setMnemonic(7);
        button0.setSelected(true);
        JButton button8 = new JButton("8");
        button0.setMnemonic(8);
        button0.setSelected(true);
        JButton button9 = new JButton("9");
        button0.setMnemonic(9);
        button0.setSelected(true);

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton multButton = new JButton("x");
        JButton divButton = new JButton("/");

        //actions performed
        ActionListener x;

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multButton.addActionListener(this);
        divButton.addActionListener(this);

        label1 = new JLabel("Enter Your Calculation:");

        //panel operations
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(4, 3));
        panel.add(label1);

        //Button integration
        panel.add(addButton);
        panel.add(subButton);
        panel.add(multButton);
        panel.add(divButton);
        panel.add(new JLabel("")); // Empty space
        panel.add(new JLabel("")); // Empty space
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);

        //panel operations
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
        String operator = "";
        switch (e.getActionCommand()) {
            case "0":
            if (a == null){
                a = 0;
            }else if(b == null){
                b = 0;
            }
            break;
            case "1":
            if (a == null){
                a = 1;
            }else if(b == null){
                b = 1;
            }
            break;
            case "2":
            if (a == null){
                a = 2;
            }else if(b == null){
                b = 2;
            }
            break;
            case "3":
            if (a == null){
                a = 3;
            }else if(b == null){
                b = 3;
            }
            break;
            case "4":
            if (a == null){
                a = 4;
            }else if(b == null){
                b = 4;
            }
            break;
            case "5":
            if (a == null){
                a = 5;
            }else if(b == null){
                b = 5;
            }
            break;
            case "6":
            if (a == null){
                a = 6;
            }else if(b == null){
                b = 6;
            }
            break;
            case "7":
            if (a == null){
                a = 7;
            }else if(b == null){
                b = 7;
            }
            break;
            case "8":
            if (a == null){
                a = 8;
            }else if(b == null){
                b = 8;
            }
            break;
            case "9":
            if (a == null){
                a = 9;
            }else if(b == null){
                b = 9;
            }
            break;
            case "+":
            operator = "a";
            break;
            case "-":
            operator = "b";
            break;
            case "x":
            operator = "c";
            break;
            case "/":
            operator = "d";
            break;
            default:
                break;
        }

        
        Calculator x = new Calculator(this.a);
        Calculator y = new Calculator(this.b);

        label1.setText(a.toString() + " " +b.toString() + operator ); 

        if(operator.equals("a")){
            label1.setText(x.add(y) + " "); 
        }else if(operator.equals("c")){
            label1.setText(x.multiply(y)+ " ");
        }else if(operator.equals("d")){
            label1.setText(x.divide(y)+ " ");
        }else if(operator.equals("b")){
            label1.setText(x.subtract(y)+ " ");
        }
        
    }
}