
public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A amanda = new A(20);
		System.out.println(amanda.a);
		set1(amanda);
		System.out.println(amanda.a);
		set10(amanda);
		System.out.println(amanda.a);

	}

	public static void set1(A a)
	{
		a.setA(1);
	}
	
	public static void set10(A a)
	{
		a.setA(10);
	}
}


