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
public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Position position) {
        this.position = position;
        position = null;
    }

    public Board getBoard() {
        return board;
    }

    
}
