import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_14 {
	public static void main(String[] args) {
		int temp = 3;
		final int three = 3;
		switch (temp) {
		case 0:
			System.out.println("branch 0");
			break;
		case 1 + 0:
			System.out.println("branch 1");
			break;
		case 2 * 1:
			System.out.println("branch 2");
			break;
		case three: // 變數不能放在case裡面,除非是常數
			System.out.println("branch 3");
			break;
		default:
			System.out.println("default");
		}
	}
}