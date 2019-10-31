import java.util.*;

public class ShapeModel implements Iterable<Shape>
{
    private ArrayList<Shape> shapes;
    /**
     * Constructor for objects of class ShapeModel
     */
    public ShapeModel()
    {
        shapes = new ArrayList<Shape>();
    }
    
    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }
    
    public Iterator<Shape> iterator() {
        return shapes.iterator();
    }
}