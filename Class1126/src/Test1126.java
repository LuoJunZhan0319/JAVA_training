import java.util.Random;

public class Test1126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		System.out.println(generator.nextInt(100)); // [0,100-1] �N�Y����0~99���H����

		for (int i = 0; i < 100; i++) {
			System.out.println(generator.nextInt(100));
		}
	}

}
