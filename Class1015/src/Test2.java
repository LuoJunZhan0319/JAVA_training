import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard;  // int b;
		//指定系統輸入裝置為掃描對象
		keyboard = new Scanner(System.in);
		
		
//		System.out.print("請輸入你的成績: ");
//		int score = keyboard.nextInt();  //取得鍵盤輸入到的數字
//		
//		System.out.println("你加分後的成績是: "+(score+3));
		
		System.out.print("你的名子是: ");
//		String score = keyboard.nextLine(); //取得鍵盤輸入到的全部字串
		String score1 = keyboard.next(); //取得空白前的第一個字串
		String score2 = keyboard.next();
		System.out.println("你好, "+score1);
		System.out.println("你好, "+score2);
		
	}

}
