
public class Lab2_5 {
	static int b =60 ; //global variable
	public static void main(String[] args) {
//		int a = 30;
//		int b;
		//int a = 20;
		// a = b;
		
		// System.out.println(b);
		
//		��20��J�ܼ�a
//		��30��J�ܼ�b
//		���ܼ�b�����e��J�ܼ�a
//		�L�X�ܼ�a�����e
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
