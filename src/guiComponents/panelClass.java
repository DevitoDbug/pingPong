package guiComponents;

import logic.BouncingBall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panelClass extends JPanel implements ActionListener {
    Player player1;
    Player player2;
    BouncingBall bouncingBall;
    Timer timer ;
    panelClass()
    {

        timer = new Timer(1,this);
        timer.start();
        player1 = new Player(5,0 ,0 ,"Player 1", Color.cyan);

        player2 = new Player(857, 0 ,0 ,"Player 2", Color.magenta);


        this.addKeyListener(player1);
        this.addKeyListener(player2);
        this.setFocusable(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);

    }

    public void paintComponent(Graphics g)
    {
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
        g.drawString("Player1: "+player1.getScore() , 300 , 25 );
        g.drawString("Player2: "+player2.getScore(), 480 , 25 );

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
