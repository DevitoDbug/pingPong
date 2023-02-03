package guiComponents;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {
    private int score;
    Rectangle rectangle ;
    Color color;

    public Player(int x , int y ,int score, Color color) {
        final int size = 84 ;
        this.color = color;
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
    void draw (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.setColor(this.color);
        g2.drawRoundRect((int)this.rectangle.getX() , (int)this.rectangle.getY()
                ,this.rectangle.getBounds().width,(int)this.rectangle.getHeight(),10, 10);
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
                if (this.rectangle.getY() > 0 && this.rectangle.getX() < 450)
                    this.rectangle.setRect(this.rectangle.getX(), (this.rectangle.getY() - speed),
                            this.rectangle.getWidth(), this.rectangle.getHeight());
            }
            if (keyCode == KeyEvent.VK_D) {
                if (this.rectangle.getY() < 610 && this.rectangle.getX() < 450)
                    this.rectangle.setRect(this.rectangle.getX(), this.rectangle.getY() + speed,
                            this.rectangle.getWidth(), this.rectangle.getHeight());
            }

        //movement for the left player
            if (keyCode == KeyEvent.VK_UP) {
                if (this.rectangle.getY() > 0 && this.rectangle.getX() > 450)
                    this.rectangle.setRect(this.rectangle.getX(), (this.rectangle.getY() - speed),
                            this.rectangle.getWidth(), this.rectangle.getHeight());
            }
            if (keyCode == KeyEvent.VK_DOWN) {
                if (this.rectangle.getY() < 610 && this.rectangle.getX() > 450)
                    this.rectangle.setRect(this.rectangle.getX(), this.rectangle.getY() + speed,
                            this.rectangle.getWidth(), this.rectangle.getHeight());
            }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
