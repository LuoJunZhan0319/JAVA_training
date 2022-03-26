
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sumFrom1To10();
		System.out.println(sumFromXToY(1, 10));
		System.out.println(sumFromXToY(11, 20));
		System.out.println(sumFromXToY(21, 30));
		
	}
	
	public static void sumFrom1To10()  //建構新方法
	{
		int sum = 0;
		for(int i = 1; i<=10; i++)
		{
			sum +=i;
		}
		System.out.println(sum);
	}
	
	public static int sumFromXToY(int X, int Y)  //參數X,Y的有效範圍只有這個方法的範圍內而已
	{
		int sum = 0;
		for(int i = X; i<=Y; i++)
		{
			sum +=i;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
