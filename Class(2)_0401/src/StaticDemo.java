/**
   This program demonstrates the Countable class.
*/
/*
 * A.B
 * �X�k���e��:
 * (1)A, B ���O����h��
 * (2)A �O����h��, ���OB�O���O�h��
 * (3)A, B ���O���O�h��
 */
public class StaticDemo
{
   public static void main(String[] args)
   {
      int objectCount;

      Countable.test();
      
      // Create three instances of the
      // Countable class.
      Countable object1 = new Countable();
      Countable object2 = new Countable();
      Countable object3 = new Countable();

      // Get the number of instances from
      // the class's static field.
      objectCount = object1.getInstanceCount();             //�]��getInstanceCount()���O���O��k�A�ҥH���i�����O�����ϥ�
      System.out.println(objectCount +
                    " instances of the class " +
                    "were created.");
  }
}