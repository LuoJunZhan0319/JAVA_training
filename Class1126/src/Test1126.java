import java.util.Random;

public class Test1126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		System.out.println(generator.nextInt(100)); // [0,100-1] 意即產生0~99的隨機數

		for (int i = 0; i < 100; i++) {
			System.out.println(generator.nextInt(100));
		}
	}

}
