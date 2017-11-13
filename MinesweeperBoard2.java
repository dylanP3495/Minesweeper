
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Dylan
 * @version 11.3.17
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    int bombs;

    public MinesweeperBoard2(int row, int column, int bomb){
        //Put the constructor here.
        this.rows = row;
        this.columns = column;
        this.bombs = bomb;
        board = new Cell[rows* columns];

        //These pieces are for the GUI. Ignore them.
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        addNums();
    }

    public MinesweeperBoard2(){
        this (10,10,10);
    }

    public void addBombs(int bombs)
    { // throws Exception{
        for (int i = 1; i <= bombs; i++) {
            int index = (int) (Math.random() *( rows * columns));
            board[index].setValue(-1);
        }
    }

    public void addNums(){
        int x = 0;
        for (int i = 0; i <=100; i++) {
            for (int j = 1; j <= 100; j++){
                {
                    
                }
            }
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */

    public void printBoard(){
        int x = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.println (board[x].getValue() + " ");
                x++;
            }
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i]= new Cell();
            panel.add(board[i].getButton());
        }
        return panel;
    }

}