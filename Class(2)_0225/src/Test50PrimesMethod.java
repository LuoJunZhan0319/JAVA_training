
public class Test50PrimesMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstPrime(50);
		
	}
	
	public static void firstPrime(int x)
	{
		int num = 2; //起始數
		
		
		//計數器,印出前x個質數
		for(int count=0; count<x; num++)
		{
			if(isPrime(num))
			{
				count++;
				System.out.println(num);
			}
				
		}
	}
	
	public static boolean isPrime(int num)
	{
		//若是質數回傳true，否為false
		boolean check = true;
		
		//判斷起始數是否為質數
		for(int init=2 ; init<num; init++)
		{
			//留下不是質數的證據
			if(num % init == 0)
				check = false;
		}
		
		return check;
		
	}

}
