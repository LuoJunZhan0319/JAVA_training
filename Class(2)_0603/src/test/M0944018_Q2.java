package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class M0944018_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		NewCardGame c1 = new NewCardGame();
		
		System.out.print("�бq[1, 10]���D���Ӭ۾F���Ʀr�G");
		int begin = in.nextInt();
		int end = in.nextInt();
		
		int result = c1.play(begin, end);
		
		// 	���B���P�_�^�ǭȡA�M�w�ϥΪ̪��ӭt
		//  ���L�X10�i�ୱ�P�A�H�L���H
		
		if(result == 1)
			System.out.println("�AĹ�F");
		else if (result == 0)
			System.out.println("�A��F");
		else if (result == 2)
			System.out.println("���襭��");
		System.out.println(c1);
	}
}

class NewCardGame extends CardGame
{
	int a;
	int b;
	Random r =  new Random();
	
	public NewCardGame()
	{
		a = r.nextInt(10)+1;
	
		if(a == 1)
		{
			b = a+1;
		}
		else if(a == 10)
		{
			b = a-1;
		}
		else
			b = a+1;
	}
	
	public int play(int begin, int end)
	{		
		String str = "";
		
		if(begin < 1) 
			str += "�_�I�Ӥp\n";

		if(end > 10) 
			str += "���I�Ӥj\n";
			
		if(begin + 1 != end) 
			str += "����I�S���۾F\n";
		
		if(str != "") {
			System.out.println(str);
			return -1;
		}
		
		if(a > b)
			System.out.println("�q����"+b+"��"+a);
		else
			System.out.println("�q����"+a+"��"+b);
		
		
		//	�Y���m�����J�P�P��ΦP�I�ơG�^��1 (�ϥΪ����)
		//  �Y���m�����J�P�S���P��B�I�Ƥ��ۦP�G�^��0 (�q�����)
		
		if(deck.get(begin-1).equals(deck.get(end-1))) 
		{
			if(deck.get(a-1).equals(deck.get(b-1)))
				return 2;
			else
				return 1;	
		}
		else
		{
			if(deck.get(a-1).equals(deck.get(b-1)))
				return 0;
			else
				return 2;
		}

	}
	
	
	
}

class CardGame
{
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public CardGame()
	{
		Random r = new Random();
		
		for(int i = 0; i < 10; i++)
		{	
			deck.add(new Card(r.nextInt(4), r.nextInt(10)+1));
		}
	}
	
	public int play(int begin, int end)
	{
		// �Ш̾ڽҰ�@�~�������A�[�Jplay()��k���\��
		
		String str = "";
		
		if(begin < 1) 
			str += "�_�I�Ӥp\n";

		if(end > 10) 
			str += "���I�Ӥj\n";
			
		if(begin + 1 != end) 
			str += "����I�S���۾F\n";
		
		if(str != "") {
			System.out.println(str);
			return -1;
		}
		
		//	�Y���m�����J�P�P��ΦP�I�ơG�^��1 (�ϥΪ����)
		//  �Y���m�����J�P�S���P��B�I�Ƥ��ۦP�G�^��0 (�q�����)
		
		if(deck.get(begin-1).equals(deck.get(end-1))) 
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}
	
	public String toString()
	{
		String str = "";
		
		for(int i = 0; i< deck.size(); i++)
		{
			str += deck.get(i)+" ";
		}
		
		str += "\n";
		
		return str;
	}
}

class Card
{
	int suit;		// 3: spade; 2: heart; 1: diamond; 0: club
	int rank;		// 1: A; 2: 2; 11: J; 12: Q; 13: K
	
	public Card(int s, int r)
	{
		suit = s;
		rank = r;
	}
	
	public int getSuit()
	{
		return suit;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public String toString()
	{
		String[] suits = {"����", "���", "����", "�®�"}; // ���O�N�����B����B���ߡB�®�
		String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
		return suits[suit]+ranks[rank-1];
	}
	
	public void setCard(int s, int r)
	{
		suit = s;
		rank = r;
	}
	
	public boolean equals(Card c2)
	{
		if(this.suit == c2.suit || this.rank == c2.rank)
		{
			return true;
		}
		else
			return false;
	}
}