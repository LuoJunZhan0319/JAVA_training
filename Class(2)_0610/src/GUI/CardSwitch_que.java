package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import zetcode.Board.MinesAdapter;

public class CardSwitch_que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Switching Cards!!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new BorderLayout());		// ���w���O���t�m�Φ�

//		JButton btnPageStart = new JButton("�W��");	
//		JButton btnPageEnd = new JButton("�U��");
		
		Image cardBack = (new ImageIcon("CardBack.jpg")).getImage();	// �����P�I(��)
		Image heartA = (new ImageIcon("Heart_A.png")).getImage();
		Image heart2 = (new ImageIcon("Heart_2.png")).getImage();
		Image heart3 = (new ImageIcon("Heart_3.png")).getImage();
		Image heart4 = (new ImageIcon("Heart_4.png")).getImage();
		
		Image[] images = {cardBack, heartA, heart2, heart3, heart4};
		
		CardSwitchPanel imagePanel = new CardSwitchPanel(images);
		imagePanel.setPreferredSize(new Dimension(800, 400));
		
//		panel.add(btnPageStart, BorderLayout.NORTH);		// �N���s�[�J���O���S�w��m
//		panel.add(btnPageEnd, BorderLayout.SOUTH);
		panel.add(imagePanel, BorderLayout.CENTER);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

class CardSwitchPanel extends JPanel
{
	Image[] images;
	Image[] imagesShown = new Image[5];
	int[]  randomSequences = new int[5];
	int lastClick = -1;					
	
	final int start_x = 10;
	final int y = 90;
	final int width = 160;
	final int height = 200;
	final int space = 30;
	
	public CardSwitchPanel(Image[] img)
	{
		images = img;
		
		//�K�[�ƹ�����ť�{��
        addMouseListener(new MinesAdapter());
		
		for(int i = 1; i < imagesShown.length; i++)
		{
			imagesShown[i] = images[0];
		}
		
		randomSequences[1] = (int)(Math.random()*4)+1;
		for(int i = 2; i <= 4; )
		{
			boolean repeat = false;
			int temp = (int)(Math.random()*4)+1;
			for(int j = 1; j < i && !repeat; j++)
			{
				if(temp == randomSequences[j])
					repeat = true;
			}
			if(!repeat)
			{
				randomSequences[i] = temp;
				i++;
			}
		}
		
		for(int k: randomSequences)
		{
			System.out.print(k+" ");
		}
	}
	
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        g.drawImage(imagesShown[1], start_x,                 y, width, height, this);
        g.drawImage(imagesShown[2], start_x+1*(width+space), y, width, height, this);
        g.drawImage(imagesShown[3], start_x+2*(width+space), y, width, height, this);
        g.drawImage(imagesShown[4], start_x+3*(width+space), y, width, height, this);
    }
    
    // �ƹ��ƥ�B�z�{��
    private class MinesAdapter extends MouseAdapter // MouseAdapter: �����ƹ��ƥ����O
    {
        public void mousePressed(MouseEvent e) 
        {
        	int cursor_x = e.getX();
        	int cursor_y = e.getY();
        	
        	if(y <= cursor_y && cursor_y - y <= height)
        	{
        		int m = (cursor_x - start_x) / (width + space);
        		int n = (cursor_x - start_x) % (width + space);
        		
        		if(n < width)
        		{			
        			if(imagesShown[m+1] == images[0])		
        			{
        				imagesShown[m+1] = images[randomSequences[m+1]];	//�N�Ӥ�������Ӯi�ܪ���m
        			}
        			else
        			{
        				imagesShown[m+1] = images[0];						//�N�Ӥ��I��������Ӯi�ܪ���m
        			}
        			
        			
        		}			
        	}
        	
        	repaint();			// �e����ø
        }
    }    
}
