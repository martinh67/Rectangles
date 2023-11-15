package assignment2;

import javax.swing.JOptionPane;

public class NewRectangleTest {
	
	public static void main(String[] args) {
		
		/* give information about the program */	
		JOptionPane.showMessageDialog(null, "Program to enter the cartesian coordinates of a rectangle", "Rectangle Calculator", JOptionPane.INFORMATION_MESSAGE);
		
		/* declare the coordinate variables needed and set them to 1 */
		double x1 = 1, y1 = 1, x2= 1, y2 = 1, x3 = 1, y3 = 1, x4 = 1, y4 = 1;
		
		/* create rectangle object */
		NewRectangle rectangle = new NewRectangle(x1, y1, x2, y2, x3, y3, x4, y4);
		
		/* if a rectangle has been entered */
		if (rectangle.isRectangle()) {
			
			/* display result */
			JOptionPane.showMessageDialog(null, rectangle.toString(), "Result", JOptionPane.INFORMATION_MESSAGE);
			
			/* if the user has entered a square */
			if (rectangle.isSquare()) {
				
			}
			
		}
		
	}

}
