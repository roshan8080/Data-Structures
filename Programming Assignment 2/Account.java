/*
 *
 * Account
 * Demonstration for Java  tutorial
 */
public class Account 
{
        private double balance;

        // Constructor to initialise balance
        public Account( double amount )
        {
                balance = amount;  
        }

        // Overloaded constructor for empty balance
        public Account()
        {
                this(0.0);
        }

        public void deposit( double amount )
        {
                balance += amount;
        }

        public void withdraw( double amount )
        {
                balance -= amount;
         }

        public double getBalance()
        {
                return balance;
        }
}  
