import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("�п�J�z���b��l�B: ");
		int account = in.nextInt();
		
		if(account!=1000000)
			System.out.print("�z�S���@�ʸU!");
		else
			System.out.print("�ܦn�A�A���@�ʸU");
		
		int score = 80;
		boolean pass = (score >=60);
		System.out.println(pass);
		
//		if (pass == "pass")  //������F��ڥ����@��= = ,boolean:String 
//			System.out.println("ya!!you pass");
		
		
	}

}
