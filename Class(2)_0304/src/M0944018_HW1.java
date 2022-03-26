import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M0944018_HW1 {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		prtMenu();

	}
	
	public static void prtMenu() throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("1. 列印原始報表");
		System.out.println("2. 印出餘額");
		System.out.println("3. 結束");
		
		System.out.print("請輸入 : ");
		int result = in.nextInt();
		
		if(result == 3)
		{}
		else if(result == 1)
			prtRaw();
		else if(result == 2)
			prtBalance();
		else
			prtMenu();
	}
	
	public static void prtRaw() throws FileNotFoundException
	{
		File f = new File("Transaction.txt"); 		
	    Scanner inp_f = new Scanner(f);
	    
	    while(inp_f.hasNext())
	    {
	    	System.out.println(inp_f.nextLine());
	    }
	    inp_f.close();
	    
	    prtMenu();
	}
	
	public static void prtBalance() throws FileNotFoundException
	{
		File f = new File("Transaction.txt"); 		
	    Scanner inp_f = new Scanner(f);
	    
	    String name;
	    int sum = 0, a;
	    while(inp_f.hasNext())
	    {
	    	name = inp_f.next();
	    	
	    	a = inp_f.nextInt();
	    	
	    	if(name.equals("AC") || name.equals("D") || name.equals("TI"))
	    		sum += a;
	    	else
	    		sum -= a;
	    }
	    
	    System.out.println("餘額為: "+sum);
	    inp_f.close();
	    
	    prtMenu();
	}
	

}
