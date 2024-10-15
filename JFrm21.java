import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.ChangeEvent; 
import javax.swing.event.ChangeListener;
class JFrm21 extends JFrame 
{
    JLabel l1,l2;
    JSeparator s1;
    JFrm21()
    {
        super("Seperator");
        l1=new JLabel("Above Seperator");
        l2=new JLabel("Below Seperator");

        s1=new JSeparator();
        setLayout(new GridLayout(0,1));
        add(l1);
        add(s1);
        add(l2);
        setSize(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        JFrm21 a=new JFrm21();
    }
}