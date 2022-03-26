import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class OOBankMain {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		
		File f = new File("Transactions.txt");
		Scanner inputFile = new Scanner(f);
		
		String action = inputFile.next();
		int    amount = inputFile.nextInt();
		Transaction t1 = new Transaction(action, amount);    //因為有建構式在new Transaction的時候，需要提供()裡的數值
		//t1.setData(action, amount);
		
		action = inputFile.next();
		amount = inputFile.nextInt();
		Transaction t2 = new Transaction(action, amount);
		//t2.setData(action, amount);
		
		action = inputFile.next();
		amount = inputFile.nextInt();
		Transaction t3 = new Transaction(action, amount);
		//t3.setData(action, amount);
		
		action = inputFile.next();
		amount = inputFile.nextInt();
		Transaction t4 = new Transaction(action, amount);
		//t4.setData(action, amount);
		
		action = inputFile.next();
		amount = inputFile.nextInt();
		Transaction t5 = new Transaction(action, amount);
		//t5.setData(action, amount);
		
		action = inputFile.next();
		amount = inputFile.nextInt();
		Transaction t6 = new Transaction(action, amount);
		//t6.setData(action, amount);
		
		int balance = t1.getSignedAmount() + 
				      t2.getSignedAmount() +
				      t3.getSignedAmount() +
				      t4.getSignedAmount() +
				      t5.getSignedAmount() +
				      t6.getSignedAmount();
		
		System.out.println("帳戶餘額是"+balance);
	}

}

