//********************************************************************
//  Author: GY Liao
//
//  Demonstrates the concepts of classes and objects.
//********************************************************************
import javax.swing.JOptionPane;

public class Lab9_10a
{
   public static void main (String[] args)
   {
      String base = JOptionPane.showInputDialog("請輸入底");
      String power = JOptionPane.showInputDialog("請輸入指數");

//      System.out.println(Math.pow(base, power)); //為何不能直接代入? >_<  
//		JOptionPane.showInputDialog()回傳資料型態為String故要型別轉換

      double b = Double.parseDouble(base);
      double p = Double.parseDouble(power);

      System.out.println(Math.pow(b, p));



   }
}