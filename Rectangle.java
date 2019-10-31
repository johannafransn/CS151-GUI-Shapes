import java.awt.*;

public class Rectangle extends Shape
{

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int x, int y, int w, int h)
    {
        super(x, y, w, h);
    }
    
    public void draw(Graphics g) {
        g.drawRect(getX() - getWidth() / 2, 
            getY() - getHeight() / 2, 
            getWidth(), 
            getHeight());
    }
}