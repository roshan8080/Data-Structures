public class SafeAccount extends Account
{
   int count = 0;   
   
   public SafeAccount(double balance)
   {
      super(balance);
      if (balance < 0)
      {
         super.deposit(balance * (-1));
      }
   }
   
   public void deposit(double amount)
   {
      if (amount < 0)
      {
         
      }
      else
      {
         super.deposit(amount);
      }
   }
   
   public void withdraw(double amount)
   {
      if (amount > getBalance())
      {
         count++;
      }
      else
      {
         super.withdraw(amount);
      }
   }
    
   public int overdraftAttempts()
   {
      return count;
   }       
   
}