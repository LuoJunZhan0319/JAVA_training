package others;


//********************************************************************
//  StringMutation.java       Author: GY Liao
//
//  Demonstrates the common program by students without the concepts of objects.
//********************************************************************

public class CalHI4
{
   public static void main (String[] args)
   {
      // amanda is a Dog

      int amanda_len = 1;
      int amanda_weight = 1;
      int amanda_age = 1;
      Dog amanda = new Dog();
      amanda.setData(1, 1, 1);
      System.out.println("amanda's RunIndex = " + amanda.returnRunIndex());

      // bob is a Dog

      int bob_len = 2;
      int bob_weight = 2;
      int bob_age = 2;  
      Dog bob = new Dog();  //產生一個狗狗類別的物件(用我們建立好的模子xD)
      bob.setData(2, 2, 2); //只用狗狗物件裡所建立的方法，把bob狗狗的資料填進去
      System.out.println("bob's RunIndex = " + bob.returnRunIndex());
      
      // carol is a Dog
      
      int carol_len = 3;
      int carol_weight = 3;
      int carol_age = 3;  
      Dog carol = new Dog();
      carol.setData(3, 3, 3);
      System.out.println("carol's RunIndex = " + carol.returnRunIndex());

      // garfield is a cat
      
      int garfield_len = 4;
      int garfield_weight = 4;
      int garfield_age = 4;   
      Cat garfield = new Cat();
      garfield.setData(4, 4, 4);
      System.out.println("garfield's RunIndex = " + garfield.getJumpIndex());

      // kitty is a cat

      int kitty_len = 5;
      int kitty_weight = 5;
      int kitty_age = 5;    
      Cat kitty = new Cat();
      kitty.setData(5, 5, 5);
      System.out.println("kitty's RunIndex = " + kitty.getJumpIndex());

     // System.out.println("amanda's RunIndex="+getRunIndex(amanda_len, amanda_weight, amanda_age));
     // System.out.println("bob's RunIndex="+getRunIndex(bob_len, bob_weight, bob_age));
     // System.out.println("carol's RunIndex="+getRunIndex(carol_len, carol_weight, carol_age));
     // System.out.println("garfield's JumpIndex="+getJumpIndex(garfield_len, garfield_weight, garfield_age));
     // System.out.println("kitty's JumpIndex="+getJumpIndex(kitty_len, kitty_weight, kitty_age));
   }

//   public static int getRunIndex(int len, int weight, int age)
//   {
//       return len * weight / age;
//   }
//   public static int getJumpIndex(int len, int weight, int age)
//   {
//       return (len + weight) / age;
//   }
}

class Dog
{
	int len ;
    int weight ;
    int age;
    
    public void setData(int l, int w, int a)  //讓其他程式(通常是主程式)所使用
    {
    	len = l;
        weight = w;
        age = a;
    }
    
    public int returnRunIndex()  //計算奔跑指數
    {
    	return len * weight / age; 
    }

}

class Cat
{
	int len ;
    int weight ;
    int age;
	
    public void setData(int l, int w, int a)  //讓其他程式(通常是主程式)所使用
    {
    	len = l;
        weight = w;
        age = a;
    }
    
    public int getJumpIndex()  //計算跳躍指數
    {
    	return (len + weight) / age; 
    }
	
	
}