import java.awt.*;
import javax.swing.*;

public abstract class Shape implements Cloneable
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Constructor for objects of class Figure
     */
    public Shape(int x, int y, int w, int h)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public void setCenter(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void draw(Graphics g);
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}