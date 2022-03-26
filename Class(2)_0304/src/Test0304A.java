
public class Test0304A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(20,30));
		System.out.println(add("50","30"));
		
	}
	
	//方法的多載!!!!
	public static int add(int a, int b) {return a+b;}
	
	public static int add(String a, String b) 
	{
		//return Integer.parseInt(a) + Integer.parseInt(b);
		return add(Integer.parseInt(a),Integer.parseInt(b));
	}
	
	public static double add(int a, double b) {return a+b;}
}
