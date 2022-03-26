/**
   This class computes a curved grade. It extends
   the GradedActivity class.
*/

public class CurvedActivity extends GradedActivity			//CurvedActivity(會調分的考試)
{
   double rawScore;     // Unadjusted score
   double percentage;   // Curve percentage

   /**
      The constructor sets the curve percentage.
      @param percent The curve percentage.
   */

   public CurvedActivity(double percent)
   {
      percentage = percent;
      rawScore = 0.0;
   }

   /**
      The setScore method overrides the superclass
      setScore method. This version accepts the
      unadjusted score as an argument. That score is
      multiplied by the curve percentage and the
      result is sent as an argument to the superclass's
      setScore method.
      @param s The unadjusted score.
   */

   public void setScore(double s)			//方法覆蓋，當子類別方法完全跟父類別方法一楊，則會依子類別方法為主，並覆蓋父類別方法
   {
      rawScore = s;
      super.setScore(rawScore * percentage);//在父類別中設定最後的調分後分數	<利用super.可以呼叫父類別被覆蓋的方法>		
      
   }

   /**
      The getRawScore method returns the raw score.
      @return The value in the rawScore field.
   */

   public double getRawScore()
   {
      return rawScore;
   }

   /**
      The getPercentage method returns the curve
      percentage.
      @return The value in the percentage field.
   */

   public double getPercentage()
   {
      return percentage;
   }
}