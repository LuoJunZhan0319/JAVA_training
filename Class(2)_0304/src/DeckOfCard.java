
public class DeckOfCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] deck = new int[52];  //�Ψө�m�Q�J���}�C 

		//���ͷs���@�ƵP
		for(int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		//�~�P
		
		for(int i = 0; i<deck.length; i++)
		{
			int temp = 0;	   //����ܼƩҥΪ������ܼ�
			
			//�M�w�n�d��0~51
			int index = (int)(52*Math.random()); //�ϥ�Math.random() �d��[0, 1)
			
			temp = deck[i];
			deck[i] = deck[index];  
			deck[index] = temp;
		}
		
		//�o�P : �L�X�e�|�i�P
		
		String[] suits = {"Spade", "Hearts", "Diamonds", "Clubs"};   //�N��ȵP�o��
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jeck", "Queen", "King"};
		for(int i = 0; i < 4; i++)
		{
			System.out.println(rank[deck[i] % 13] + " of " + suits[deck[i] / 13]);
		}
		
		//���ӲŦX�u��@�ɪ��~�P���p�C
	}

}
