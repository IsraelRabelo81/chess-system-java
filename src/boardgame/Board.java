/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Israel P. Rabelo
 */
public class Board {
    
    private int rows;
    private int coluns;
    private Piece[][] pieces;

    public Board(int rows, int coluns) {
        this.rows = rows;
        this.coluns = coluns;
        pieces = new Piece[rows][coluns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColuns() {
        return coluns;
    }

    public void setColuns(int coluns) {
        this.coluns = coluns;
    }
    
    public Piece pieces (int rows, int coluns){
        return pieces [rows][coluns];
    }
    
    public Piece pieces(Position position){
        return pieces [position.getRow()][position.getColunm()];
    }
    
    
}
