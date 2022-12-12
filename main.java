import javax.swing.*;

public class main
{
    //Hello world using java Swing
    public static void main(String[] args)
    {
        Test object= new Test();
    }

}
class Test extends JFrame
{
    //Using the constructor of JFrame
    public Test()
    {
        JLabel l = new JLabel("Hello World");
        add(l);
        setVisible(true);
        setSize(400,400);
    }
}
