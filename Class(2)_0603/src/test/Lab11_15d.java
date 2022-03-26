package test;
public class Lab11_15d
{
   public static void main(String[] args)
   {
        Labrador amanda = new Labrador(10, 20);
        Corgi bob = new Corgi(2, 5);       


        System.out.println("amanda尾長="+amanda.tailLength);
        System.out.println("bob腿長="+bob.legLength);
        
        // 請查詢 amanda 奔跑指數
        
        System.out.println("amanda奔跑指數="+amanda.getRunIndex());
        
        // 請查詢 bob 奔跑指數
        
        System.out.println("bob奔跑指數="+bob.getRunIndex());
        
   }
}
abstract class Dog
{
    int length;
    
    // 請於此宣告抽象方法 getRunIndex()
}

class Labrador extends Dog
{
    int tailLength;

    public Labrador(int tail, int body)
    {
        tailLength = tail;          // tailLength定義於子類別(自己)
        length = body;				// length定義於父類別
    }
    
    // 請於此寫出Labrador類別的getRunIndex方法
}

class Corgi extends Dog
{
    int legLength;

    public Corgi(int leg, int body)
    {
        legLength = leg;
        length = body;
    }
    
    // 請於此寫出Corgi類別的getRunIndex方法
}
