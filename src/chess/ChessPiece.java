/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Piece;
import boardgame.Position;

/**
 *
 * @author Israel P. Rabelo
 */
public class ChessPiece extends Piece{
    
    private Color color;

    public ChessPiece(Position position, Color color) {
        super(position);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
 
}
