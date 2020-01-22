public abstract class GameCharacter
{
// Instance variables   
   private String name;
   private int healthPoints = 100;
   private int x;
   private int y;
   
/**
   Intializes the instance variables
   @param name the name of GameCharacter
   @param x x position of GameCharacter
   @param y y position of GameCharacter
*/   
   public GameCharacter(String name,int x,int y)
   {
      this.name = name;
      this.x = x;
      this.y = y;
   }
   
/**
   Gets name of GameCharacter
   @return name name of GameCharacter

*/      
   public String getName()
   {
      return name;
   }   
/**
   sets name of GameCharacter
   @param name name of GameCharacter
   
*/      
   public void setName(String name)
   {
      this.name = name;
   }
   
/**
   Gets health points of GameCharacter
   @return healthPoints healthPoints of GameCharacter
*/      
   public int getHealthPoints()
   {
      return healthPoints;
   }
     
/**
   Sets health points of GameCharacter
   @param healthPoints healthPoints of GameCharacter 
*/      
   
   public void setHealthPoints(int healthPoints)
   {
      this.healthPoints = healthPoints; 
   }

/**
   Gets X-coordinate of GameCharacter
   @return x x-coordinate of GameCharacter
*/      
   public int getX()
   {
      return x;
   }
   
/**
   Sets X-coordinate of GameCharacter
   @param x x-coordinate of GameCharacter 
*/      
   public void setX(int x)
   {
      this.x = x;
   }
   
/**
   Gets Y-coordinate of GameCharacter
   @return y y-coordinate of GameCharacter
*/      
   public int getY()
   {
      return y;
   }
   
/**
   Sets Y-coordinate of GameCharacter
   @param y y-coordinate of GameCharacter
*/      
   public void setY(int y)
   {
      this.y = y;
   }
   
// Abstract methods 
   public abstract void move(char direction,int distance);   
   public abstract boolean attack(GameCharacter target);     
   
/**
   Returns the required strings as expected 
*/      
   public String toString()
   {
      return (name + " is left with " + healthPoints + " pts " + "at position (" + x + "," + y + ")");
   } 
      
}