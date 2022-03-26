
public class FinallyLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test());						//1 5
	}
	
	public static int test()
	{
		String s = "asd";	// change this string
		
		try
		{
			int a = Integer.parseInt(s);						//2
			return 1;									//4  return是整個方法的結束點
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("error caught.");
			return 2;
		}
		finally
		{
			System.out.println("will be printed");		//3
		}
		
	}

}
