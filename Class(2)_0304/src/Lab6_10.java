import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab6_10
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File testFile = new File("abc.txt");  //�u�n���ͦ�file����@�w���n���ߥX�ҥ~�A�H�����ϥΪ̧䤣���ɮ�
      Scanner inputFile = new Scanner(testFile);
      String s = inputFile.nextLine();
      System.out.println(s);
      System.out.println("After read line 1: hasNext()="+inputFile.hasNext()); //�i�H�P�_�U�@��O�_�٦���ƥi�HŪ���C

      s = inputFile.nextLine();
      System.out.println(s);
      System.out.println("After read line 2: hasNext()="+inputFile.hasNext());
      inputFile.close();
   }
}