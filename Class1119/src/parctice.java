import java.util.Scanner;
public class parctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		

		char c = 'K';
		
		for (;c != 'N';) //直接利用for迴圈中，判斷式的區間來做判斷
		{
			System.out.println("請輸入兩整數: ");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
				
			int sum = num1+num2;
			System.out.println(num1+"+"+num2+"="+sum);
				
			in.nextLine();
				
			System.out.println("是否還要繼續，輸入N則結束，其餘繼續 ");
			String ans = in.nextLine();
			c = ans.charAt(0);
		}
		
	}

}
