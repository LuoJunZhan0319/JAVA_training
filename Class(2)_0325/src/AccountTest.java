import javax.swing.JOptionPane; // For the JOptionPane class

/**
 * This program demonstrates the BankAccount class.
 */

public class AccountTest {
	public static void main(String[] args) {
		String input; // To hold user input //1

		// Get the starting balance.
		input = JOptionPane.showInputDialog("What is your account's starting balance?");  //2

		// Create a BankAccount object.
		BankAccount account = new BankAccount(input);  //3  6

		// Get the amount of pay.
		input = JOptionPane.showInputDialog("How much were you paid this month?");  //7

		// Deposit the user's pay into the account.
		account.deposit(input);  //8

		// Display the new balance.
		JOptionPane.showMessageDialog(null, String
				.format("Your pay has been deposited.\n" + "Your current balance is $%,.2f", account.getBalance()));  //11 13

		// Withdraw some cash from the account.
		input = JOptionPane.showInputDialog("How much would you like to withdraw?"); //14
		account.withdraw(input);  //15

		// Display the new balance
		JOptionPane.showMessageDialog(null, String.format("Now your balance is $%,.2f", account.getBalance())); //18 20

		System.exit(0); //21
	}
}