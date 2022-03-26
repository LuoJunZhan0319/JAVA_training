/**
   This program demonstrates the Countable class.
*/
/*
 * A.B
 * 合法的前提:
 * (1)A, B 都是物件層級
 * (2)A 是物件層級, 但是B是類別層級
 * (3)A, B 都是類別層級
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
      objectCount = object1.getInstanceCount();             //因為getInstanceCount()不是類別方法，所以不可用類別直接使用
      System.out.println(objectCount +
                    " instances of the class " +
                    "were created.");
  }
}