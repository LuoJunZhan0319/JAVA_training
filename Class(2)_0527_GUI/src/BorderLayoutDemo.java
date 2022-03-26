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
		
		JPanel panel = new JPanel(new BorderLayout());		// 指定面板的配置形式
		
		JButton btnPageStart = new JButton("上面");	
		JButton btnPageEnd = new JButton("下面");
		JButton btnLineStart = new JButton("左邊");
		JButton btnLineEnd = new JButton("右邊");
		JButton btnCenter = new JButton("中間");
		
		btnCenter.setPreferredSize(new Dimension(400, 300));	// 設定特定按鈕的長寬
		
		panel.add(btnPageStart, BorderLayout.NORTH);		// 將按鈕加入面板中特定位置
		panel.add(btnPageEnd, BorderLayout.SOUTH);
		panel.add(btnLineStart, BorderLayout.WEST);
		panel.add(btnLineEnd, BorderLayout.EAST);
		panel.add(btnCenter, BorderLayout.CENTER);		
		
		frame.add(panel);
		frame.pack();			// 顯示計算
		frame.setVisible(true);

	}

}
