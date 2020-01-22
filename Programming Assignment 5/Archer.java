public class Archer extends GameCharacter
{
   
/**
   Initializes instance variables of Archer class 
*/   
   public Archer(String name,int x,int y)
   {
      // Calls constructor of GameCharacter
      super(name,x,y);
   }
   
/**
   Defines movement of Archer
   @param direction This defines which direction to move
   @distance This defines what distance to move
*/
   public void move(char direction,int distance)
   {
      // GameCharacter moves only if its health point is greater than or equal to 10
      if (super.getHealthPoints() >= 10)
      {
         if (distance <=0)
         {
            distance = 0;
            if (direction == 'N')
            {
            // Sets Y-coordinate of Archer after perfoming movement
               super.setY(super.getY() + distance);           
            }
            
            else if (direction == 'S')
            {
               super.setY(Math.abs(super.getY() - distance));           
            }
            
            else if (direction == 'E')
            {
            // Sets X-coordinate of Archer after perfoming movement
               super.setX(super.getX() + distance);           
            }
            
            else if (direction == 'W')
            {
               super.setX(Math.abs(super.getX() - distance));           
            }
         
         }
         
         else if (distance >= 5)
         {
            distance = 5;
            if (direction == 'N')
            {
               super.setY(super.getY() + distance);           
            }
            
            else if (direction == 'S')
            {
               super.setY(Math.abs(super.getY() - distance));           
            }
            
            else if (direction == 'E')
            {
               super.setX(super.getX() + distance);           
            }
            
            else if (direction == 'W')
            {
               super.setX(Math.abs(super.getX() - distance));           
            }
         
         }
         if (distance > 0 && distance < 5)
         {
         
            if (direction == 'N')
            {
               super.setY(super.getY() + distance);           
            }
            
            else if (direction == 'S')
            {
               super.setY(Math.abs(super.getY() - distance));           
            }
            
            else if (direction == 'E')
            {
               super.setX(super.getX() + distance);           
            }
         
            if (direction == 'W')
            {
               super.setX(Math.abs(super.getX() - distance));           
            }
         } 
      }    
   }
     
/**
   Performs attack
   @target the target being attacked
*/
   public boolean attack(GameCharacter target)
   {
      // Represents whether attack was successful or unsuccessful
      boolean flag = false;
      
      // Calculates distance between Archer and target
      int distance = (int)(Math.sqrt(Math.pow(getX() - target.getX(),2) + Math.pow(getY() - target.getY(),2)));
      
      // Attacks only when distance between Archer and target is less than 30 and target health poins is more than 10
      if (distance <= 30 && !(target.getHealthPoints() < 10))
      {
         // Sets target health point after reducing its health point by 10 
         target.setHealthPoints(target.getHealthPoints() - 10);      
         
         // Sets target health point 0 if it is less than 0
         if (target.getHealthPoints() < 0)
         {
            target.setHealthPoints(0);
         }
         
         flag = true;
      }
      
      // Returns whether attack was successful or unsuccessful 
      return flag;
   }
    
/**
   Returns the required strings as expected 
*/
   public String toString()
   {
      // Calls toString() method of GameCharacter and returns it
      return (super.toString() + ",");
   }     
}