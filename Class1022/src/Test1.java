import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a;  //int a;
		a = new Scanner(System.in);  //new Scanner(System.in): 產生Scanner(複雜)資料
		
		String number = a.nextLine();  //取得整數型字串
		
		int num_int = Integer.parseInt(number); //轉換成整數
		
		System.out.println(num_int*3);
		
		System.out.println("請輸入一個三位數: ");
		int d3 = a.nextInt();  //123 --> "123"
		
		String d3_str = d3 + "";
		System.out.println(d3_str.charAt(1));
		
		
	}

}
