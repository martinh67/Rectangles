package assignment2;

/* in order to use dialogue boxes */
import javax.swing.JOptionPane;

public class RectangleTest {
	
	  public static void main(String[] args)
	  {
		/* declare rectangle object */
	    Rectangle myRectangle = new Rectangle();
	    
	    /* set the length to 3 */
	    myRectangle.setLength(3);
	    JOptionPane.showMessageDialog(null,myRectangle.getLength(), "Length",JOptionPane.INFORMATION_MESSAGE);
	    
	    /* set the width to 5 */
	    myRectangle.setWidth(5);
	    JOptionPane.showMessageDialog(null,myRectangle.getWidth(), "Width",JOptionPane.INFORMATION_MESSAGE);
	    
	    /* set the length to 25 which is out of range */
	    myRectangle.setLength(25);
	    JOptionPane.showMessageDialog(null,myRectangle.getLength(), "Length",JOptionPane.INFORMATION_MESSAGE);
	    
	    /* set the width to -7 which is out of range */
	    myRectangle.setWidth(-7);
	    JOptionPane.showMessageDialog(null,myRectangle.getWidth(), "Width",JOptionPane.INFORMATION_MESSAGE);
	    
	    /* set the length to 14 */
	    myRectangle.setLength(14);
	    JOptionPane.showMessageDialog(null,myRectangle.getLength(), "Length",JOptionPane.INFORMATION_MESSAGE);
	   
	    /* set the width to 19 */
	    myRectangle.setWidth(19);
	    JOptionPane.showMessageDialog(null,myRectangle.getWidth(), "Width",JOptionPane.INFORMATION_MESSAGE);
	    
	    /* display the final result of the rectangle */
	    JOptionPane.showMessageDialog(null,myRectangle.toString(), "Result",JOptionPane.INFORMATION_MESSAGE);
	    
	  }

}
