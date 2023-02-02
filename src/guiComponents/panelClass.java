package guiComponents;

import logic.BouncingBall;
import logic.KeyListenerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class panelClass extends JPanel implements ActionListener {
    String player1Name = "Player1 :";
    String player2Name = "Player2 :";

    BouncingBall bouncingBall;
    public Player player1;
    public Player player2;
    Timer timer ;
    panelClass() {
        timer = new Timer(1,this);
        timer.start();
        player1 = new Player(0,0 ,0 );

        player2 = new Player(869, 0 ,0 );

        bouncingBall = new BouncingBall();

        KeyListenerClass keyListenerClass = new KeyListenerClass(this);

        this.addKeyListener(player1);
        this.addKeyListener(player2);
        this.addKeyListener(keyListenerClass);
        this.setFocusable(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        player1.draw(g);
        g.setColor(Color.magenta);
        player2.draw(g);

        //the line dividing the panel
        g.setColor(Color.gray);
        g.drawLine(450, 0 , 450 , 700);

        //Printing the player name and the scores
        g.setColor(Color.LIGHT_GRAY);
        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.drawString(player1Name +player1.getScore() , 300 , 25 );
        g.drawString(player2Name +player2.getScore(), 480 , 25 );

        //drawing the ball in the panel
        bouncingBall.drawGame(g);
        padImpact();
        bouncingBall.updatePosition();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    /**
     * Method to check for collisions with the player pad and bounce the ball back
     */
    public void padImpact()
    {
        //checking if player one hits the ball
       if(bouncingBall.ball.oval.intersects(player1.rectangle))
       {
           bouncingBall.ball.setxVelocity(bouncingBall.ball.getxVelocity() * -1);
           player1.setScore(player1.getScore()+1);
       }

       //checking if player 2 hits the ball
        if(bouncingBall.ball.oval.intersects(player2.rectangle))
        {
            bouncingBall.ball.setxVelocity(bouncingBall.ball.getxVelocity() * -1);
            player2.setScore(player2.getScore()+1);
        }
    }

    public void PauseGame()
    {
        timer.stop();
    }

    public void ContinuePlay()
    {
        timer.start();
    }
    public void EndGame()
    {
        timer.stop();
    }

    public void ReplayGame()
    {
        timer.restart();
    }
}
