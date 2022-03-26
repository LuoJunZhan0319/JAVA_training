
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equation e1 = new Equation();		//Equation具備了Runnable介面特性
		Thread thread = new Thread(e1); 	//產生新的執行續

		thread.start();
		
		System.out.println("aaaaa");
	}

}

class Equation implements Runnable	//類別implements介面後，具備了介面的特性		//等式    //A extends B
{
	public void run()				//Runable介面規定，相關類別必須要有run()
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