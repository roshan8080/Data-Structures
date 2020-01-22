public class MySquare extends Square
{
   
   
      public MySquare(double side)
      {
          super(side);
      }
      public MySquare()
      {
         super(10.0);
      }
      public double perimeter()
      {
         return 4*getSide(); 
      }
      
      
   
   
   
 }