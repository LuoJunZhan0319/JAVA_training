import javax.swing.JOptionPane;

/**
 * This program demonstrates how to use the String.format method to format a
 * number as currency.
 */

public class CurrencyFormat2 {
	public static void main(String[] args) {
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		String output = String.format("Your annual pay is $%,.2f\n", annualPay); // String.format()�A���̪���������printf()���W�h�@��
		// String.format("Your annual pay is $%,.2f\n", annualPay); ���ͤ@�ӷs���r��
		// �����x�s��output���ܼƤ���!!

		JOptionPane.showMessageDialog(null, output);
	}
}