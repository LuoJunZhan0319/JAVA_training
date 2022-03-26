import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date tobyBirth = new Date(97, 2, 19);
		System.out.println(tobyBirth);
		
		Date current = new Date();
		System.out.println(current);
		System.out.println(current.getYear()
				);
		
		long cTime = current.getTime();   // 取得1970年到現在的毫秒表示法
		System.out.println(cTime);
		
		long tobyTime = tobyBirth.getTime();
		System.out.println(tobyTime);
		
		System.out.println( (cTime-tobyTime) / ((long)365*3600*24000) );
	}

}
