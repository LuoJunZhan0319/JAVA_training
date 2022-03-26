package prac;

import java.util.Random;

public class Die {
	
	private int numSide ;
	private int num ;
	
	public Die(int a)
	{
		numSide = a;
	}
	
	
	
	public void roll()		//擲骰子
		{
		   Random rand = new Random();		
		   num = rand.nextInt(numSide)+1;	//隨機從[1, side]挑選一個數   
		}

	public int getValue()
	   {
		   return num;			//回傳向上點數
	   }
	
	public int getSides()
	   {
		   return numSide;			//回傳幾面
	   }
	
	public boolean guess(int value, int order)
	{
		for(int i = 1 ; i <= order ; i++)
		{
			roll();
			if(value == getValue())
			{
				System.out.println("第"+i+"次: " +getValue()+"等於"+value);
			}
			else
			{
				System.out.println("第"+i+"次: " +getValue()+"不等於"+value);
			}
		}
		if (value == getValue())
			return true;
		else
			return false;
	}
	
}
