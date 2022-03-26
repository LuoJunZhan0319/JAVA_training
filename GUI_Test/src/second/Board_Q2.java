// 詹洛君 M0944018
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

    private final int NUM_IMAGES = 13;				//13張圖示
    private final int CELL_SIZE = 15;				//格子大小

    private final int COVER_FOR_CELL = 10;			//覆蓋的圖片
    private final int MARK_FOR_CELL = 10;			//旗子的圖片
    private final int EMPTY_CELL = 0;				// 空白格子，無數字，無地雷
    private final int MINE_CELL = 9;				//地雷的格子
    private final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;		//地雷的格子+覆蓋的圖片 = 19
    private final int MARKED_MINE_CELL = COVERED_MINE_CELL + MARK_FOR_CELL; //地雷的格子+覆蓋的圖片+旗子的圖片 = 29

    private final int DRAW_MINE = 9;				//畫出地雷
    private final int DRAW_COVER = 10;				//畫出覆蓋的圖片
    private final int DRAW_MARK = 11;				//畫出旗子圖片
    private final int DRAW_WRONG_MARK = 12;			//畫出錯誤圖片

    private final int N_MINES = 40;					//有40個地雷
    private final int N_ROWS = 16;					//有16列
    private final int N_COLS = 16;					//有16行

    private final int BOARD_WIDTH = N_COLS * CELL_SIZE + 1;		//視窗寬
    private final int BOARD_HEIGHT = N_ROWS * CELL_SIZE + 1;	//視窗高

    private int[] field;							//格子的陣列，想成一整列
    private boolean inGame;							//是否玩遊戲
    private int minesLeft;							//剩下的旗子
    private Image[] img;							//圖片陣列

    private int allCells;							//全部的格子
    private final JLabel statusbar;					//標籤物件(用來顯示輸、贏、剩餘棋子數(也可以想成地雷數))

    //建構式
    public Board_Q2(JLabel statusbar) {
    	//執行父類別(JPanel)
    	super();
    	//設定物件參數
        this.statusbar = statusbar;
        //初始化視窗
        initBoard();
    }

    private void initBoard() {
    	
    	//設定視窗大小
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));   // 為什麼不用指定panel??
        
        //建立圖片陣列大小
        img = new Image[NUM_IMAGES];
        
        //放入圖片物件進陣列
        for (int i = 0; i < NUM_IMAGES; i++) {
        	//圖片名稱+位置
            String path = "src/resources/" + i + ".png";
            //獲取圖片物件至陣列中
            img[i] = (new ImageIcon(path)).getImage();
        }
        
        //添加滑鼠的傾聽程式
        addMouseListener(new MinesAdapter());
        //建立新遊戲
        newGame();
    }

    private void newGame() {
    	
    	//宣告格子
        int cell;
        //建立亂數物件
        Random random = new Random();
        //設定是否在玩遊戲
        inGame = true;
        //地雷剩餘數等於40
        minesLeft = N_MINES;
        
        //全部的格子數=橫列相乘
        allCells = N_ROWS * N_COLS;
        //設定全部格子的編號陣列
        field = new int[allCells];
        
        //每個格子都先設定10
        for (int i = 0; i < allCells; i++) {

            field[i] = COVER_FOR_CELL;
        }
        
        //在標籤物件顯示剩餘多少地雷
        statusbar.setText(Integer.toString(minesLeft));

        
        int i = 0;
        //準備把地雷塞完
        while (i < N_MINES) {
        	//隨機選擇在哪裡塞地雷
            int position = (int) (allCells * random.nextDouble());
            
            //判斷位置是否合理且沒有設置過地雷
            if ((position < allCells)
                    && (field[position] != COVERED_MINE_CELL)) {

            	//得到在第幾行(後續要在周圍數字加一)
                int current_col = position % N_COLS;
                //在該位置設下地雷
                field[position] = COVERED_MINE_CELL;		// 剛開始只有covered mine
                //地雷數加一
                i++;

                //以下就是一堆判斷(把地雷旁邊的數字加一)
                if (current_col > 0) {
                    cell = position - 1 - N_COLS;				// 左上
                    if (cell >= 0) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                    cell = position - 1;						// 左
                    if (cell >= 0) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }

                    cell = position + N_COLS - 1;				// 左下
                    if (cell < allCells) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                }

                cell = position - N_COLS;						// 上
                if (cell >= 0) {
                    if (field[cell] != COVERED_MINE_CELL) {
                        field[cell] += 1;
                    }
                }

                cell = position + N_COLS;						// 下
                if (cell < allCells) {
                    if (field[cell] != COVERED_MINE_CELL) {
                        field[cell] += 1;
                    }
                }

                if (current_col < (N_COLS - 1)) {
                    cell = position - N_COLS + 1;					// 右上
                    if (cell >= 0) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                    cell = position + N_COLS + 1;					// 右下
                    if (cell < allCells) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                    cell = position + 1;							// 右
                    if (cell < allCells) {
                        if (field[cell] != COVERED_MINE_CELL) {
                            field[cell] += 1;
                        }
                    }
                }
            }
        }
    }
    
    //尋找空格格子(有一個參數)
    private void find_empty_cells(int j) {

    	//第幾行
        int current_col = j % N_COLS;
        int cell;

        //利用一堆判斷，決定以隨機一個起始點旁邊是否有為0的空格
        if (current_col > 0) {							// 非左邊欄
            cell = j - N_COLS - 1;						// 左上角
            if (cell >= 0) {							
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);			//自我呼叫
                    }
                }
            }

            cell = j - 1;								// 左邊
            if (cell >= 0) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }

            cell = j + N_COLS - 1;						// 左下
            if (cell < allCells) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }
        }

        cell = j - N_COLS;								// 上方
        if (cell >= 0) {
            if (field[cell] > MINE_CELL) {
                field[cell] -= COVER_FOR_CELL;
                if (field[cell] == EMPTY_CELL) {
                    find_empty_cells(cell);
                }
            }
        }

        cell = j + N_COLS;								// 下方
        if (cell < allCells) {
            if (field[cell] > MINE_CELL) {
                field[cell] -= COVER_FOR_CELL;
                if (field[cell] == EMPTY_CELL) {
                    find_empty_cells(cell);
                }
            }
        }

        if (current_col < (N_COLS - 1)) {				// 若非最右欄
            cell = j - N_COLS + 1;						// 右上
            if (cell >= 0) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }

            cell = j + N_COLS + 1;						// 右下
            if (cell < allCells) {
                if (field[cell] > MINE_CELL) {
                    field[cell] -= COVER_FOR_CELL;
                    if (field[cell] == EMPTY_CELL) {
                        find_empty_cells(cell);
                    }
                }
            }

            cell = j + 1;								// 右邊
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

    //畫圖的元素
    @Override
    public void paintComponent(Graphics g) {

    	//沒覆蓋等於零
        int uncover = 0;

        //針對格子做判斷
        for (int i = 0; i < N_ROWS; i++) {

            for (int j = 0; j < N_COLS; j++) {

                int cell = field[(i * N_COLS) + j];
                
                //遊戲進行且是地雷，結束遊戲的記號
                if (inGame && cell == MINE_CELL) {

                    inGame = false;
                }
                
                //有遊戲結束的記號
                if (!inGame) {

                	//等於COVERED_MINE_CELL的地雷全畫出來
                    if (cell == COVERED_MINE_CELL) {
                        cell = DRAW_MINE;
                    //棋子真正蓋住地雷的畫出來
                    } else if (cell == MARKED_MINE_CELL) {
                        cell = DRAW_MARK;
                    //棋子沒有蓋住地雷的畫出錯誤旗子
                    } else if (cell > COVERED_MINE_CELL) {
                        cell = DRAW_WRONG_MARK;
                    //其他未翻的的地雷維持覆蓋
                    } else if (cell > MINE_CELL) {
                        cell = DRAW_COVER;
                    }
                    
                //遊戲還在進行的記號
                } else {
                	//畫出旗子
                    if (cell > COVERED_MINE_CELL) {
                        cell = DRAW_MARK;
                        
                    //畫出覆蓋(遊戲剛建立都只會往個判斷走!!)
                    } else if (cell > MINE_CELL) {
                        cell = DRAW_COVER;
                        uncover++;
                    }
                }
                
                //把每格是啥畫出來
                g.drawImage(img[cell], (j * CELL_SIZE),
                        (i * CELL_SIZE), this);
            }
        }
        
        //判斷勝利條件
        if (uncover == 0 && inGame) {

            inGame = false;
            statusbar.setText("Game won");

        //失敗條件
        } else if (!inGame) {
            statusbar.setText("Game lost");
        }
    }

    //設定滑鼠事件
    private class MinesAdapter extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
        	
        	//決定你點在哪個位置
            int x = e.getX();
            int y = e.getY();

            int cCol = x / CELL_SIZE;
            int cRow = y / CELL_SIZE;

            //是否要重繪的記號
            boolean doRepaint = false;

            //遊戲失敗，產生新遊戲並且重來
            if (!inGame) {

                newGame();
                repaint();
            }

            
            if ((x < N_COLS * CELL_SIZE) && (y < N_ROWS * CELL_SIZE)) {		//確定未超出視窗邊界

                if (e.getButton() == MouseEvent.BUTTON3) {					//MouseEvent.BUTTON3表示滑鼠右鍵, MouseEvent.BUTTON1左鍵

                	//是否大於MINE_CELL的9
                    if (field[(cRow * N_COLS) + cCol] > MINE_CELL) {
                    	
                    	//印出326
                    	System.out.println("326");
                    	//留下重繪記號
                        doRepaint = true;

                        //是否小於等於19(表示沒有被插棋子)
                        if (field[(cRow * N_COLS) + cCol] <= COVERED_MINE_CELL) {
                        	//印出330
                        	System.out.println("330");
                        	//旗子數不為零
                            if (minesLeft > 0) {
                            	//加旗子上去(+10)
                                field[(cRow * N_COLS) + cCol] += MARK_FOR_CELL; // 
                                //旗子-1
                                minesLeft--;
                                //標籤顯示棋子剩餘數
                                String msg = Integer.toString(minesLeft);
                                System.out.println("bbb");
                                statusbar.setText(msg);
                            } 
                            //旗子數為0
                            else {
                                statusbar.setText("No marks left");				
                            }
                        }
                        //大於19(等於被插旗)，因此拔掉旗子
                        else {
                        	System.out.println("341");
                            field[(cRow * N_COLS) + cCol] -= MARK_FOR_CELL;
                            minesLeft++;
                            String msg = Integer.toString(minesLeft);
                            statusbar.setText(msg);
                        }
                    }

                }
                //如果不是按滑鼠右鍵
                else {
                	System.out.println("350:"+field[(cRow * N_COLS) + cCol]);
                	
                	//大於19，等於你點在旗子上，沒用
                    if (field[(cRow * N_COLS) + cCol] > COVERED_MINE_CELL) {
                    	System.out.println("352:"+field[(cRow * N_COLS) + cCol]);
                        return;
                    }
                    
                    //大於9且小於29
                    if ((field[(cRow * N_COLS) + cCol] > MINE_CELL)
                            && (field[(cRow * N_COLS) + cCol] < MARKED_MINE_CELL)) {
                    	System.out.println("358:"+field[(cRow * N_COLS) + cCol]);
                    	//移除覆蓋的10
                        field[(cRow * N_COLS) + cCol] -= COVER_FOR_CELL;	// remove cover
                        //留下重繪標記
                        doRepaint = true;
                        System.out.println("361:"+field[(cRow * N_COLS) + cCol]);
                        
                        //如果等於9，踩到地雷
                        if (field[(cRow * N_COLS) + cCol] == MINE_CELL) {	// mine detected
                        	//留下遊戲失敗的證據
                            inGame = false;
                        }
                        
                        //如果等於0，則呼叫find_empty_cells()，直接把整片是0的區域翻開
                        if (field[(cRow * N_COLS) + cCol] == EMPTY_CELL) {	// space detected
                        	System.out.println("367:"+field[(cRow * N_COLS) + cCol]);
                            find_empty_cells((cRow * N_COLS) + cCol);
                        }
                    }
                }

                //是否重繪
                if (doRepaint) {
                    repaint();
                }
            }
        }
    }
}
