import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// https://beginnersbook.com/2015/07/java-swing-tutorial/

public class HW11 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("�o�O�ڲĤ@��Java����");		// �]�w�������D
		frame.setSize(350, 200);			// �]�w�����e��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// �]�w�G�����s����������
		
		JPanel panel = new JPanel(); 		// �W�[�@�ӭ��O
		panel.setLayout(null);				// �����w�t�m�޲z
		
		JLabel user  = new JLabel("User");	// �W�[�@�Ӽ���
		user.setBounds(10, 20, 80, 25);		// ���w���Ҫ���m
		
		JTextField userText = new JTextField(0);	// �إߤ@�ӿ�J�ءA���w�]�e��
		userText.setBounds(100, 20, 165, 25);		// ���w��J�ت���m
		
		JLabel pass = new JLabel("Password:");
		pass.setBounds(10, 60, 80, 25);
		
		JPasswordField userPass = new JPasswordField(0);	// �إߤ@�ӱK�X��J�ءA���w�]�e��
		userPass.setBounds(100, 60, 165, 25);				// ���w��J�ت���m
		
		JButton loginButton = new JButton("login");	// �إ߫��s�A���s��r��Log in
		loginButton.setBounds(10, 100, 80, 25);
		
		JLabel status = new JLabel("status:");			// �W�[�@�Ӽ���
		status.setBounds(100, 100, 80, 25);		// ���w���Ҫ���m
		        
        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	
            	if(userText.getText().equals("peppa") && userPass.getText().equals("pig"))
            		status.setText("�K�X���T");
            	else
            		status.setText("�K�X���~");
            }
        });
        
		//�b��
		panel.add(user);					// �N���ҥ[�J���O
		panel.add(userText);				// �N��J�إ[�J���O
		
		//�K�X
		panel.add(pass);					// �N���ҥ[�J���O
		panel.add(userPass);				// �N��J�إ[�J���O
		
		//�n�J�s & ���A
		panel.add(loginButton);				// �N�n�J���s�[�J���O
		panel.add(status);					// �N���ҥ[�J���O
		
		frame.add(panel);					// �N���O�[�J����				
		
		frame.setVisible(true);				// true: �������i�H�ݨ�

	}

}
