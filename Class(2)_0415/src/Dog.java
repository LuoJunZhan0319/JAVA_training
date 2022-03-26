class Dog
{
   String name;
   int len, weight, age; 

   // Dog���O����Ƴ]�w��k

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

   // Dog���O����ƹB���k

   public int getRunIndex()
   {
       return len * weight / age;
   }
   
   public String toString()
   {
	   return name+"���d����:"+this.getRunIndex();
   }
}