package August21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener//(listener interface)
{
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;
    public Calculator()
    {
        l1 = new JLabel("Enter First Number : ");
        l2 = new JLabel("Enter Second Number : ");
        l3 = new JLabel("Result : ");
        l4 = new JLabel("Calculator");
        
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        
        b1 = new JButton(" + ");
        b2 = new JButton(" - ");
        b3 = new JButton(" * ");
        b4 = new JButton(" / ");
        
        l1.setBounds(100, 100, 200, 50);
        l2.setBounds(100, 200, 200, 50);
        l3.setBounds(100, 500, 200, 50);
        l4.setBounds(300, 50, 70, 40);
        
        t1.setBounds(400, 100, 200, 50);
        t2.setBounds(400, 200, 200, 50);
        t3.setBounds(400, 500, 200, 50);
        
        b1.setBounds(100, 350, 70, 70);
        b2.setBounds(200, 350, 70, 70);
        b3.setBounds(300, 350, 70, 70);
        b4.setBounds(400, 350, 70, 70);
        
        //adding listeners with components
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        t3.setEditable(false);
        
        add(l1);    add(l2);    add(l3); add(l4);
        add(t1);    add(t2);    add(t3);
        add(b1);    add(b2);    add(b3);    add(b4);
        setSize(700, 700);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) 
    {    
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if(e.getSource() == b1)
        {
            int n3 = n1 + n2;
            t3.setText(n3+"");
        }
        else if(e.getSource() == b2)
        {
            int n3 = n1 - n2;
            t3.setText(n3+"");
        }
        else if(e.getSource() == b3)
        {
            int n3 = n1 * n2;
            t3.setText(n3+"");
        }
        else if(e.getSource() == b4)
        {
            int n3 = n1 / n2;
            t3.setText(n3+"");
        }
    }
    
    public static void main(String[] args) 
    {
        new Calculator().setVisible(true);
    }
}