package other;

public class Lab11_5
{
   public static void main(String[] args)
   {
       Parent2 p = new Parent2();
       Child2 c = new Child2();

       p.m();
       // p.m(10);
       c.m();     // �w�q������O������
       c.m(20);   // �w�q��l���O������
   }
}
class Parent2
{
   public void m(){System.out.println("printed by parent");}
}
class Child2 extends Parent2
{
   public void m(int i){System.out.println(i);}
}