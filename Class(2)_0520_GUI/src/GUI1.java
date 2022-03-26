import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame(); 			//建立新視窗(的資料)(頂層)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);
		
		JPanel panel = new JPanel();			//中間階層
		panel.setLayout(null);					//不指定面板的布局方式
		
		JLabel user = new JLabel("User");		//最基本的元件JLabel
		user.setBounds(10, 20, 80, 25);
		
		JTextField userText = new JTextField(0);//最基本的元件JTextField
		userText.setBounds(100, 20, 165, 25);
		
		panel.add(user);
		panel.add(userText);
		frame.add(panel);
		
		
		frame.setVisible(true);					//視窗的可被看見!
		

	}

}
