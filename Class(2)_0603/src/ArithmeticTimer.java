import java.util.Random;

public class ArithmeticTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equation e1 = new Equation();		//���ͤ@�Ӱ�����A�N����Equation���O�ۨ��������򪺥\��
		Thread thread = new Thread(e1);		//new Thread(e1)�A�Q�� Thread���O�ϱo����i�ҥΰ�����
		thread.start();

	}
	
}

class Equation implements Runnable	//�Q��implements Runnable�� Equation()�������򪺥\��
{
	
	public void run()				//run()�Oimplements Runnable �n�D�A����������k�q
	{
		Random ra = new Random();
		int begin = ra.nextInt(9);

		for(int i = begin; begin < i+5; begin++)	//�Ӧbrun()�̭����{�������N�|�O������n���檺�����A�o�~�O�����򥻨�
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


