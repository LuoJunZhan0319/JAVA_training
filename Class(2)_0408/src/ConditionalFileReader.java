import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ConditionalFileReader
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("叫块郎:(aaa.txt or bbb.txt)");
      String fname = keyboard.nextLine();

//      FileReader f = new FileReader(fname);
//      System.out.println("郎ず甧案计羆㎝="+f.readEven());
//      System.out.println("郎ず甧计羆㎝="+f.readOdd());
      
//      FileReader f2 = new FileReader(fname);
//      System.out.println("郎ず甧案计羆㎝="+f2.readEven());
//      System.out.println("郎ず甧计羆㎝="+f2.readOdd());
//      System.out.println("郎ず甧案计羆㎝="+f2.read(false));
//      System.out.println("郎ず甧计羆㎝="+f2.read(true));
      
      FileReader f3 = new FileReader(fname);
      System.out.println("郎ず甧案计羆㎝="+f3.readEven());
      System.out.println("郎ず甧计羆㎝="+f3.readOdd());
      System.out.println("郎ず甧案计羆㎝="+f3.read(2));
      System.out.println("郎ず甧计羆㎝="+(f3.read(1)-f3.read(2)));
      System.out.println("郎ず甧3计羆㎝="+f3.read(3));

   }
}

class FileReader
{
   File file;

   public FileReader(String fname)
   {
      file = new File(fname);
   }

   public int readOdd() throws FileNotFoundException
   {
      int sum = 0, d = 0;
      Scanner inputFile = new Scanner(file);

      while(inputFile.hasNext())
      {
         d = inputFile.nextInt();
         if(d % 2 == 1)
            sum += d;
      }

      inputFile.close();
      return sum;
   }

   public int readEven() throws FileNotFoundException
   {
      int sum = 0, d = 0;
      Scanner inputFile = new Scanner(file);

      while(inputFile.hasNext())
      {
         d = inputFile.nextInt();
         if(d % 2 == 0)
            sum += d;
      }

      inputFile.close();
      return sum;
   }
   
   public int read(boolean odd) throws FileNotFoundException
   {
	   if(odd)
	   {
		   return readOdd();
	   }
	   return readEven();
   }
   
   public int read(int multiple) throws FileNotFoundException
   {
	   int sum = 0, d = 0;
	   Scanner inputFile = new Scanner(file);

	   while(inputFile.hasNext())
	      {
	         d = inputFile.nextInt();
	         if(d % multiple == 0)
	            sum += d;
	      }

	   inputFile.close();
	   return sum;
	   
   }
}