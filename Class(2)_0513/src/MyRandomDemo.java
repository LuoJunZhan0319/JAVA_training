
public class MyRandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRandom mra = new MyRandom();
		
		for(int i = 0; i < 100; i++)
		{
			System.out.print(mra.nextInt(10,30)+"¡A");
		}
		System.out.println();
		System.out.println();
		for(int i = 0; i < 100; i++)
		{
			System.out.print(mra.nextInt(20,30)+"¡A");
		}
	}

}
