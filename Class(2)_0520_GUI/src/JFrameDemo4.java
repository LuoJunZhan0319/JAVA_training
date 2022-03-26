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

public class JFrameDemo4 {

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
		
		JLabel status = new JLabel("Status:");
		status.setBounds(10, 60, 80, 25);
		
		JButton loginButton = new JButton("Log in");	// �إ߫��s�A���s��r��Log in
		loginButton.setBounds(100, 60, 165, 25);
		        
        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	System.out.println("hello world.");
            	
            	if(userText.getText().equals("peppa"))
            		status.setText(status.getText()+"���T"); 	//��status���Ҥ�r���X�[�W"���T"�A���s�Ψӳ]�w�Ӽ���
            }
        });
		
		panel.add(user);					// �N���ҥ[�J���O
		panel.add(userText);				// �N��J�إ[�J���O
		panel.add(loginButton);				// �N�n�J���s�[�J���O
		panel.add(status);					// �N���A���ҥ[�J���O
		frame.add(panel);					// �N���O�[�J����				
		
		frame.setVisible(true);				// true: �������i�H�ݨ�

	}

}
