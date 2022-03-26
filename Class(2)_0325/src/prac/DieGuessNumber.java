package prac;

import java.util.Scanner;

public class DieGuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die d = new Die(6);
		
		System.out.println("這個骰子有"+d.getSides()+"面");
		System.out.print("請輸入要猜測的骰子點數:");
		Scanner in = new Scanner(System.in);
		int userGuess = in.nextInt();
		System.out.print("猜猜看，骰第幾次會出現該點數:");
		int order = in.nextInt();
		if(d.guess(userGuess, order))
		{
			System.out.println("猜對了");
		}
		else
		{
			System.out.println("猜錯了");
		}
	}
}
