
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 a = new Test1(5, 2, 3);
		System.out.print(a.age);
	}
	
	public static void a(Test1 t)
	{
		
	}

}

class Test1
{
	int length;
	double weight;
	int age;
	
	public Test1(int length, double weight, int age) 
	{
		this.length = length;            //欄位變數可與參數同名又可避免遮蔽效應
		this.weight = weight;
		this.age = age;
		
	}
}
