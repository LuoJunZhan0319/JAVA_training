import java.util.Random;

public class ThreadTest {

	public static void main(String[] args) {	//主程式本身也是執行續
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		MyRandom r = new MyRandom('+', 300);	//第一個執行續產生
		Thread task1 = new Thread(r);
		task1.start();
		
		r = new MyRandom('-', 3000);			//第二個執行續產生
		Thread task2 = new Thread(r);
		task2.start();
		
		System.out.println("end");
	}

}

class MyRandom implements Runnable		//MyRandom是一個有實作Runnable介面的類別，具備run()方法，可供執行續的排程。
{
	char c;
	int speed;
	Random r;
	
	public MyRandom(char c, int speed)
	{
		this.c = c;
		this.speed = speed;
		
		r = new Random();
	}
	
	public void run()
	{
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(c);
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
