import java.util.Scanner;

public class Test1 {
//Nested if(巢狀，if)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("請輸你的血型: ");
		String blood = in.nextLine();
		
		if (blood.length() == 1)
		{
			char c = blood.charAt(0);
			
			if(c == 'A')
				System.out.println("即使嘴上說「沒關係」，但其實根本就很有關係");
			else 
			{
				if(c == 'B')
					System.out.println("沒興趣的事就絕對不會動手去做");
				else
					System.out.println("看起來不拘小節，但其實很會吃醋");
			}
			//下列做法也可以~只是他不是巢狀的
//			if(c == 'A')
//				System.out.println("即使嘴上說「沒關係」，但其實根本就很有關係");
//			if(c == 'B')
//				System.out.println("沒興趣的事就絕對不會動手去做");
//			if(c == 'O')
//				System.out.println("看起來不拘小節，但其實很會吃醋");
		}
		else
		{
			System.out.println("看起來好像有在聽人說話，但其實沒有");
		}
		
		
		

	}

}
