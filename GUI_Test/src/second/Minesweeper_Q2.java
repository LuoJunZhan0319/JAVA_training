// �⬥�g M0944018
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

    //�غc���A�]�wui
    public Minesweeper_Q2() {

        initUI();
    }

    //��l��ui
    private void initUI() {
    	//��l�Ƽ������
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.NORTH);				//��ԣ���Ϋ��w����??�o�O���wJFrame��?

        add(new Board_Q2(statusbar));						//�o�]�O= =?�O��panel��iframe��???

        setResizable(false);							//�������Y��
        pack();											//�Ұʨt��(�۰�)�p������j�p

        setTitle("Minesweeper");
        setLocationRelativeTo(null);					//�_�l��m�A�ù�������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����覡
    }

    public static void main(String[] args) {

            var ex = new Minesweeper_Q2();					//�갵Minesweeper����     //var-->�u���Υh�T�w�쩳�O�ƻ����O�C
            ex.setVisible(true);						//��{����!!
            
    }
}
