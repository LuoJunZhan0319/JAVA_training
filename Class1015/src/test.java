
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		byte b = 5;
		short c = 32767;
		
		//這邊我覺得超重要!!!!!好不容易得到的結論
		//幾乎可以得出一個結論，只要任何Literal為整數值，都會被java優先認為是int，再依據左邊變數的type而做轉型
		//literal的值符合左邊變數的值，就可以直接轉型以上式為例 byte b = (byte)5; 所以當常值大於左邊變數的type範圍
		//則會跳出<error>type mismatch 告訴你左邊的常值無法從int轉換那個type
		//而已下面為例 int a1 = 2147483648;兩邊型態其實都是int，但右邊literal超過int的範圍
		//所以它的<error>就會說是the literal 2147483648 is .. out of range，不會是type mismatch
		//下列情況才會被說<error>type mismatch 無法從long轉int  int a4 = 2147483648L
		
		
		
//		short c1 =32768;     //<error>type mismatch: can,t convert from int to short
//		int a1 = 2147483648; //<error> the literal 2147483648 is .. out of range
//		long a2 = 2147483648;//<error> 此整數表達方式太大 
//		long a3 = 2147483648L; 
//		//因為Literal已經超過int的上限，為了使java程式設計師確定自己要守用這麼大的數字，面再加上L確定你要使用這long
//		int a4 = 2147483648L;//<error>type mismatch: can,t convert from long to int
//		
//		
//		//float number = 0.2;<error>type mismatch: can,t convert double int to float
//		// literal 只要有小數點，程式自動認為是double!!
//		float f = 0.2F;
//		
		//這邊也很重要，在做+-*/都要注意資料型態會影響結果，不要在這裡敗筆了!!!!
		System.out.println(5 / 2);  // int
		System.out.println(5 / 2.0);// int/double
		System.out.println(5.0 / 2);// double/int
		System.out.println(100 + 58 % 10 - 5);
//		
//		
//		int upper = 3;
//		int base = 4;
//		
//		System.out.println(Math.pow(base,upper)); //Math.pow()  為double type
//		System.out.println(Math.sqrt(Math.pow(base,upper)));
		
		
		String s = "amanda"; //String is complex
		System.out.println(s.length());
		String s1 = ""; 
		System.out.println(s.length());
		
		String user = "yes";  //java 針對序列性資料的位置，都是從0開始的
		
		System.out.println(user.charAt(0));
		
		System.out.println(user.toUpperCase()); //並沒有把user裡面的資料改成大寫
		
		System.out.println(user); 
		
		
		
		char  c1 = user.charAt(2); //字元型態
		
		// String  c2 = user.charAt(2);//user.charAt() 回傳type char
		
		System.out.println(c1);
	}

}
