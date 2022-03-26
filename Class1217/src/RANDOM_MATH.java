import java.util.Arrays;
import java.util.Random;

public class RANDOM_MATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		int[] array3 = { 1, 2, 3, 4, 5, 6 };
		int[] array4 = new int[3];
		
		
		
		int a=0, b=0, c=0;
		
		Random ran = new Random();
		
		for(int i=6; i>0; i--)
		{
			a = ran.nextInt(i);
			array4[0]=array1[a];
				
			
			b = ran.nextInt(i);
			while(array1[a] == array2[b])
				b = ran.nextInt(i);
			array4[1]=array2[b];
				
			
			c = ran.nextInt(i);
			while(array1[a] == array3[c] || array2[b] == array3[c])
				c = ran.nextInt(i);
			array4[2]=array3[c];
				
			array1 = delete(array1,a);
			array2 = delete(array2,b);
			array3 = delete(array3,c);
				
			
			System.out.println("第"+array4[0]+"組的批改組別為: 第"+array4[1]+"組   以及  第"+array4[2]+"組。");
		}
			
	}
		
	
	
	public static int[] delete(int []n,int index)
	{
		int j=0;
		if(index<0||index>=n.length) 
		{
			System.out.println("沒有對應的元素可刪除");
			return n;
		}
		
		int []b=new int[n.length-1];
		
		for(int i=0;i<n.length;i++) 
		{
			if(i==index)
				continue;
			b[j++]=n[i];
		}
		return b;
	}

}
