public class Lab9_1
{
   static int a;

   public static void main(String[] args)
   {
       System.out.println(Math.PI);

       Dog.number = 20;            //可以<類別.類別變數> 型式使用類別變數        // 其他類別的類別變數要加上類別名稱
       System.out.println("number in Dog:" + Dog.number);
       Dog.number++;
       System.out.println("number in Dog:" + Dog.number);

   }
}

class Dog
{
   static int number;
}