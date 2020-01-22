/*
 *
 * AccountDemo
 * Demonstration of Account class & subclasses of Account
 *
 */
class AccountDemo 
{
	public static void main(String args[])
	{
		// Create an empty account
		SafeAccount myAccount = new SafeAccount(-10);

		myAccount.deposit(320.00);
		System.out.printf ("Current balance:   $%7.2f \n", myAccount.getBalance());

		myAccount.withdraw(80.00);
		System.out.printf ("Remaining balance: $%7.2f. Overdraft Attempts: %d.\n", 
			myAccount.getBalance(), myAccount.overdraftAttempts());

		myAccount.deposit(-100.00);
		System.out.printf ("Remaining balance: $%7.2f. Overdraft Attempts: %d.\n", 
			myAccount.getBalance(), myAccount.overdraftAttempts());

		myAccount.withdraw(800.00);
		System.out.printf ("Remaining balance: $%7.2f. Overdraft Attempts: %d.\n.", 
			myAccount.getBalance(), myAccount.overdraftAttempts());

	}
}
