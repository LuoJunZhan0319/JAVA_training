public class Lab9_1
{
   static int a;

   public static void main(String[] args)
   {
       System.out.println(Math.PI);

       Dog.number = 20;            //�i�H<���O.���O�ܼ�> �����ϥ����O�ܼ�        // ��L���O�����O�ܼƭn�[�W���O�W��
       System.out.println("number in Dog:" + Dog.number);
       Dog.number++;
       System.out.println("number in Dog:" + Dog.number);

   }
}

class Dog
{
   static int number;
}