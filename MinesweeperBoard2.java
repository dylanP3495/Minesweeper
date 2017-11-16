
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Dylan
 * @version 11.16.17
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

            if(board[index].getValue() == -1 ){
                i--;
            }else{
                board[index].setValue(-1);
            }
        }
    }

    public void addNums(){
        int x = 0;
        for (i = 1; i <=rows*columns; i++) {
            // upper bound
            if (board[index].getValue() ==  ){

            }
            // lower bound
            if (board[index].getValue() ==  ){

            }
            // left bound
            if (board[index].getValue() ==  ){

            }
            // right bound
            if (board[index].getValue() ==  ){

            }
            //top left
            if (board[index].getValue() ==  ){

            }
            // top right
            if (board[index].getValue() ==  ){

            }
            // bot left
            if (board[index].getValue() ==  ){

            }
            // bot right
            if (board[index].getValue() ==  ){

            }
            //fully surounded
            if (board[index].getValue() ==  ){

            }
        }
    }

    /**
     * This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */

    public void printBoard(){
        //needs to be one for loop, not two
        int x = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print (board[x].getValue() + " ");
                x++;
            }
            System.out.println ();
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