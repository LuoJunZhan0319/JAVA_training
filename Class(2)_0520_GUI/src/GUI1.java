import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame(); 			//�إ߷s����(�����)(���h)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);
		
		JPanel panel = new JPanel();			//�������h
		panel.setLayout(null);					//�����w���O�������覡
		
		JLabel user = new JLabel("User");		//�̰򥻪�����JLabel
		user.setBounds(10, 20, 80, 25);
		
		JTextField userText = new JTextField(0);//�̰򥻪�����JTextField
		userText.setBounds(100, 20, 165, 25);
		
		panel.add(user);
		panel.add(userText);
		frame.add(panel);
		
		
		frame.setVisible(true);					//�������i�Q�ݨ�!
		

	}

}
