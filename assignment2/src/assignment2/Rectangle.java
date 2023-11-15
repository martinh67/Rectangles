package assignment2;

/* in order to use dialogue boxes */
import javax.swing.JOptionPane;

public class Rectangle {
	
	/* declare the variables needed */
	private float length;
	private float width;
	
	public Rectangle() {
		
		/* set the default values of length and width */
		this.length = 1.0F;
		this.width = 1.0F;
		
		/* inform that new rectangle object has been created */
		JOptionPane.showMessageDialog(null, "New Rectangle object created.","Rectangle Object", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/* set the length and width of the rectangle */
	public Rectangle(float length, float width) {
		
		this.setLength(length);
		this.setWidth(width);
	}
	
	/* gets the length of the rectangle */
	public float getLength() {
		
		return length;
		
	}
	
	/* gets the width of the rectangle */
	public float getWidth() {
		
		return width;
	}
	
	
	/* sets the width of the rectangle */
	public void setWidth(float width) {
		
		/* if the width given is within range */
		if (inRange(width)) {
			
			this.width = width;
		}
		
	}
	
	/* sets the length of the rectangle */
	public void setLength(float length) {
		
		/* if the length given is within range */
		if (inRange(length)) {
			
			this.length = length;
			
		}
		
	}
	
	/* checks if the value is within range */
	private boolean inRange(float value) {
		
		try {
		
			if (value > 0 && value <= 20) {
				
				return true;
			}
			
			else {
				
				JOptionPane.showMessageDialog(null, "Value out of range.");
				return false;
			
			}
			
		}
		
		catch (NumberFormatException e){
			
			JOptionPane.showMessageDialog(null, "Please enter a number");
			return false;
		}
		
	}
	
	/* method to calculate the perimeter of the rectangle */
	public float calculatePerimeter() {
		
		float perimeter;
		
		perimeter = (2 * this.length) + (2 * this.width);
		
		return perimeter;
		
	}
	
	/* method to calculate the area of the rectangle */
	public float calculateArea() {
		
		float area;
		
		area = this.length * this.width;
		
		return area;
		
	}
	
	/* gives the result in a readable format */
	public String toString() {
		
		return String.format("%s: %f\n%s: %f\n%s %f\n%s %f", 
				"Length", length, "Width", width, "Perimeter", calculatePerimeter(), "Area", calculateArea());
	}

}
