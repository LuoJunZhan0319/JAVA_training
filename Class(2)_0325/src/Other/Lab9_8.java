package Other;
public class Lab9_8
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();					//1	//4
      amanda.Dog();								//5
   }											//8
}

// ���ձN��Ӥ�k���O�[�W����

class Dog
{
   public void Dog()							//6    java���\��k�����O�P�W
   {
       System.out.println("fake constructor");	//7
   }

   public Dog()									//2	   �d�U���n�b�غc���̭��[�J�^�ǭȫ��A�A�|�ܦ���k��!!!
   {
       System.out.println("real constructor");	//3
   }

}