public class Lab9_1_3
{
   public static void main(String[] args)
   {
      RightTriangle r1 = new RightTriangle();
      RightTriangle r11 = new RightTriangle();

      r1.side1 = 3;   // �����s����������ܼ�
      r1.side2 = 4;   // �����s����������ܼ�

      // ......�i���L100000�檺�p��.........

      r1.side1 = 10;   // �D�{������
      // ......�i���L200000�檺�p��.........

      System.out.println("�T���έ��n��"+r1.getArea());
   }
}

class RightTriangle
{
   double side1;    // �[�Wprivate�H�F�Ѧs������ĪG
   double side2;

   private void setSides(double s1, double s2)
   {
       side1 = s1;
       side2 = s2;
   }
   public double getArea()
   {
       return side1 * side2 / 2;
   }
}