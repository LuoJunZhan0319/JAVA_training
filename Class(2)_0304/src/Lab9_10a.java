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
      String base = JOptionPane.showInputDialog("�п�J��");
      String power = JOptionPane.showInputDialog("�п�J����");

//      System.out.println(Math.pow(base, power)); //���󤣯ઽ���N�J? >_<  
//		JOptionPane.showInputDialog()�^�Ǹ�ƫ��A��String�G�n���O�ഫ

      double b = Double.parseDouble(base);
      double p = Double.parseDouble(power);

      System.out.println(Math.pow(b, p));



   }
}