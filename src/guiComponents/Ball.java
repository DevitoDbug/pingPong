package guiComponents;

import java.awt.geom.Ellipse2D;

public class Ball {

    private double xVelocity;
    private double yVelocity;
    public Ellipse2D oval;

    public Ball(double x, double y, double xVelocity, double yVelocity) {
        final int size = 20;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        oval = new Ellipse2D.Double(x, y, size, size);
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void updatePosition()
    {
        oval.setFrame(oval.getX()+ xVelocity, oval.getY()+yVelocity,
                oval.getWidth(),oval.getHeight());
    }

    public void updateSpeed()
    {
        xVelocity ++ ;
    }
}
