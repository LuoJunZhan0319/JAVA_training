public class Lab11_3
{
   public static void main(String[] args)
   {

   }
}
class Parent
{
   public void Parent(){}
}
class Child extends Parent
{
   public Child()
   {
      System.out.println("Erroneous first line");
      super();										//�o���this()���Pı���I���A�ϥ�super()�I�s�����O�غc���e�A�e�����঳��L�{��
   }
}