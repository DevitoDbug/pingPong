package guiComponents;

import logic.BouncingBall;

import javax.swing.*;
import java.awt.*;

public class panelClass extends JPanel {
    BouncingBall bouncingBall;
    Timer timer ;
    panelClass()
    {
        timer = new Timer(20,null);
        bouncingBall = new BouncingBall();
        timer.start();

        this.setBackground(Color.BLACK);
        this.setVisible(true);

    }

    void drawComponent (Graphics g)
    {
        super.paintComponent(g);
        bouncingBall.drawBall(g);

    }
}
