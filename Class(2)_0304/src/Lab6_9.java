 import java.io.File;
 import java.util.Scanner;
 import java.io.FileNotFoundException;

public class Lab6_9
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File testFile = new File("abc.txt"); 		//���w�ɮ׸��ɦW
      Scanner inputFile = new Scanner(testFile);//�@�w�n���ߥX�ҥ~���{����
      String s = inputFile.nextLine(); 			//Ū���@���A���e�����y���O�w��System.in(�t�Ϊ���L)�A�Ӳ{�b�O�w����
      System.out.println(s);					//�L�X
      //inputFile.close();						//�����ɮסA�Ъ�Scanner�}�ɩүӥΰO����
      	
      String s1 = inputFile.next();	
      System.out.println(s1);					
      
      int s2 = inputFile.nextInt();	
      System.out.println(s2);
   }
}