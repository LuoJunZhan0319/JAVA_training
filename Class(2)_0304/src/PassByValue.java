/**
   This program demonstrates that only a copy of an argument
   is passed into a method.
*/

public class PassByValue
{
   public static void main(String[] args)
   {
      int number = 99; // number starts with 99
      
      // Display the value in number.
      System.out.println("number is " + number);
      
      // Call changeMe, passing the value in number
      // as an argument.
      changeMe(number);
      
      // Display the value in number again.
      System.out.println("number is " + number);
   }
   
   /**
      The changeMe method accepts an argument and then
      changes the value of the parameter.
   */
   
   public static void changeMe(int myValue)
   {
      System.out.println("I am changing the value.");
      
      // Change the myValue parameter variable to 0.
      myValue = 0;                                        //�Ѽƪ��@�νd��u���b�o�Ӥ�k�̡A���D�^�ǥh���ܥD�{�����ܼơA�n���M���v�T
      // Display the value in myValue.                    //�ǤJ���ܼƳ�!!!  �o�]�s�H�}�ǭ�!!!
      System.out.println("Now the value is " + myValue);
   }
}
