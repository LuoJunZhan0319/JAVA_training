import java.util.*;
public class Lab2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double score = 0;
		int cp = 0;
		// double w2 = 1.88; //宣告變數代表一個資料值
		final double w2 = 1.88; //宣告w2常數，代表一個不可被改變的值
		System.out.println("please input 主科1:");
		int a = keyboard.nextInt();
		score += a * 3.2;          // 乘上主科權重
		
		System.out.println("please input 主科2:");
		double b = keyboard.nextDouble();
		score += b * 3.2;         // 乘上主科權重

		System.out.println("please input 主科3:");
		double c = keyboard.nextDouble();
		score += c * 3.2;         // 乘上主科權重

		System.out.println("please input 副科1:");
		int d = keyboard.nextInt();
		score += d * w2;           // 乘上副科權重

		System.out.println("please input 副科2:");
		int a2 = keyboard.nextInt();
		score += a2 * w2;        // 乘上副科權重

		System.out.println("加權總分 = "+score);
	}

}