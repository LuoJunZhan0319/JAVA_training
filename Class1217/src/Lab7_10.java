public class Lab7_10 {
	public static void main(String[] rgs) // 變數名稱可由程式設計師自訂
											// 這裡不一定要寫args
	{

		// 上半程式中，for迴圈是拿個別陣列的參考變數(subject1, subject2)來取用陣列元素

		int[] subject1 = { 60, 70, 30, 80, 90 };
		int[] subject2 = { 90, 70, 55, 70 };

		int sum = 0;
		int[] subject = new int[5];
		subject = subject1;

		// 利用呼叫方法來撰寫
		sum = sum(subject1);
		System.out.println("第一科平均=" + sum / subject1.length);

		sum = sum(subject2); // 將subject2陣列傳給sum方法做運算，再將運算結果裝入sum變數
		System.out.println("第二科平均=" + sum / subject2.length);

		// 下半程式中，兩個for迴圈拿同一個陣列參考變數(arrayToProcess)來取用陣列元素
		// 第一個迴圈為了能夠正確取用第一個科目的陣列元素，必須進行陣列參考元素的指派
		// arrayToProcess = subject1
		// 同樣地，第二個迴圈為了能夠正確取用第二個科目的陣列元素
		// 也必須進行陣列參考元素的指派
		// arrayToProcess = subject2

		/*
		 * int[] arrayToProcess; // 代表要處理的陣列 int sum = 0; arrayToProcess = subject1;
		 * for(int i = 0; i < arrayToProcess.length; i++) { sum += arrayToProcess[i]; }
		 * System.out.println("第一科平均="+sum / arrayToProcess.length);
		 * 
		 * sum = 0; arrayToProcess = subject2; for(int i = 0; i < arrayToProcess.length;
		 * i++) { sum += arrayToProcess[i]; } System.out.println("第二科平均="+sum /
		 * arrayToProcess.length);
		 */

	}

	public static int sum(int[] subject) {
		int summation = 0;

		for (int i = 0; i < subject.length; i++) // 針對subject進行平均運算
		{
			summation += subject[i];
		}

		return summation;
	}

}