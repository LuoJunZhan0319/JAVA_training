package Other;
public class Lab9_15
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog(5);
      System.out.println(amanda.getWeight());
      Dog bob = new Dog();
      System.out.println(bob.getWeight());
   }
}
class Dog							//�o�䪺�غc���ܻ�!!!  �غc���]���h��
{
   double length, weight, age;
   public Dog()
   {
      this(1, 0.5, 1);
   }
   public Dog(double age)
   {
      this(age, 0.5*age, age);		//this �]�i�H�ΨӰ���ѼƼƬۦP���غc���C
   }
   public Dog(double len, double wei, double a)
   {
      length = len;
      weight = wei;
      age = a;
   }
   public double getWeight()
   {
      return weight;
   }
}