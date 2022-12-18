package brickbreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Gameplay extends JPanel implements KeyListener, ActionListener      //This is the class where we write the gameplay //Create its object in main class
{// Keylistener is used to get command from arrow keys

    private boolean play = false;
    private int score = 0;
    private int totalBricks= 21;

    private Timer time;
    private int delay= 8;          // Delay in timer

    private int PlayerX= 310;     // This is the starting position of our slider

    private int BallPosX = 120;  // This is for Ball Position
    private int BallPosY = 350;

    private int BallXdir = -1;   // This is for Ball direction.
    private int BallYdir = -2;



    public Gameplay()
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start;
    }
    public void paint(Graphics g)
    {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
