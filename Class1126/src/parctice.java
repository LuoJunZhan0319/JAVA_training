import java.util.Random;
import java.util.Scanner;

public class parctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你要玩大樂頭還是小樂透\n要玩大樂透請按下B或b; 小樂透請按下S或s;其他按鍵中止遊戲");
		Scanner in = new Scanner(System.in);
		String ans = in.nextLine();

		Random rand = new Random();

		switch (ans) {
		case "b":
		case "B":
			System.out.println("進行大樂透遊戲\n請輸入一個介於[1,10]的整數");
			int a = rand.nextInt(10) + 1;
			int b = in.nextInt();
			if (a == b)
				System.out.println("正確!恭喜獲獎");
			else
				System.out.println("抱歉，正確答案為" + a);
			break;
		case "s":
		case "S":
			System.out.println("進行小樂透遊戲\n請輸入一個介於[1,2]的整數");
			int c = rand.nextInt(2) + 1;
			int d = in.nextInt();
			if (c == d)
				System.out.println("正確!恭喜獲獎");
			else
				System.out.println("抱歉，正確答案為" + c);
			break;

		default:
			System.out.println("您選擇中止遊戲");
		}

	}

}
