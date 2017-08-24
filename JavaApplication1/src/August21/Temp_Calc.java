package August21;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Temp_Calc extends JFrame 
{
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;
    public Temp_Calc()
    {
        l1 = new JLabel("Temperature in Celsius : ");
        l2 = new JLabel("Temperature in Farenheit : ");
        l3 = new JLabel("Temperature Calculator");
        
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        b1 = new JButton(" Calculate ");
        
        l1.setBounds(100, 100, 200, 50);
        l2.setBounds(100, 200, 200, 50);
        l3.setBounds(250, 25, 200, 70);
        
        
        t1.setBounds(400, 100, 200, 50);
        t2.setBounds(400, 200, 200, 50);
        
        b1.setBounds(275, 290, 100, 70);
        
        add(l1);    add(l2); add(l3);
        add(t1);    add(t2);
        add(b1);    
        setSize(700, 700);
        setLayout(null);
    }
    
    public static void main(String[] args) 
    {
        new Temp_Calc().setVisible(true);
    }
}