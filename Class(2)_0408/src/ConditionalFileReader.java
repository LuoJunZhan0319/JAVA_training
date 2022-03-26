import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ConditionalFileReader
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("�п�J�ɦW:(aaa.txt or bbb.txt)");
      String fname = keyboard.nextLine();

//      FileReader f = new FileReader(fname);
//      System.out.println("�ɮפ��e�����`�M="+f.readEven());
//      System.out.println("�ɮפ��e�_���`�M="+f.readOdd());
      
//      FileReader f2 = new FileReader(fname);
//      System.out.println("�ɮפ��e�����`�M="+f2.readEven());
//      System.out.println("�ɮפ��e�_���`�M="+f2.readOdd());
//      System.out.println("�ɮפ��e�����`�M="+f2.read(false));
//      System.out.println("�ɮפ��e�_���`�M="+f2.read(true));
      
      FileReader f3 = new FileReader(fname);
      System.out.println("�ɮפ��e�����`�M="+f3.readEven());
      System.out.println("�ɮפ��e�_���`�M="+f3.readOdd());
      System.out.println("�ɮפ��e�����`�M="+f3.read(2));
      System.out.println("�ɮפ��e�_���`�M="+(f3.read(1)-f3.read(2)));
      System.out.println("�ɮפ��e3�����`�M="+f3.read(3));

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