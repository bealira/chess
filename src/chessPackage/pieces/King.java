/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessPackage.pieces;

import boardGame.Board;
import chessPackage.ChessPiece;
import chessPackage.Color;

/**
 *
 * @author Bea
 */
public class King extends ChessPiece{
    
    public King(Board board, Color color){
        super(board, color);
    }
 
    @Override
    public String toString(){
        return "K";
    }
    
}
