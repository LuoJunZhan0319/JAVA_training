class Lab9_7_2
{
   int len;
   double weight;
   boolean male;
   String name;

   public static void main(String[] args)
   {
	   
   }
   
   public static void printout(int i)  //靜態繫結(static binding) -->表示有兩個方法的名稱參數一樣，使程式無法確定要使用何者
   {
      i += 2;
   }
   public static void printout(int i)
   {
      i += 3;
      System.out.println("hello");
   }

}