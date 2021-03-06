
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
    }

    public MinesweeperBoard2(){
        this (10,10,10);
    }

    public void addBombs(int bombs)
    { // throws Exception{
        for (int i = 1; i <= bombs; i++) {
            int x = (int) (Math.random() *( rows * columns));

            if(board[x].getValue() == -1 ){
                i--;
            }else{
                board[x].setValue(-1);
            }
        }
    }

    public void addNums(){
        for (int i = 1; i < rows*columns; i++) {
            if (board[i].getValue() == -1 ){//bomb
                //top left
                if ((i >= columns) && (i % columns != 0) ){
                    board[i - columns -1].incrementValue();
                }

                // top right
                if ((i >= columns) && (i % columns != (columns - 1))){
                    board[i - columns + 1].incrementValue();
                }

                // bot left
                if ( (i <= (rows * columns)) && (i % columns != 0) ){
                    board[i - columns - 1].incrementValue();
                }

                // bot right
                if ( (i >= (rows * columns)) && (i % columns != (columns - 1)) ){
                    board[i].incrementValue();
                }

                // left bound
                if (&& (i % columns != 0)){
                    board[i].incrementValue();
                }

                // right bound
                if (){
                    board[i].incrementValue();
                }

                // upper bound
                if (){
                    board[i].incrementValue();
                }

                // lower bound
                if (){
                    board[i].incrementValue();
                }
            }
        }
    }

    /**
     * This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */

    public void printBoard(){
        //needs to be one for loop, not two, apparen.tly
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