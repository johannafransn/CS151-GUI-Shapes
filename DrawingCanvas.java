import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * Write a description of class DrawingCanvas here
 *
 * 
 */
public class DrawingCanvas extends JPanel
{
    /**
     * Constructor for objects of class DrawingCanvas
     */
    private ShapeModel shapeModel;
    
    
    public DrawingCanvas()
    {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setBackground(Color.YELLOW);
        shapeModel = new ShapeModel();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Iterator it = shapeModel.iterator();
        
        while (it.hasNext()) {
            Shape shape = (Shape) it.next();
            shape.draw(g);
        }
    }
    
    public void addShape(Shape newShape) {
        shapeModel.addShape(newShape);
        repaint();
    }
    
    public void clearShapes ()
    {
    	//returns iterator from current collection
    	Iterator it = shapeModel.iterator();
    	
    	//time to traverse each element one at a time
    	while (it.hasNext()  ) 
    	{
    		//get the current element first to get pointer
    		
    		it.next();
    		it.remove();
    		
    		//after we removed all them we need to repaint
    		
    		
    		
    	}
    }
    
}
