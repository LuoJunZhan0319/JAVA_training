//import java.util.Random;
//
//public class Die {
//	   
//	   
//		   private int DIE_SIDES ;  //紀錄骰子有幾面
//		   private int num;			//紀錄骰子朝上點數
//		   
//		   
//		   public Die(int a)
//		   {
//			   DIE_SIDES = a;
//			   roll();				//建構式直接執行擲骰子
//		   }
//		   
//		   public void roll()		//擲骰子
//		   {
//			   Random rand = new Random();		
//			   num = rand.nextInt(DIE_SIDES)+1;	//隨機從[1, DIE_SIDES]挑選一個數
//			   
//		   }
//		   
//		   public int getValue()
//		   {
//			   return num;			//回傳向上點數
//		   }
//	   
//}
