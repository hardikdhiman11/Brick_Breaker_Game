package brickbreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;


public class Gameplay extends JPanel implements KeyListener, ActionListener      //This is the class where we write the gameplay //We will create its object in main class and will call it from there
{  // Keylistener is used to get command from keyboard keys
    //Action Listener is used for doing the actions

    private boolean play = false;      // Attributes which will be used in our class Gameplay
    private int score = 0;
    private int totalBricks= 21;

    private Timer timer;
    private int delay=8;          // Delay in timer

    private int PlayerX= 310;     // This is the starting position of our slider

    private int BallPosX = 120;  // This is for Ball Position
    private int BallPosY = 350;

    private int BallXdir = -1;   // This is for Ball direction.
    private int BallYdir = -2;



    public Gameplay()    // This constructor will be called when we create an object of this class in the main class
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }


    public void paint(Graphics g)
    {   // This is for background
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);

        //This is for the paddle
        g.setColor(Color.green);
        g.fillRect(PlayerX,550,100,8);

        //This is for creating ball
        g.setColor(Color.yellow);
        g.fillOval(BallPosX,BallPosY,20,20);
        g.dispose();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play)
        {
            if(new Rectangle(BallPosX,BallPosY,20,20).intersects(new Rectangle(PlayerX,550,100,8))){BallYdir = -BallYdir;}
            BallPosX+=BallXdir;
            BallPosY+=BallYdir;
            if(BallPosX<0)
            {
                BallXdir = -BallXdir;
            }
            if(BallPosY<0)
            {
                BallYdir = -BallYdir;
            }
            if(BallPosX>670)
            {
                BallXdir = -BallXdir;
            }


        }
        repaint();  // This will recall the paint method
    }

    //Key typed and key released are not going to be used hence we will keep them empty
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    //This will be used for moving the slider
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT ){
                           if(PlayerX >= 600) {PlayerX=600;}
                            else {moveLeft();}
                        }

        else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
                            if (PlayerX < 10) {PlayerX = 10;}
                            else {moveRight();}
                        }
    }

    public void moveLeft()
    {
        play= true;
        PlayerX-=20;
    }
    public void moveRight()
    {
        play= true;
        PlayerX+=20;
    }

}
