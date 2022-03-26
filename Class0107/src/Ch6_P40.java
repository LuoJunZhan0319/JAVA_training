import java.util.Random;

//這題是我看著老師寫的，要自己再想過喲!!
//有講表示會考，重要!!!!!
public class Ch6_P40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=100; i++)
		{
			if( i%20 == 0  )
				System.out.print(randomChar('A','Z')+"\n");
			else
				System.out.print(randomChar('A','Z'));
		}
	}
	
	public static char randomChar(char c1, char c2)  //假設輸入'A','E'
	{
		//選定兩字元之間之亂數可變動範圍
		int diff = c2 - c1 + 1;
		Random ran = new Random();
		int number = ran.nextInt(diff);  //從{0,1,2,3,,,,,,}中選一個
		
		// 'A' + 0 = 'A'
		// 'A' + 1 = 'B'
		// 'A' + 2 = 'C'
		
		return (char)(c1 + number);   //強制轉型回字元型態、否則會是ASCII的整數碼喔!!!
	}


}
