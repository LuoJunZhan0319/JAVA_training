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
		
		JFrame frame = new JFrame("這是我第一個Java視窗");		// 設定視窗標題
		frame.setSize(350, 200);			// 設定視窗寬度
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 設定：關閉鈕不關閉視窗
		
		JPanel panel = new JPanel(); 		// 增加一個面板
		panel.setLayout(null);				// 不指定配置管理
		
		JLabel user  = new JLabel("User");	// 增加一個標籤
		user.setBounds(10, 20, 80, 25);		// 指定標籤的位置
		
		JTextField userText = new JTextField(0);	// 建立一個輸入框，不預設寬度
		userText.setBounds(100, 20, 165, 25);		// 指定輸入框的位置
		
		JLabel pass = new JLabel("Password:");
		pass.setBounds(10, 60, 80, 25);
		
		JPasswordField userPass = new JPasswordField(0);	// 建立一個密碼輸入框，不預設寬度
		userPass.setBounds(100, 60, 165, 25);				// 指定輸入框的位置
		
		JButton loginButton = new JButton("login");	// 建立按鈕，按鈕文字為Log in
		loginButton.setBounds(10, 100, 80, 25);
		
		JLabel status = new JLabel("status:");			// 增加一個標籤
		status.setBounds(100, 100, 80, 25);		// 指定標籤的位置
		        
        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	
            	if(userText.getText().equals("peppa") && userPass.getText().equals("pig"))
            		status.setText("密碼正確");
            	else
            		status.setText("密碼錯誤");
            }
        });
        
		//帳號
		panel.add(user);					// 將標籤加入面板
		panel.add(userText);				// 將輸入框加入面板
		
		//密碼
		panel.add(pass);					// 將標籤加入面板
		panel.add(userPass);				// 將輸入框加入面板
		
		//登入鈕 & 狀態
		panel.add(loginButton);				// 將登入按鈕加入面板
		panel.add(status);					// 將標籤加入面板
		
		frame.add(panel);					// 將面板加入視窗				
		
		frame.setVisible(true);				// true: 讓視窗可以看到

	}

}
