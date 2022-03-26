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

public class JumpingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Jumping Cat...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new BorderLayout());		// 指定面板的配置形式

		JButton btnPageStart = new JButton("上面");	
		JButton btnPageEnd = new JButton("下面");
		
		Image garfield = (new ImageIcon("Garfield.png")).getImage();
		Image garfield_hehe = (new ImageIcon("Garfield_hehe.png")).getImage();
		
		Image[] images = {garfield, garfield_hehe};
		
		ImagesPanel1 imagePanel = new ImagesPanel1(images);
		imagePanel.setPreferredSize(new Dimension(800, 600));
		
		panel.add(btnPageStart, BorderLayout.NORTH);		// 將按鈕加入面板中特定位置
		panel.add(btnPageEnd, BorderLayout.SOUTH);
		panel.add(imagePanel, BorderLayout.CENTER);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

class ImagesPanel1 extends JPanel
{
	Image[] images;
	
	public ImagesPanel1(Image[] img)
	{
		images = img;
		addMouseListener(new MinesAdapter());		// 於此面板中設定滑鼠事件處理程式
	}
	
    protected void paintComponent(Graphics g) 		//繪製元件(容器，面板)
    {
        super.paintComponent(g);					//請保持此行，使得父類別面板有機會重繪
        
        int x = (int)(Math.random() * 400); 
        int y = (int)(Math.random() * 300);
        
        if(images != null)
        {
            g.drawImage(images[(int)(Math.random()*images.length)], x, y, 100, 100, this);
            
            //100, 100: 代表圖片顯示長寬
        }
    }
    
    // 滑鼠事件處理程式
    private class MinesAdapter extends MouseAdapter // MouseAdapter: 接收滑鼠事件的類別
    {
        public void mousePressed(MouseEvent e) // callback function
        {
        	System.out.println(e.getX()+" "+e.getY());
        	repaint();			// 容器重繪，並非直接呼叫paintComponent; 舉手發出訊號告訴系統抹個地方需要重繪
        }
    }    
}
