package prac;

import java.util.Scanner;

public class DieGuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die d = new Die(6);
		
		System.out.println("�o�ӻ�l��"+d.getSides()+"��");
		System.out.print("�п�J�n�q������l�I��:");
		Scanner in = new Scanner(System.in);
		int userGuess = in.nextInt();
		System.out.print("�q�q�ݡA��ĴX���|�X�{���I��:");
		int order = in.nextInt();
		if(d.guess(userGuess, order))
		{
			System.out.println("�q��F");
		}
		else
		{
			System.out.println("�q���F");
		}
	}
}
