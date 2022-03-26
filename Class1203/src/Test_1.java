
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;

//		if (score>=60)
//		{
//			System.out.println("及格");
//		}
//		else
//		{
//			System.out.println("不及格");
//		}

		// 利用條件運算子，可以簡化上面註解掉的步驟!!

		System.out.print(score >= 80 ? "及格" : "不及格");

		// 也可以這樣寫!
		String s = score >= 80 ? "及格" : "不及格"; // 三元運算子
		System.out.print(s);

	}

}
