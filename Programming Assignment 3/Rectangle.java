/*
	Rectangle class
*/

// A rectangle.
public class Rectangle implements Resizable,Measurable {
    
    // The height of this rectangle.
   public double length;
    
    // The width of this rectangle.
   public double width;
    
    // Constructs a new rectangle with height 'h' and width 'w'.
   public Rectangle(double l, double w) {
      length = l;
      width = w;
   }
    
	 // Returns the length of the Rectangle
   public double getLength() {
      return length;
   }
    
	 // Modifies the length of the Rectangle
   public void setLength (double l) {
      length = l;
   }

	 // Returns the width of the Rectangle
   public double getWidth() {
      return width;
   }
	 
	 // Modifies the width of the Rectangle
   public void setWidth (double w) {
      width = w;;
   }
    
   public void resize (double factor)
   {
      length  = factor * length;
      width  = factor * width;
   }
    
   public double getMeasure()
   {
      return (length * width);
   }
}