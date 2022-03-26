import java.util.ArrayList;
import java.util.Scanner;

public class AnalyzingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Double> NumberList = new ArrayList<Double>();

		System.out.println("請輸入要判別的數字個數:");
		int n = in.nextInt();
		
		for(int i = 0; i<n; i++)
		{
		NumberList.add(in.nextDouble());
		}
		
		double sum = 0.0, mean = 0.0;
		
		for(int i = 0; i<n; i++)
		{
			sum += NumberList.get(i);
		}
		
		mean = sum / n;
		
		for(int i = 0; i<n; i++)
		{
			if(NumberList.get(i) > mean)
				System.out.println(NumberList.get(i));
		}
	}
}
