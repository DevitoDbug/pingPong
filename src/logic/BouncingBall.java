package logic;

import guiComponents.Ball;

import java.awt.*;

public class BouncingBall {
    double x  = 0 ;
    double y = 0;
    double speed = 10 ;
    private final int size  = 10 ;

    /**
     * Maximum x and y for the ball to reach
     */
    final int BOTTOMx  = 873 ;
    final int BOTTOMy  = 650 ;

    Ball ball ;
    public BouncingBall()
    {
        ball = new Ball(x , y , speed ,speed , size);

    }

    public void updatePosition ()
    {
        //check if the wall is hit
        if (ball.getX() > BOTTOMx || ball.getX() < 0 )
        {
            //Reversing the x direction of the ball
            ball.setxVelocity(ball.getxVelocity() * -1);
        }
        if (ball.getY() > BOTTOMy || ball.getY() < 0)
        {
            //reversing the y direction of the ball
            ball.setyVelocity(ball.getyVelocity() * -1);
        }

        //moving the ball
        ball.updatePosition();

    }

    public void drawBall (Graphics g)
    {
        //drawing the ball on the panel
        g.setColor(Color.cyan);
        g.fillOval((int)ball.getX() ,(int)ball.getY() ,ball.getSize() ,ball.getSize());
    }

}
