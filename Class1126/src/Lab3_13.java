import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_13 {
	public static void main(String[] args) {
		int temp = 9;
		switch (temp) {
		case 1:
			System.out.println("branch 1");
			break;
		case 2:
			System.out.println("branch 2");
			break;
		default:
			System.out.println("default");
		}

		char c = 'a';
		//String c = "a";
		switch (c) // switch運算式的允許型態：int, short, byte, char //String也可以!!
		{
		case 'a':
			System.out.println("branch a");
			break;
		case 'b':
			System.out.println("branch b");
			break;
		default:
			System.out.println("default");
		}

	}
}