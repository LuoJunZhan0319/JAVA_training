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

		// 應用ImageIcon讀取圖檔，該類別提供getImage()方法可取得圖片
		// Image: 圖片類別
		Image image = new ImageIcon("elephant.png").getImage();
		MyPanel2 panel = new MyPanel2(image);	
		
		// JPanel提供的方法，作為系統(自動)計算視窗大小的依據
		panel.setPreferredSize(new Dimension(image.getWidth(frame), image.getHeight(frame)));		

		frame.add(panel);
		frame.pack();					// 啟動系統(自動)計算視窗大小
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

	// 系統重繪視窗時所呼叫的方法
	
	public void paintComponent(Graphics g) {	
		
		g.drawImage(image, (int)(Math.random()*200), 0, this);
	}
}