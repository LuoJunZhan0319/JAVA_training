public class Lab11_4a
{
   public static void main(String[] args)
   {

   }
}
class Parent1
{
   // java will not add default constructor

   public Parent1(int i)			//�]���w�g�����Ѽƪ��غc���A�ҥHJAVA���|�b�[�L�Ѽƪ��غc��
   {i = 10;}

}

class Child1 extends Parent1		//�l���O���u�|�w�]���A�[�����O���L�Ѽƫغc���A�ҥH�䤣��N�|����
{									//�קK�覡���G�A�I�s���Ѽƪ�super(10);�άO�b�����O�[�W�L�Ѽƪ��غc��
   public Child1()					
   {
      // super() added here by java

      System.out.println("hello... I am child");
   }
}