import java.awt.*;

public class Circle extends Ellipse
{

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int x, int y, int w, int h)
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