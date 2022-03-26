import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		System.out.print("請輸入你的名子:");
		String name = key.nextLine();
		System.out.print("請輸入你的年齡:");
		int age = key.nextInt();
		int after_age = age+5;
		System.out.print(name+"您好，您五年後的年齡為:"+after_age);
		
		
		
		

	}

}
