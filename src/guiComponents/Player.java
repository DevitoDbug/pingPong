package guiComponents;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {
    /**
     * x position of the bar
     */
    private int x ;

    /**
     * y position of the bar
     */
    private int y;

    private int score;
    private final String name ;
    private final Color color;
    private final int size = 50 ;

    public Player(int x , int y ,int score, String name, Color color) {
        this.score = score;
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y ;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     * drawing the bar for a player
     */
    void draw (Graphics g)
    {
        g.setColor(this.getColor());
        g.fillRect(this.getX() , this.getY() ,this.size/2 ,this.size);
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
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    if (this.getY() > 0 && this.getX() == 0)
                        this.y -= 2 ;
                    break;
                case KeyEvent.VK_DOWN:
                    if (this.getY() < 600 && this.getX() == 0 )
                        this.y += 2 ;
                    break;
                case KeyEvent.VK_U:
                    if (this.getY() > 0 && this.getX() != 0)
                        this.y -= 2 ;
                    break;
                case KeyEvent.VK_D:
                    if (this.getY() < 600 && this.getX() != 0)
                        this.y += 2 ;
                    break;
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
