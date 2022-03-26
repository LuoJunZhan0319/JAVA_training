import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

// http://compsci.ca/v3/viewtopic.php?t=28197

public class DrawImageDemo1
{
	public static void main(String[] args) throws IOException 
	{
		JFrame frame = new JFrame("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ����ImageIconŪ�����ɡA�����O����getImage()��k�i���o�Ϥ�
		// Image: �Ϥ����O
		Image image = new ImageIcon("elephant.png").getImage();
		MyPanel1 panel = new MyPanel1(image);	

		
		// JPanel���Ѫ���k�A�@���t��(�۰�)�p������j�p���̾�
		panel.setPreferredSize(new Dimension(image.getWidth(frame), image.getHeight(frame)));		

		frame.add(panel);
		frame.pack();					// �Ұʨt��(�۰�)�p������j�p
		frame.setVisible(true);
	}
}

class MyPanel1 extends JPanel 		//MyPanel1���O:�n��ܤ@�i�j�H���O���O
{
	Image image;					//�۫����O�A�B�]�w�@������x�s�j�H��(image)

	public MyPanel1(Image img) throws IOException 
	{
		super();
		image = img;
	}

	// �t�έ�ø�����ɩҩI�s����k
	
	public void paintComponent(Graphics g) //paintComponent(Graphics)ø�Ϥ�k
	{	
		
		g.drawImage(image, 0, 0, this);		//image:�j�H��, 0:x, 0:y, this:�ثe���O 
	}
}