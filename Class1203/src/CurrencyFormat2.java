import javax.swing.JOptionPane;

/**
 * This program demonstrates how to use the String.format method to format a
 * number as currency.
 */

public class CurrencyFormat2 {
	public static void main(String[] args) {
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		String output = String.format("Your annual pay is $%,.2f\n", annualPay); // String.format()括弧裡的部分都跟printf()的規則一樣
		// String.format("Your annual pay is $%,.2f\n", annualPay); 產生一個新的字串
		// 接著儲存到output的變數之中!!

		JOptionPane.showMessageDialog(null, output);
	}
}