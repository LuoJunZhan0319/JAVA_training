import java.util.Random;

public class MyRandom {

	
	public int  nextInt(int a)
	{
		Random ra = new Random();
		return ra.nextInt(a);
	}
	
	public int nextInt(int begin, int end)
	{
		
		int di = end-begin;
		di++;
		int tmp = nextInt(di);
		
		return tmp+begin;
	}
}
