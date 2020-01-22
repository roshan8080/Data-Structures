/** 
 *
 *
 * A small program to test the classes in the Shape hierarchy.
 *
 *    
 */

public class RectangleTest {
        
   public static void main(String[] args)
   {    
      Measurable obj1 = new Rectangle(3, 4);
      Rectangle robj2 = new Rectangle(4, 5);
      Resizable  obj2 = robj2;   
        
      System.out.printf("%5.2f\n", obj1.getMeasure());  // 12 expected
      obj2.resize(0.5);
      System.out.printf("%5.2f\n", robj2.getMeasure());
   }
}