import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab6_10
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File testFile = new File("abc.txt");  //只要有生成file物件一定都要有拋出例外，以提醒使用者找不到檔案
      Scanner inputFile = new Scanner(testFile);
      String s = inputFile.nextLine();
      System.out.println(s);
      System.out.println("After read line 1: hasNext()="+inputFile.hasNext()); //可以判斷下一行是否還有資料可以讀取。

      s = inputFile.nextLine();
      System.out.println(s);
      System.out.println("After read line 2: hasNext()="+inputFile.hasNext());
      inputFile.close();
   }
}