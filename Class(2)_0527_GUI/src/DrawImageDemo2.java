import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

// http://compsci.ca/v3/viewtopic.php?t=28197

public class DrawImageDemo2
{
	public static void main(String[] args) throws IOException 
	{
		JFrame frame = new JFrame("DrawImageDemo2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ����ImageIconŪ�����ɡA�����O����getImage()��k�i���o�Ϥ�
		// Image: �Ϥ����O
		Image image = new ImageIcon("elephant.png").getImage();
		MyPanel2 panel = new MyPanel2(image);	
		
		// JPanel���Ѫ���k�A�@���t��(�۰�)�p������j�p���̾�
		panel.setPreferredSize(new Dimension(image.getWidth(frame), image.getHeight(frame)));		

		frame.add(panel);
		frame.pack();					// �Ұʨt��(�۰�)�p������j�p
		frame.setVisible(true);
	}
}

class MyPanel2 extends JPanel 
{
	Image image;

	public MyPanel2(Image img) throws IOException 
	{
		super();
		image = img;
	}

	// �t�έ�ø�����ɩҩI�s����k
	
	public void paintComponent(Graphics g) {	
		
		g.drawImage(image, (int)(Math.random()*200), 0, this);
	}
}