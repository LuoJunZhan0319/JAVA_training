
public class Lab2_5 {
	static int b =60 ; //global variable
	public static void main(String[] args) {
//		int a = 30;
//		int b;
		//int a = 20;
		// a = b;
		
		// System.out.println(b);
		
//		р20跑计a
//		р30跑计b
//		р跑计bず甧跑计a
//		跑计aず甧
		int a = 20;  //local variable
		int b = 30;  //local variable
		a = b;
		System.out.println(a);
		main();
		
	}
	public static void main() {
		int a = 60;   //local variable
		System.out.println(a + 2);
		System.out.println(b + 1);
	}
	

}
