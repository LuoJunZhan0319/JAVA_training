import java.util.Random;
import java.util.Scanner;

public class M0944018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 建構三位數亂數
		Random ra = new Random();
		int r = ra.nextInt(900) + 100;

		// int轉型String
		String s = r + "";

		// 取出亂數中每位數的數值
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);

		// 跟使用者取得資料
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入一個阿拉伯數字(0~9):");
		int ans = in.nextInt();

		System.out.println("電腦數字R=" + r);

		// 使用if判斷使用者資料與亂數是否相同!
		if (a == b && b == c) {
			if (a == ans) {
				System.out.print("得分=1000");
			}
			System.out.print("得分=-1000");
		} else if (a == b || a == c || b == c) {
			if (ans == a || ans == b || ans == c) {
				System.out.print("得分=100");
			}
			System.out.print("得分=-100");
		} else {
			System.out.print("0");
		}

	}

}
