public class Lab9_1_3
{
   public static void main(String[] args)
   {
      RightTriangle r1 = new RightTriangle();
      RightTriangle r11 = new RightTriangle();

      r1.side1 = 3;   // 直接存取物件的欄位變數
      r1.side2 = 4;   // 直接存取物件的欄位變數

      // ......進行其他100000行的計算.........

      r1.side1 = 10;   // 主程式疏失
      // ......進行其他200000行的計算.........

      System.out.println("三角形面積為"+r1.getArea());
   }
}

class RightTriangle
{
   double side1;    // 加上private以了解存取限制的效果
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