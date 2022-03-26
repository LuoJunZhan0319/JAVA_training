import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new BorderLayout());		// ���w���O���t�m�Φ�
		
		JButton btnPageStart = new JButton("�W��");	
		JButton btnPageEnd = new JButton("�U��");
		JButton btnLineStart = new JButton("����");
		JButton btnLineEnd = new JButton("�k��");
		JButton btnCenter = new JButton("����");
		
		btnCenter.setPreferredSize(new Dimension(400, 300));	// �]�w�S�w���s�����e
		
		panel.add(btnPageStart, BorderLayout.NORTH);		// �N���s�[�J���O���S�w��m
		panel.add(btnPageEnd, BorderLayout.SOUTH);
		panel.add(btnLineStart, BorderLayout.WEST);
		panel.add(btnLineEnd, BorderLayout.EAST);
		panel.add(btnCenter, BorderLayout.CENTER);		
		
		frame.add(panel);
		frame.pack();			// ��ܭp��
		frame.setVisible(true);

	}

}
