import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class DrawingFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingFrame extends JFrame
{
    private DrawingCanvas drawingCanvas;
    private JTextField status;
    
    public DrawingFrame() {
            this.setTitle("Drawing Application");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            //this.setPerfered
            
            drawingCanvas = new DrawingCanvas();
            //this.add(drawingCanvas);
            
            JPanel toolBarPanel = toolStatusPanel();
            this.add(drawingCanvas, BorderLayout.CENTER);
            this.add(toolBarPanel, BorderLayout.SOUTH);
            
            
    }
    
    private JPanel toolStatusPanel() {
        // add 4 buttons
        JPanel toolBarPanel = new JPanel();
        Dimension buttonSize = new Dimension(100, 40);
        
        JButton ellipse = new JButton("Ellipse");
        ellipse.setPreferredSize(buttonSize);
        
        JButton circle = new JButton("Circle");
        circle.setPreferredSize(buttonSize);
        
        JButton rectangle = new JButton("Rectangle");
        rectangle.setPreferredSize(buttonSize);
        
        JButton square = new JButton("Square");
        square.setPreferredSize(buttonSize);
        
        toolBarPanel.add(ellipse);
        toolBarPanel.add(circle);
        toolBarPanel.add(rectangle);
        toolBarPanel.add(square);
        
        JPanel toolStatusPanel = new JPanel();
        status = new JTextField(20);
        toolStatusPanel.setLayout(new BorderLayout());
        status.setPreferredSize(new Dimension(20,40));
        
        
        toolStatusPanel.add(toolBarPanel, BorderLayout.CENTER);
        toolStatusPanel.add(status, BorderLayout.SOUTH);
        
        CanvasEditor canvasEditor = new CanvasEditor(new Ellipse(0,0,100,60));
        
        ellipse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                canvasEditor.setCurrentShape(new Ellipse(0,0,100,60));
                status.setText("Ellipse Selected");
            }
        });
        
        circle.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                canvasEditor.setCurrentShape(new Circle(0,0,60,60));
                status.setText("Circle Selected");
            }
        });
        rectangle.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                canvasEditor.setCurrentShape(new Rectangle(0,0,100,60));
                status.setText("Rectangle Selected");
            }
        });
        
        square.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                canvasEditor.setCurrentShape(new Square(0,0,60,60));
                status.setText("Square Selected");
            }
        });
        
        drawingCanvas.addMouseListener(canvasEditor);
        
        return toolStatusPanel;
    }
    
}