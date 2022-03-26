 import java.io.File;
 import java.util.Scanner;
 import java.io.FileNotFoundException;

public class Lab6_9
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File testFile = new File("abc.txt"); 		//指定檔案跟檔名
      Scanner inputFile = new Scanner(testFile);//一定要有拋出例外的程式喔
      String s = inputFile.nextLine(); 			//讀取一整行，先前的掃描器是針對System.in(系統的鍵盤)，而現在是針對文件
      System.out.println(s);					//印出
      //inputFile.close();						//關閉檔案，請空Scanner開檔所耗用記憶體
      	
      String s1 = inputFile.next();	
      System.out.println(s1);					
      
      int s2 = inputFile.nextInt();	
      System.out.println(s2);
   }
}