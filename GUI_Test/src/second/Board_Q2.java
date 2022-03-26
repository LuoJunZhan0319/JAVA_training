// �⬥�g M0944018
package second;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board_Q2 extends JPanel {

    private final int NUM_IMAGES = 13;				//13�i�ϥ�
    private final int CELL_SIZE = 15;				//��l�j�p

    private final int COVER_FOR_CELL = 10;			//�л\���Ϥ�
    private final int MARK_FOR_CELL = 10;			//�X�l���Ϥ�
    private final int EMPTY_CELL = 0;				// �ťծ�l�A�L�Ʀr�A�L�a�p
    private final int MINE_CELL = 9;				//�a�p����l
    private final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;		//�a�p����l+�л\���Ϥ� = 19
    private final int MARKED_MINE_CELL = COVERED_MINE_CELL + MARK_FOR_CELL; //�a�p����l+�л\���Ϥ�+�X�l���Ϥ� = 29

    private final int DRAW_MINE = 9;				//�e�X�a�p
    private final int DRAW_COVER = 10;				//�e�X�л\���Ϥ�
    private final int DRAW_MARK = 11;				//�e�X�X�l�Ϥ�
    private final int DRAW_WRONG_MARK = 12;			//�e�X���~�Ϥ�

    private final int N_MINES = 40;					//��40�Ӧa�p
    private final int N_ROWS = 16;					//��16�C
    private final int N_COLS = 16;					//��16��

    private final int BOARD_WIDTH = N_COLS * CELL_SIZE + 1;		//�����e
    private final int BOARD_HEIGHT = N_ROWS * CELL_SIZE + 1;	//������

    private int[] field;							//��l���}�C�A�Q���@��C
    private boolean inGame;							//�O�_���C��
    private int minesLeft;							//�ѤU���X�l
    private Image[] img;							//�Ϥ��}�C

    private int allCells;							//��������l
    private final JLabel statusbar;					//���Ҫ���(�Ψ���ܿ�BĹ�B�Ѿl�Ѥl��(�]�i�H�Q���a�p��))

    //�غc��
    public Board_Q2(JLabel statusbar) {
    	//��������O(JPanel)
    	super();
    	//�]�w����Ѽ�
        this.statusbar = statusbar;
        //��l�Ƶ���
        initBoard();
    }

    private void initBoard() {
    	
    	//�]�w�����j�p
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));   // �����򤣥Ϋ��wpanel??
        
        //�إ߹Ϥ��}�C�j�p
        img = new Image[NUM_IMAGES];
        
        //��J�Ϥ�����i�}�C
        for (int i = 0; i < NUM_IMAGES; i++) {
        	//�Ϥ��W��+��m
            String path = "src/resources/" + i + ".png";
            //����Ϥ�����ܰ}�C��
            img[i] = (new ImageIcon(path)).getImage();
        }
        
        //�K�[�ƹ�����ť�{��
        addMouseListener(new MinesAdapter());
        //�إ߷s�C��
        newGame();
    }

    private void newGame() {
    	
    	//�ŧi��l
        int cell;
        //�إ߶üƪ���
        Random random = new Random();
        //�]�w�O�_�b���C��
        inGame = true;
        //�a�p�Ѿl�Ƶ���40
        minesLeft = N_MINES;
        
        //��������l��=��C�ۭ�
        allCells = N_ROWS * N_COLS;
        //�]�w������l���s���}�C
        field = new int[allCells];
        
        //�C�Ӯ�l�����]�w10
        for (int i = 0; i < allCells; i++) {

            field[i] = COVER_FOR_CELL;
        }
        
        //�b���Ҫ�����ܳѾl�h�֦a�p
        statusbar.setText(Integer.toString(minesLeft));

        
        int i = 0;
        //�ǳƧ�a�p�맹
        while (i < N_MINES) {
        	//�H����ܦb���̶�a�p
            int position = (int) (allCells * random.nextDouble());
            
            //�P�_��m�O�_�X�z�B�S���]�m�L�a�p
            if ((position < allCells)
                    && (field[position] != COVERED_MINE_CELL)) {

            	//�o��b�ĴX��(����n�b�P��Ʀr�[�@)
                int current_col = position % N_COLS;
                //�b�Ӧ�m�]�U�a�p
                field[position] = COVERED_MINE_CELL;		// ��}�l�u��covered mine
                //�a�p�ƥ[�@
                i++;

                //�H�U�N�O�@��P�_(��a�p���䪺�Ʀr�[�@)
                if (current_col > 0) {
                    cell = position - 1 - N_COLS;				// ���W
                    if (cell >= 0) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                    cell = position - 1;						// ��
                    if (cell >= 0) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }

                    cell = position + N_COLS - 1;				// ���U
                    if (cell < allCells) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                }

                cell = position - N_COLS;						// �W
                if (cell >= 0) {
                    if (field[cell] != COVERED_MINE_CELL) {
                        field[cell] += 1;
                    }
                }

                cell = position + N_COLS;						// �U
                if (cell < allCells) {
                    if (field[cell] != COVERED_MINE_CELL) {
                        field[cell] += 1;
                    }
                }

                if (current_col < (N_COLS - 1)) {
                    cell = position - N_COLS + 1;					// �k�W
                    if (cell >= 0) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                    cell = position + N_COLS + 1;					// �k�U
                    if (cell < allCells) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                    cell = position + 1;							// �k
                    if (cell < allCells) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                }
            }
        }
    }
    
    //�M��Ů��l(���@�ӰѼ�)
    private void find_empty_cells(int j) {

    	//�ĴX��
        int current_col = j % N_COLS;
        int cell;

        //�Q�Τ@��P�_�A�M�w�H�H���@�Ӱ_�l�I����O�_����0���Ů�
        if (current_col > 0) {							// �D������
            cell = j - N_COLS - 1;						// ���W��
            if (cell >= 0) {							
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);			//�ۧکI�s
                    }
                }
            }

            cell = j - 1;								// ����
            if (cell >= 0) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }

            cell = j + N_COLS - 1;						// ���U
            if (cell < allCells) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }
        }

        cell = j - N_COLS;								// �W��
        if (cell >= 0) {
            if (field[cell] > MINE_CELL) {
                field[cell] -= COVER_FOR_CELL;
                if (field[cell] == EMPTY_CELL) {
                    find_empty_cells(cell);
                }
            }
        }

        cell = j + N_COLS;								// �U��
        if (cell < allCells) {
            if (field[cell] > MINE_CELL) {
                field[cell] -= COVER_FOR_CELL;
                if (field[cell] == EMPTY_CELL) {
                    find_empty_cells(cell);
                }
            }
        }

        if (current_col < (N_COLS - 1)) {				// �Y�D�̥k��
            cell = j - N_COLS + 1;						// �k�W
            if (cell >= 0) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }

            cell = j + N_COLS + 1;						// �k�U
            if (cell < allCells) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }

            cell = j + 1;								// �k��
            if (cell < allCells) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }
        }

    }

    //�e�Ϫ�����
    @Override
    public void paintComponent(Graphics g) {

    	//�S�л\����s
        int uncover = 0;

        //�w���l���P�_
        for (int i = 0; i < N_ROWS; i++) {

            for (int j = 0; j < N_COLS; j++) {

                int cell = field[(i * N_COLS) + j];
                
                //�C���i��B�O�a�p�A�����C�����O��
                if (inGame && cell == MINE_CELL) {

                    inGame = false;
                }
                
                //���C���������O��
                if (!inGame) {

                	//����COVERED_MINE_CELL���a�p���e�X��
                    if (cell == COVERED_MINE_CELL) {
                        cell = DRAW_MINE;
                    //�Ѥl�u���\��a�p���e�X��
                    } else if (cell == MARKED_MINE_CELL) {
                        cell = DRAW_MARK;
                    //�Ѥl�S���\��a�p���e�X���~�X�l
                    } else if (cell > COVERED_MINE_CELL) {
                        cell = DRAW_WRONG_MARK;
                    //��L��½�����a�p�����л\
                    } else if (cell > MINE_CELL) {
                        cell = DRAW_COVER;
                    }
                    
                //�C���٦b�i�檺�O��
                } else {
                	//�e�X�X�l
                    if (cell > COVERED_MINE_CELL) {
                        cell = DRAW_MARK;
                        
                    //�e�X�л\(�C����إ߳��u�|���ӧP�_��!!)
                    } else if (cell > MINE_CELL) {
                        cell = DRAW_COVER;
                        uncover++;
                    }
                }
                
                //��C��Oԣ�e�X��
                g.drawImage(img[cell], (j * CELL_SIZE),
                        (i * CELL_SIZE), this);
            }
        }
        
        //�P�_�ӧQ����
        if (uncover == 0 && inGame) {

            inGame = false;
            statusbar.setText("Game won");

        //���ѱ���
        } else if (!inGame) {
            statusbar.setText("Game lost");
        }
    }

    //�]�w�ƹ��ƥ�
    private class MinesAdapter extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
        	
        	//�M�w�A�I�b���Ӧ�m
            int x = e.getX();
            int y = e.getY();

            int cCol = x / CELL_SIZE;
            int cRow = y / CELL_SIZE;

            //�O�_�n��ø���O��
            boolean doRepaint = false;

            //�C�����ѡA���ͷs�C���åB����
            if (!inGame) {

                newGame();
                repaint();
            }

            
            if ((x < N_COLS * CELL_SIZE) && (y < N_ROWS * CELL_SIZE)) {		//�T�w���W�X�������

                if (e.getButton() == MouseEvent.BUTTON3) {					//MouseEvent.BUTTON3��ܷƹ��k��, MouseEvent.BUTTON1����

                	//�O�_�j��MINE_CELL��9
                    if (field[(cRow * N_COLS) + cCol] > MINE_CELL) {
                    	
                    	//�L�X326
                    	System.out.println("326");
                    	//�d�U��ø�O��
                        doRepaint = true;

                        //�O�_�p�󵥩�19(��ܨS���Q���Ѥl)
                        if (field[(cRow * N_COLS) + cCol] <= COVERED_MINE_CELL) {
                        	//�L�X330
                        	System.out.println("330");
                        	//�X�l�Ƥ����s
                            if (minesLeft > 0) {
                            	//�[�X�l�W�h(+10)
                                field[(cRow * N_COLS) + cCol] += MARK_FOR_CELL; // 
                                //�X�l-1
                                minesLeft--;
                                //������ܴѤl�Ѿl��
                                String msg = Integer.toString(minesLeft);
                                System.out.println("bbb");
                                statusbar.setText(msg);
                            } 
                            //�X�l�Ƭ�0
                            else {
                                statusbar.setText("No marks left");				
                            }
                        }
                        //�j��19(����Q���X)�A�]���ޱ��X�l
                        else {
                        	System.out.println("341");
                            field[(cRow * N_COLS) + cCol] -= MARK_FOR_CELL;
                            minesLeft++;
                            String msg = Integer.toString(minesLeft);
                            statusbar.setText(msg);
                        }
                    }

                }
                //�p�G���O���ƹ��k��
                else {
                	System.out.println("350:"+field[(cRow * N_COLS) + cCol]);
                	
                	//�j��19�A����A�I�b�X�l�W�A�S��
                    if (field[(cRow * N_COLS) + cCol] > COVERED_MINE_CELL) {
                    	System.out.println("352:"+field[(cRow * N_COLS) + cCol]);
                        return;
                    }
                    
                    //�j��9�B�p��29
                    if ((field[(cRow * N_COLS) + cCol] > MINE_CELL)
                            && (field[(cRow * N_COLS) + cCol] < MARKED_MINE_CELL)) {
                    	System.out.println("358:"+field[(cRow * N_COLS) + cCol]);
                    	//�����л\��10
                        field[(cRow * N_COLS) + cCol] -= COVER_FOR_CELL;	// remove cover
                        //�d�U��ø�аO
                        doRepaint = true;
                        System.out.println("361:"+field[(cRow * N_COLS) + cCol]);
                        
                        //�p�G����9�A���a�p
                        if (field[(cRow * N_COLS) + cCol] == MINE_CELL) {	// mine detected
                        	//�d�U�C�����Ѫ��Ҿ�
                            inGame = false;
                        }
                        
                        //�p�G����0�A�h�I�sfind_empty_cells()�A���������O0���ϰ�½�}
                        if (field[(cRow * N_COLS) + cCol] == EMPTY_CELL) {	// space detected
                        	System.out.println("367:"+field[(cRow * N_COLS) + cCol]);
                            find_empty_cells((cRow * N_COLS) + cCol);
                        }
                    }
                }

                //�O�_��ø
                if (doRepaint) {
                    repaint();
                }
            }
        }
    }
}
