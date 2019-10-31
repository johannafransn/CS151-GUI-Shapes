import java.awt.event.*;

/**
 * Write a description of class CanvasEditor here.
 *
 * 
 */
public class CanvasEditor implements MouseListener
{
    private Shape currentShape;
    
    public CanvasEditor(Shape initialShape)
    {
        this.currentShape = initialShape;
        
    }
    
    public void setCurrentShape( Shape currentShape) 
    {
        this.currentShape = currentShape;
    }
    
    public void mouseClicked(MouseEvent e) 
    {
        Shape newShape = (Shape) currentShape.clone();
        newShape.setCenter(e.getX(), e.getY());
        DrawingCanvas drawingCanvas = (DrawingCanvas) e.getSource();
        drawingCanvas.addShape(newShape);
        
    }
    
    //include mouses pressed entered exited released
    @Override
    public void mousePressed(MouseEvent m) {}
    @Override
    public void mouseEntered(MouseEvent m) {}
    @Override
    public void mouseReleased(MouseEvent m) {}
    @Override
    public void mouseExited(MouseEvent m) {}
}