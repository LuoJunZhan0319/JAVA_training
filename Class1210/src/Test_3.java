
public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 直覺來做的話
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if (i == 1 || i == 8)
					System.out.print("#");
				else if (j == 1 || j == 8)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
