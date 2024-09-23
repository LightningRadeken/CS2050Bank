// Malachi Mooty
// Program 4
// Bank program
import java.util.Random;
import java.util.Scanner;

public class Bank 
{
	// users name variable and program start
	public static String name = "";
	public static void main(String[] args)
	{
		
		// initalizing the variables to be used
		int selection = 0;
		double rateMin = .015;
		double rateMax = .055;
		double balanceCheck;
		double balanceSave;
		boolean running = true;
		double rate = new Random().nextDouble();
		double iRate = (rateMin +(rate *(rateMax-rateMin)))*100;
		
		//establishing the scanners
		Scanner userName = new Scanner(System.in);
		Scanner numSelect = new Scanner(System.in);
		Scanner balanceStartC = new Scanner(System.in);
		Scanner balanceStartS = new Scanner(System.in);
		
		//setting up the account
		System.out.println("Welcome user to our banking application.\n");
		System.out.println("\nFirst things first, What is your name?: ");
		name = userName.next();
		System.out.println("\n\nOkay " + name + " What is your checking balance: ");
		balanceCheck = balanceStartC.nextDouble();
		System.out.println("\nWhat is your savings balance: ");
		balanceSave = balanceStartS.nextDouble();
		System.out.println("\n\nThank you for this information now you have a few options:\n");
		Accounts bankAccount = new Accounts(balanceCheck, balanceSave);
		
		// loop for user to look over their account information and leave the program
		while( running == true)
		{
			System.out.println("1. Checking Balance\n2. Savings Balance\n3. Account Info\n4. Close Operation");
			selection = numSelect.nextInt();
			if (selection == 1)
			{
				//displays the users checking balance
				System.out.println("Here is your Balance: $" + bankAccount.getChecking());
				System.out.print("\n\n");
			}
			if (selection == 2)
			{
				//displays the users savings balance
				System.out.println("Here is your Balance: $" + bankAccount.getSavings());
				System.out.print("\n\n");
			}
			if (selection == 3)
			{
				//displays all account information with interest rate
				System.out.println("Here is your Account balances:");
				System.out.println("Checking: $" + bankAccount.getChecking());
				System.out.println("Savings: $" + bankAccount.getSavings());
				System.out.printf("Your savings account interest rate: %.2f",iRate);
				System.out.print("%\n\n");
				
			}
			if (selection == 4)
			{
				// escape from the loop
				System.out.println("\nThank you for using this app and have a nice day.");
				running = false;
			}
		}
		
		//closes the scanners
		userName.close();
		balanceStartS.close();
		numSelect.close();
		balanceStartC.close();
	}
	

}
