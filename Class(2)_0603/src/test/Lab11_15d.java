package test;
public class Lab11_15d
{
   public static void main(String[] args)
   {
        Labrador amanda = new Labrador(10, 20);
        Corgi bob = new Corgi(2, 5);       


        System.out.println("amanda����="+amanda.tailLength);
        System.out.println("bob�L��="+bob.legLength);
        
        // �Ьd�� amanda �b�]����
        
        System.out.println("amanda�b�]����="+amanda.getRunIndex());
        
        // �Ьd�� bob �b�]����
        
        System.out.println("bob�b�]����="+bob.getRunIndex());
        
   }
}
abstract class Dog
{
    int length;
    
    // �Щ󦹫ŧi��H��k getRunIndex()
}

class Labrador extends Dog
{
    int tailLength;

    public Labrador(int tail, int body)
    {
        tailLength = tail;          // tailLength�w�q��l���O(�ۤv)
        length = body;				// length�w�q������O
    }
    
    // �Щ󦹼g�XLabrador���O��getRunIndex��k
}

class Corgi extends Dog
{
    int legLength;

    public Corgi(int leg, int body)
    {
        legLength = leg;
        length = body;
    }
    
    // �Щ󦹼g�XCorgi���O��getRunIndex��k
}
