
public class Work19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 100; i<1000; i++)
		{
			isArmstrong(i);
		}
		

	}
	
	public static void isArmstrong(int a)
	{
		boolean b = true;
		int h = a / 100;
		int t = (a-100*h) / 10;
		int m = (a-100*h-10*t);
		
		double num = Math.pow(h,3)+Math.pow(t,3)+Math.pow(m,3);
		double c = a;
		if(num == c)
		{
			System.out.println(a);
		}
		
	}

}
