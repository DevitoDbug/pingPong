package guiComponents;

import java.awt.*;

public class Ball {

    private double x ;
    private double y ;
    private double xVelocity;
    private double yVelocity;
    private final int size ;
    private Color color  = Color.white;

    public Ball(double x, double y, double xVelocity, double yVelocity, int size) {
        this.x = x;
        this.y = y;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.size = size;
        
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public int getSize() {
        return size;
    }

    public Color getColor1() {
        return color;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void updateSpeed ()
    {
        this.xVelocity += 1 ;
        this.yVelocity += 1 ;
    }

    public void updatePosition()
    {
        x += xVelocity;
        y += yVelocity;
    }
}
