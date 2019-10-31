import java.awt.*;

public class Ellipse extends Shape
{

    /**
     * Constructor for objects of class Ellipse
     */
    public Ellipse(int x, int y, int w, int h)
    {
        super(x, y, w, h);
    }
    
    public void draw(Graphics g) {
        g.drawOval(getX() - getWidth() / 2, 
            getY() - getHeight() / 2, 
            getWidth(), 
            getHeight());
    }
}