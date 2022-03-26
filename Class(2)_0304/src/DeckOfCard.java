
public class DeckOfCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] deck = new int[52];  //用來放置鋪克的陣列 

		//產生新的一副牌
		for(int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		//洗牌
		
		for(int i = 0; i<deck.length; i++)
		{
			int temp = 0;	   //對調變數所用的中間變數
			
			//決定好範圍0~51
			int index = (int)(52*Math.random()); //使用Math.random() 範圍[0, 1)
			
			temp = deck[i];
			deck[i] = deck[index];  
			deck[index] = temp;
		}
		
		//發牌 : 印出前四張牌
		
		String[] suits = {"Spade", "Hearts", "Diamonds", "Clubs"};   //代表紙牌發色
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jeck", "Queen", "King"};
		for(int i = 0; i < 4; i++)
		{
			System.out.println(rank[deck[i] % 13] + " of " + suits[deck[i] / 13]);
		}
		
		//不太符合真實世界的洗牌情況。
	}

}
