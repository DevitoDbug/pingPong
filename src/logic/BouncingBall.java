package logic;

import guiComponents.Ball;

import java.awt.*;

public class BouncingBall {
    double x  = 0 ;
    double y = 0;
    double speed = 10 ;
    private final int size  = 10 ;

    int SCREEN_WIDTH = 500;
    int SCREEN_HEIGHT = 700;

    Ball ball ;

    public BouncingBall()
    {
        ball = new Ball(x , y , speed ,speed , size);

    }

    public void drawBall (Graphics g)
    {
        //drawing the ball on the panel
        g.setColor(Color.cyan);
        g.fillOval((int)ball.getX() ,(int)ball.getY() ,ball.getSize() ,ball.getSize());
    }

    void CheckCollison()
    {
        //creating the bouncing mechanism of the ball
        //moves the ball within the panel
        if (ball.getX()+ ball.getSize() > SCREEN_WIDTH || ball.getX()+ ball.getSize() < 0)
        {
            ball.move('x');
        }

        if (ball.getY()+ ball.getSize() > SCREEN_HEIGHT || ball.getY()+ ball.getSize() < SCREEN_HEIGHT)
        {
            ball.move('y');
        }

    }


}
