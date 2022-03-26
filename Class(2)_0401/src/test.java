import java.util.Date;

public class test {
	
	public static void main(String[] args){
		
		Date a = new Date();
		System.out.println(a.getYear());	// 年(+1900)
		System.out.println(a.getMonth());	// 月(+1)
		System.out.println(a.getDate());	// 日
		System.out.println(a.getHours());	// 時
		System.out.println(a.getMinutes());	// 分
		System.out.println(a.getSeconds());	// 秒

		
	}

}
