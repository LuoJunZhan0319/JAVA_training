package other;

public class Test {

	public static void main(String[] args)
	{
		P2 x = new P2();
		x.printClassName();     //overriding (��k�л\) from P2
		x.printClassName(10);   // from p1
	}

}

class P1
{
	public void printClassName()
	{
		System.out.println("P1 is the parent");
	}
	
	public void printClassName(int a)
	{
		System.out.println("P1 is the parent"+a); //overload (��k�h��)
	}
}

class P2 extends P1
{
	public void printClassName()
	{
		System.out.println("P2 is the child");
	}
}


