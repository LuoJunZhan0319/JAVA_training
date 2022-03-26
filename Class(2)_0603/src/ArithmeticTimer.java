import java.util.Random;

public class ArithmeticTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equation e1 = new Equation();		//產生一個執行續，意味者Equation類別自身有執行續的功能
		Thread thread = new Thread(e1);		//new Thread(e1)，利用 Thread類別使得後續可啟用執行續
		thread.start();

	}
	
}

class Equation implements Runnable	//利用implements Runnable讓 Equation()有執行續的功用
{
	
	public void run()				//run()是implements Runnable 要求你必須有的方法段
	{
		Random ra = new Random();
		int begin = ra.nextInt(9);

		for(int i = begin; begin < i+5; begin++)	//而在run()裡面的程式部分就會是執行續要執行的部分，這才是執行續本身
		{
			System.out.print(begin+"+"+begin+" = ");
			try {
				Thread.sleep(1000);
				System.out.println(2*begin);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


