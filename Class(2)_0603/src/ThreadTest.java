import java.util.Random;

public class ThreadTest {

	public static void main(String[] args) {	//�D�{�������]�O������
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		MyRandom r = new MyRandom('+', 300);	//�Ĥ@�Ӱ����򲣥�
		Thread task1 = new Thread(r);
		task1.start();
		
		r = new MyRandom('-', 3000);			//�ĤG�Ӱ����򲣥�
		Thread task2 = new Thread(r);
		task2.start();
		
		System.out.println("end");
	}

}

class MyRandom implements Runnable		//MyRandom�O�@�Ӧ���@Runnable���������O�A���run()��k�A�i�Ѱ����򪺱Ƶ{�C
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
