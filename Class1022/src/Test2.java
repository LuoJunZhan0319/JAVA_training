import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入您的帳戶餘額: ");
		int account = in.nextInt();
		
		if(account!=1000000)
			System.out.print("您沒有一百萬!");
		else
			System.out.print("很好，你有一百萬");
		
		int score = 80;
		boolean pass = (score >=60);
		System.out.println(pass);
		
//		if (pass == "pass")  //比較的東西根本不一樣= = ,boolean:String 
//			System.out.println("ya!!you pass");
		
		
	}

}
