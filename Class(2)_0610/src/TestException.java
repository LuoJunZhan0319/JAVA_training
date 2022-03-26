
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde";
		int a = 0;								//所以下面要print(a)就要初始化

		
		try
		{
			a = 10 / 0;							//電腦不認為try裡面的的初始化不一定會執行到。
			a = Integer.parseInt(s);
			System.out.println(a);
		}
		catch(NumberFormatException nfe)		//先具體後抽象才不會錯
		{
			System.out.println("NumberFormatException");
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException");
		}

		
		System.out.println(a); //變數初始化依據區塊而定
	}

}
