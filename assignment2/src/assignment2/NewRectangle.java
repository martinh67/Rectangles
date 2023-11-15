package assignment2;

import javax.swing.JOptionPane;

public class NewRectangle {
	
	
	/* declare the coordinate variables*/
	private double x1, y1, x2, y2, x3, y3, x4, y4;
	
	/* the no argument constructor */
	public NewRectangle() {
		
		/* call set coordinates and default these to 1 */
		setCoordinates(1, 1, 1, 1, 1, 1, 1, 1);
	}
	
	public NewRectangle(double x1, double y1, double x2, double y2,
						double x3, double y3, double x4, double y4) {
		
		setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	/* set the coordinates to the user input if within range */
	public void setCoordinates(double x1Input, double y1Input, double x2Input, double y2Input, double x3Input, 
								double y3Input, double x4Input, double y4Input) {
		
		
		x1 = getCoordinate("x1", x1Input);
		y1 = getCoordinate("y1", y1Input);
		x2 = getCoordinate("x2", x2Input);
		y2 = getCoordinate("y2", y2Input);
		x3 = getCoordinate("x3", x3Input);
		y3 = getCoordinate("y3", y3Input);
		x4 = getCoordinate("x4", x4Input);
		y4 = getCoordinate("y4", y4Input);
		
		/* catch if the coordinates do not make a rectangular shape */
		if (!isRectangle()) {
			
			/* display message */
			JOptionPane.showMessageDialog(null, "The coordinates provided do not make a rectangular shape", "Not a Rectangle", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
	
	public double getCoordinate(String coord, double c) {
		
		do {	
			
			try {
				/* ask the user for coordinate */
				String cStr = JOptionPane.showInputDialog(null, "Enter the value of " + coord, coord, JOptionPane.INFORMATION_MESSAGE);
				
				/* convert the width to a double */
				c = Double.parseDouble(cStr);
				
				/* break out of the loop if the user enters 1 or 2 */
				if (c >= 0 && c <= 20) 
				{
					/* break out of the loop */
					break;
					
					
				}
				
				/* if the user enters a negative number */	
				else {
					
					/* display error message */
					JOptionPane.showMessageDialog(null, "The number is out of range", "Out of Range",JOptionPane.INFORMATION_MESSAGE);
					
				}
			
			} 
			/* catch any symbols or characters entered */
			catch(NumberFormatException e) 
			
				{
				/* display error message */
				JOptionPane.showMessageDialog(null, "Invalid input please enter a number", "Number Not Entered", JOptionPane.INFORMATION_MESSAGE);
		
			    }
			
		} while (true);
		
		return c;
		
		
		
	}
	
	/* method to calculate the distance of Cartesian coordinates */
	public double distance(double x1, double y1, double x2, double y2) {
		
		return Math.sqrt((Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2))));
	}
	
	/* method to check that a rectangle has entered */
	public boolean isRectangle() {
		
		double side1 = distance (x1, y1, x2, y2);
		double side2 = distance (x2, y2, x3, y3);
		double side3 = distance (x3, y3, x4, y4);
		
		
		if (side1 * side1 + side2 * side2 == side2 * side2 + side3 * side3) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}
	
	/* method to check if the rectangle is actually a square */
	public boolean isSquare() {
		
		/* if the length is the same as the width */
		if (getLength() == getWidth()) {
			
			/* display square message */
			JOptionPane.showMessageDialog(null, "This is a square", "Square", JOptionPane.INFORMATION_MESSAGE);
			
			return true;
		}
		
		/* if the length is not the same as the width */
		else {
			
			return false;
		}
		
	}
	
	/* gets the length of the rectangle */
	public double getLength() {
		
		double side1 = distance (x1, y1, x2, y2);
		double side2 = distance (x2, y2, x3, y3);
		
		return (side1 > side2 ? side1 : side2);
	}
	
	/* gets the width of the rectangle */
	public double getWidth() {
		
		double side1 = distance (x1, y1, x2, y2);
		double side2 = distance (x2, y2, x3, y3);
		
		return (side1 < side2 ? side1 : side2);
	}
	
	/* calculates the perimeter of the rectangle */
	public double calculatePerimeter() {
		
		return (2 * getLength() + 2 * getWidth());
	}
	
	/* calculates the area of the rectangle */
	public double calculateArea() {
		
		return (getLength() * getWidth());
	}
	
	/* gives the result in a readable format */
	public String toString() {
		
		return String.format("%s: %f\n%s: %f\n%s: %f\n%s: %f", "Length", 
			getLength(), "Width", getWidth(), "Perimeter", calculatePerimeter(), "Area", calculateArea());
	}

	
}
