// 詹洛君 M0944018
package second;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Java Minesweeper Game
 *
 * Author: Jan Bodnar
 * Website: http://zetcode.com
 */

public class Minesweeper_Q2 extends JFrame {

    private JLabel statusbar;

    //建構式，設定ui
    public Minesweeper_Q2() {

        initUI();
    }

    //初始化ui
    private void initUI() {
    	//初始化標籤欄位
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.NORTH);				//為啥不用指定物件??這是指定JFrame嗎?

        add(new Board_Q2(statusbar));						//這也是= =?是把panel丟進frame嗎???

        setResizable(false);							//視窗不縮放
        pack();											//啟動系統(自動)計算視窗大小

        setTitle("Minesweeper");
        setLocationRelativeTo(null);					//起始位置，螢幕正中間
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //關閉方式
    }

    public static void main(String[] args) {

            var ex = new Minesweeper_Q2();					//實做Minesweeper物件     //var-->只不用去確定到底是甚麼類別。
            ex.setVisible(true);						//顯現視窗!!
            
    }
}
