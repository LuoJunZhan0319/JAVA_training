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
		
		JPanel panel = new JPanel(new BorderLayout());		// ���w���O���t�m�Φ�

		JButton btnPageStart = new JButton("�W��");	
		JButton btnPageEnd = new JButton("�U��");
		
		Image garfield = (new ImageIcon("Garfield.png")).getImage();
		Image garfield_hehe = (new ImageIcon("Garfield_hehe.png")).getImage();
		
		Image[] images = {garfield, garfield_hehe};
		
		ImagesPanel1 imagePanel = new ImagesPanel1(images);
		imagePanel.setPreferredSize(new Dimension(800, 600));
		
		panel.add(btnPageStart, BorderLayout.NORTH);		// �N���s�[�J���O���S�w��m
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
		addMouseListener(new MinesAdapter());		// �󦹭��O���]�w�ƹ��ƥ�B�z�{��
	}
	
    protected void paintComponent(Graphics g) 		//ø�s����(�e���A���O)
    {
        super.paintComponent(g);					//�ЫO������A�ϱo�����O���O�����|��ø
        
        int x = (int)(Math.random() * 400); 
        int y = (int)(Math.random() * 300);
        
        if(images != null)
        {
            g.drawImage(images[(int)(Math.random()*images.length)], x, y, 100, 100, this);
            
            //100, 100: �N��Ϥ���ܪ��e
        }
    }
    
    // �ƹ��ƥ�B�z�{��
    private class MinesAdapter extends MouseAdapter // MouseAdapter: �����ƹ��ƥ����O
    {
        public void mousePressed(MouseEvent e) // callback function
        {
        	System.out.println(e.getX()+" "+e.getY());
        	repaint();			// �e����ø�A�ëD�����I�spaintComponent; �|��o�X�T���i�D�t�Ω٭Ӧa��ݭn��ø
        }
    }    
}
