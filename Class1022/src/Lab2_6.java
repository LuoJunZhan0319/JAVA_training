
public class Lab2_6 {

	public static void main(String[] args) {
		int x;
		double d = -2.5;
		int y = 3;
	//	x = d;  //  int:double 右大左小(由資料型態決定)
		x = (int) d;  //強制資料型態轉換
		
		System.out.println(x);
	}

}
