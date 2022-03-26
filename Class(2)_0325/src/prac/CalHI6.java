package prac;

//********************************************************************
//  Author: GY Liao
//
//  Demonstrates the concepts of classes and objects.
//********************************************************************

public class CalHI6
{
   public static void main (String[] args)
   {
      // amanda is a Dog

      int amanda_len = 1;
      int amanda_weight = 1;
      int amanda_age = 1;

      Dog amanda = new Dog(amanda_len, amanda_weight, amanda_age);
      //amanda.setData(amanda_len, amanda_weight, amanda_age);

      // bob is a Dog

      int bob_len = 2;
      int bob_weight = 2;
      int bob_age = 2;

      Dog bob = new Dog(bob_len, bob_weight, bob_age);
      //bob.setData(bob_len, bob_weight, bob_age);

      // carol is a Dog

      int carol_len = 3;
      int carol_weight = 3;
      int carol_age = 3;

      Dog carol = new Dog(carol_len, carol_weight, carol_age);
      //carol.setData(carol_len, carol_weight, carol_age);

      // garfield is a cat

      int garfield_len = 4;
      int garfield_weight = 4;
      int garfield_age = 4;

      Cat garfield = new Cat(garfield_len, garfield_weight, garfield_age);
      //garfield.setData(garfield_len, garfield_weight, garfield_age);

      // kitty is a cat

      int kitty_len = 5;
      int kitty_weight = 5;
      int kitty_age = 5;

      Cat kitty = new Cat(kitty_len, kitty_weight, kitty_age);
      //kitty.setData(kitty_len, kitty_weight, kitty_age);

      System.out.println("amanda's RunIndex="+amanda.getRunIndex());
      System.out.println("bob's RunIndex="+bob.getRunIndex());
      System.out.println("carol's RunIndex="+carol.getRunIndex());
      System.out.println("garfield's JumpIndex="+garfield.getJumpIndex());
      System.out.println("kitty's JumpIndex="+kitty.getJumpIndex());
   }
}

class Dog
{
   int len, weight, age; // Dog 類別的三個欄位

   public Dog(int l, int w, int a)
	{
		len = l;
		weight = w;
		age = a;
	}
   
   // Dog類別的資料設定方法

   public void setData(int l, int w, int a)
   {
		len = l;
		weight = w;
		age = a;
   }

   // Dog類別的資料運算方法

   public int getRunIndex()
   {
       return len * weight / age;
   }
}

class Cat
{
	
   int len, weight, age; // Cat 類別的三個欄位

   public Cat(int l, int w, int a)
	{
		len = l;
		weight = w;
		age = a;
	}
   
   // Cat類別的資料設定方法

   public void setData(int l, int w, int a)
   {
		len = l;
		weight = w;
		age = a;
   }

   // Cat類別的資料運算方法

   public int getJumpIndex()
   {
       return (len + weight) / age;
   }
}