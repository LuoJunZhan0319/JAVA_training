public class Lab3_10 {
	public static void main(String[] args) {
		int c = 20; // 會考成績
		int b = 0; // 去年平均分數
		int a = 80; // 今年平均分數

		// 如果會考成績大於10，或者今年平均分數進步兩倍以上
		// 都可以獲得獎學金

		if (c > 10 || a / b > 2)
			System.out.println("You can get the money.");
	}
}