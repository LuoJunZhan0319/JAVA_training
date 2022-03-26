/**
   Rectangle class, phase 4
   Under construction!
*/

public class RectangleOld
{
   private double length;
   private double width;
   private static int count;		//加上static之後，使得變數具備類別特性，所以整個類別裡面(也就是該類別所產生的所有物件)都公用一個這個變數

   /**
      The setLength method stores a value in the
      length field.
      @param len The value to store in length.
   */

   public void setLength(double len)
   {
      length = len;
      count++;  //你要放在建構式也沒問題拉哈哈
   }

   /**
      The setWidth method stores a value in the
      width field.
      @param w The value to store in width.
   */

   public void setWidth(double w)
   {
      width = w;
   }

   /**
      The getLength method returns a Rectangle
      object's length.
      @return The value in the length field.
   */

   public double getLength()
   {
      return length;
   }

   /**
      The getWidth method returns a Rectangle
      object's width.
      @return The value in the width field.
   */

   public double getWidth()
   {
      return width;
   }

   /**
      The getArea method returns a Rectangle
      object's area.
      @return The product of length times width.
   */

   public double getArea()
   {
      return length * width;
   }
   
   public int getCount()
   {
      return count;
   }     
}