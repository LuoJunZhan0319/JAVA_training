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
		
		JFrame frame = new JFrame("這是我第一個Java視窗");		// 設定視窗標題
		frame.setSize(350, 200);			// 設定視窗寬度
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 設定：關閉鈕不關閉視窗
		
		JPanel panel = new JPanel(); 		// 增加一個面板
		panel.setLayout(null);				// 不指定配置管理
		
		JLabel user  = new JLabel("User");	// 增加一個標籤
		user.setBounds(10, 20, 80, 25);		// 指定標籤的位置
		
		JTextField userText = new JTextField(0);	// 建立一個輸入框，不預設寬度
		userText.setBounds(100, 20, 165, 25);		// 指定輸入框的位置
		
		JLabel status = new JLabel("Status:");
		status.setBounds(10, 60, 80, 25);
		
		JButton loginButton = new JButton("Log in");	// 建立按鈕，按鈕文字為Log in
		loginButton.setBounds(100, 60, 165, 25);
		        
        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	System.out.println("hello world.");
            	
            	if(userText.getText().equals("peppa"))
            		status.setText(status.getText()+"正確"); 	//把status標籤文字取出加上"正確"，重新用來設定該標籤
            }
        });
		
		panel.add(user);					// 將標籤加入面板
		panel.add(userText);				// 將輸入框加入面板
		panel.add(loginButton);				// 將登入按鈕加入面板
		panel.add(status);					// 將狀態標籤加入面板
		frame.add(panel);					// 將面板加入視窗				
		
		frame.setVisible(true);				// true: 讓視窗可以看到

	}

}
