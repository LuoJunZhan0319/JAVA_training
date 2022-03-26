public class Lab2_6b {

	public static void main(String[] args) {
		double d1 = 3.4;
		int d2 = (int) d1;

		System.out.println("d1:" + d1);	// d1 內容是否被cast運算所改變?
		System.out.println("d2:" + d2);
		
		System.out.println(5/2); //整數除法，所以只會有2
		System.out.println( (double)5/2 ); //強制資料型態轉換(Cast)的優先順序很高,它會優先讓5變5.0再除以2
		System.out.println( 5/(double)2 ); //強制資料型態轉換(Cast)的優先順序很高,它會優先讓2變2.0再分之5
		
		
	}

}