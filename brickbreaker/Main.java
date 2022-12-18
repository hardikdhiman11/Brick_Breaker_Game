package brickbreaker;

import javax.swing.*;

public class Main
{
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();

        obj.setBounds(10,10,700,600);
        obj.setTitle("Just Break It");
        obj.setResizable(false);        // This means that it can`t be resized
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //For closing when cross button is pressed
        obj.setVisible(true);
        obj.add(gameplay);

    }
}
