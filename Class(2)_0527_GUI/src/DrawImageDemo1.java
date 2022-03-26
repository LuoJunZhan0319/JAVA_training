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

		// 應用ImageIcon讀取圖檔，該類別提供getImage()方法可取得圖片
		// Image: 圖片類別
		Image image = new ImageIcon("elephant.png").getImage();
		MyPanel1 panel = new MyPanel1(image);	

		
		// JPanel提供的方法，作為系統(自動)計算視窗大小的依據
		panel.setPreferredSize(new Dimension(image.getWidth(frame), image.getHeight(frame)));		

		frame.add(panel);
		frame.pack();					// 啟動系統(自動)計算視窗大小
		frame.setVisible(true);
	}
}

class MyPanel1 extends JPanel 		//MyPanel1類別:要顯示一張大象面板類別
{
	Image image;					//自建類別，且設定一個欄位儲存大象圖(image)

	public MyPanel1(Image img) throws IOException 
	{
		super();
		image = img;
	}

	// 系統重繪視窗時所呼叫的方法
	
	public void paintComponent(Graphics g) //paintComponent(Graphics)繪圖方法
	{	
		
		g.drawImage(image, 0, 0, this);		//image:大象圖, 0:x, 0:y, this:目前面板 
	}
}