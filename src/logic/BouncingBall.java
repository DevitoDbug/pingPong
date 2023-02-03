package logic;

import guiComponents.Ball;

import java.awt.*;

public class BouncingBall {
    double speed = 3 ;

    /**
     * Maximum x and y for the ball to reach
     */
    final int BOTTOMy  = 650 ;


    public Ball ball ;

    public BouncingBall(double x, double y) {
        ball = new Ball(x , y , speed ,speed);
    }

    public void updatePosition () {
        if (ball.oval.getY() >= BOTTOMy || ball.oval.getY() < 0) {
            //reversing the y direction of the ball
            ball.setyVelocity(ball.getyVelocity() * -1);
        }
        //moving the ball
        ball.updatePosition();
    }

    public void drawGame(Graphics g) {
        //drawing the ball on the panel
        g.setColor(Color.red);
        g.fillOval((int)ball.oval.getX() ,(int)ball.oval.getY() ,
                (int)ball.oval.getWidth(),(int)ball.oval.getHeight());
    }
}
