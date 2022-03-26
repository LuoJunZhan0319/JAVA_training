import java.util.ArrayList;
import java.util.Scanner;
public class Wrok18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("請輸入十個正整數: ");
		
		Scanner in = new Scanner(System.in);
		
		//建立ArrayList 並要求輸入整數型態
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		//取得使用者輸入add進串列
		for(int i = 0; i<10; i++)
		{
			List.add(in.nextInt());
		}
		
		//先印出第一個元素
		System.out.print(List.get(0)+" ");
		
		//接著依序向前比對是否重複印出
		for(int i = 1; i<List.size(); i++)
		{
			//建立辨別證據 初始為true (一定要設在一開始，將證據重設)
			boolean identify = true;
			
			//向前比對
			for(int j = 0; j<i; j++)
			{	
				if(List.get(i) == List.get(j))
				{	
					//找到重複證據，就停止迴圈
					identify = false;
					break;
				}
			}
			
			//辨別證據是否為ture，無重複就印出當前元素
			if(identify)
				System.out.print(List.get(i)+" ");
			
		}
		
		
	}

}
