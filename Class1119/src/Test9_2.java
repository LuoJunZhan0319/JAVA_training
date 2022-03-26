import java.util.Scanner;
public class Test9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("請輸入上午撥打M1電信商用戶的通話時間: ");
		int m1_am_time = in.nextInt();
		System.out.println("請輸入下午撥打M1電信商用戶的通話時間: ");
		int m1_pm_time = in.nextInt();
		System.out.println("請輸入晚上撥打M1電信商用戶的通話時間: ");
		int m1_ni_time = in.nextInt();
		
		System.out.println("請輸入上午撥打M2電信商用戶的通話時間: ");
		int m2_am_time = in.nextInt();
		System.out.println("請輸入下午撥打M2電信商用戶的通話時間: ");
		int m2_pm_time = in.nextInt();
		System.out.println("請輸入晚上撥打M2電信商用戶的通話時間: ");
		int m2_ni_time = in.nextInt();
		
		System.out.println("請輸入上午撥打M3電信商用戶的通話時間: ");
		int m3_am_time = in.nextInt();
		System.out.println("請輸入下午撥打M3電信商用戶的通話時間: ");
		int m3_pm_time = in.nextInt();
		System.out.println("請輸入晚上撥打M3電信商用戶的通話時間: ");
		int m3_ni_time = in.nextInt();
		
		double m1_sum=(m1_am_time + m1_pm_time + m1_ni_time)*0+(m2_am_time + m2_pm_time + m2_ni_time)*5+(m3_am_time + m3_pm_time + m3_ni_time)*5;
		System.out.println("M1的預估費用: "+m1_sum);
		
		double m2_sum=(m1_am_time + m1_pm_time + m1_ni_time)*10+(m2_am_time + m2_pm_time + m2_ni_time*0)+(m3_am_time + m3_pm_time + m3_ni_time)*10;
		System.out.println("M2的預估費用: "+m2_sum);
		
		int m3_am_sum = m1_am_time + m2_am_time + m3_am_time ;
		int m3_pm_sum = m1_pm_time + m2_pm_time + m3_pm_time ;
		
		double m3_sum=0;
		
		if (m3_am_sum>m3_pm_sum)
		{
			m3_sum=(m3_am_sum*0.8 + m3_pm_sum)*6;
			System.out.println("M3的預估費用: "+m3_sum);
		}
		else
		{
			m3_sum=(m3_am_sum + m3_pm_sum*0.8)*6;
			System.out.println("M3的預估費用: "+m3_sum);
		}
		if (m1_sum > m2_sum)
		{
			if (m2_sum > m3_sum)
			{
				System.out.println("M3最便宜");
			}
			else
			{
				System.out.println("M2最便宜");
			}
		}
		else
		{
			if (m1_sum > m3_sum)
			{
				System.out.println("M3最便宜");
			}
			else
			{
				System.out.println("M1最便宜");
			}
		}
		
			
	}

}
