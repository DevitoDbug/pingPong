package guiComponents;

public class Ball {

    double x ;
    double y ;
    double xVelocity;
    double yVelocity;
    int size ;

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

    public void move(char axis)
    {

    }
}
