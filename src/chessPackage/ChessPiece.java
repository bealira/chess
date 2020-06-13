/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessPackage;

import boardGame.Board;
import boardGame.Piece;

/**
 *
 * @author Bea
 */
public class ChessPiece extends Piece{
    
    private Color color;
    
    public ChessPiece(Board board, Color color){
        super(board);
        this.color=color;
    }
    
    public Color getColor(){
        return color;
    }
    
}
