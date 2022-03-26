package prac;

import java.util.Random;

public class Die {
	
	private int numSide ;
	private int num ;
	
	public Die(int a)
	{
		numSide = a;
	}
	
	
	
	public void roll()		//�Y��l
		{
		   Random rand = new Random();		
		   num = rand.nextInt(numSide)+1;	//�H���q[1, side]�D��@�Ӽ�   
		}

	public int getValue()
	   {
		   return num;			//�^�ǦV�W�I��
	   }
	
	public int getSides()
	   {
		   return numSide;			//�^�ǴX��
	   }
	
	public boolean guess(int value, int order)
	{
		for(int i = 1 ; i <= order ; i++)
		{
			roll();
			if(value == getValue())
			{
				System.out.println("��"+i+"��: " +getValue()+"����"+value);
			}
			else
			{
				System.out.println("��"+i+"��: " +getValue()+"������"+value);
			}
		}
		if (value == getValue())
			return true;
		else
			return false;
	}
	
}
