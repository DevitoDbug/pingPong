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
        player1 = new Player(0 , 0  , 0 , "Player 1" , Color.cyan);

        this.addKeyListener(player1);
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


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
