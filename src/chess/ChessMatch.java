/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Board;

/**
 *
 * @author Israel P. Rabelo
 */
public class ChessMatch {
    
    private Board board;
    
    public ChessMatch(){
        board = new Board(8, 8);
    }
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColuns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; i<board.getColuns(); j++){
                mat[i][j] = (ChessPiece) board.pieces(i, j);
            }
        }
        return mat;
    }
}
