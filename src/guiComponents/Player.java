package guiComponents;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {
    private int score;

    Rectangle rectangle ;

    public Player(int x , int y ,int score) {
        final int size = 60 ;
        this.score = score;
        rectangle = new Rectangle (x,y,size/6,size);

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     * drawing the bar for a player
     */
    void draw (Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect((int)this.rectangle.getX() , (int)this.rectangle.getY()
                ,this.rectangle.getBounds().width,(int)this.rectangle.getHeight());

    }

    /**
     * controlling the movement of the bar
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {}

    /**
     *
     * I had to determine if it's the player on the right or on the left
     * I decided to check for the x position of the pad
     *
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int speed  = 8 ;

        //movement for the right player
            if (keyCode == KeyEvent.VK_U) {
                    if (this.rectangle.getY() > 0 && this.rectangle.getX() == 0)
                        this.rectangle.setRect(rectangle.getX(), (rectangle.getY() - speed),
                                rectangle.getWidth(), rectangle.getHeight());
            }
            if (keyCode == KeyEvent.VK_D) {
                if (this.rectangle.getY() < 610 && this.rectangle.getX() == 0)
                    rectangle.setRect(rectangle.getX(), rectangle.getY() + speed,
                            rectangle.getWidth(), rectangle.getHeight());
            }

        //movement for the left player
            if (keyCode == KeyEvent.VK_UP) {
                if (this.rectangle.getY() > 0 && this.rectangle.getX() != 0)
                    this.rectangle.setRect(rectangle.getX(), (rectangle.getY() - speed),
                            rectangle.getWidth(), rectangle.getHeight());
            }
            if (keyCode == KeyEvent.VK_DOWN) {
                    if (this.rectangle.getY() < 610 && this.rectangle.getX() != 0)
                        rectangle.setRect(rectangle.getX(), rectangle.getY() + speed,
                                rectangle.getWidth(), rectangle.getHeight());
            }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
