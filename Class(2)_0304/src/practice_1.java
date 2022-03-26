import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class practice_1 {

	public static void main(String[] args) throws FileNotFoundException
	
	{
		// TODO Auto-generated method stub
		File testFile = new File("xyz.txt"); 		
	    Scanner inputFile = new Scanner(testFile);
	    
	    int[] array = new int[4];
	    
	    int i = 0;
	    while(inputFile.hasNext())
	    {
	    	array[i++] = inputFile.nextInt();
	    }
	      
	    System.out.println(array[0]+array[1]*array[2]/array[3]);
	    
	    inputFile.close();
	}

}
