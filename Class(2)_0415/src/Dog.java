class Dog
{
   String name;
   int len, weight, age; 

   // Dog類別的資料設定方法

   public Dog(int l, int w, int a)
   {
		len = l;
		weight = w;
		age = a;
   }
   
   public Dog(String s, int l, int w, int a)
   {
	    name = s;
		len = l;
		weight = w;
		age = a;
   }

   // Dog類別的資料運算方法

   public int getRunIndex()
   {
       return len * weight / age;
   }
   
   public String toString()
   {
	   return name+"健康指數:"+this.getRunIndex();
   }
}