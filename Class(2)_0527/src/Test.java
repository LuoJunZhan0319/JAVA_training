
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equation e1 = new Equation();		//Equation��ƤFRunnable�����S��
		Thread thread = new Thread(e1); 	//���ͷs��������

		thread.start();
		
		System.out.println("aaaaa");
	}

}

class Equation implements Runnable	//���Oimplements������A��ƤF�������S��		//����    //A extends B
{
	public void run()				//Runable�����W�w�A�������O�����n��run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i + "+" + i + "=" + (2*i));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}