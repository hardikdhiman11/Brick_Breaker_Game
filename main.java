import javax.swing.*;
import java.awt.FlowLayout;


class main
{
    public static void main(String[] args)
    {
        Test object = new Test();
    }

}

class Test extends JFrame
{
    public Test()                                        //Default constructor overriding
    {
        JTextField t1= new JTextField(20);
        JTextField t2= new JTextField(20);
        JButton b1 = new JButton("=");
        JLabel l= new JLabel("Result");        //Creating an object f

        add(t1);
        add(t2);
        add(b1);
        add(l);


        setLayout(new FlowLayout());                                  //This is for setting the layout so the objects don`t get overrided
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Terminates the process when close button is pressed. We can also write value 3 in brackets as Exit on Close gives the value 3.
    }
}