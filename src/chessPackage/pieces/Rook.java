/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessPackage.pieces;

import boardGame.Board;
import boardGame.Position;
import chessPackage.ChessPiece;
import chessPackage.Color;

/**
 *
 * @author Bea
 */
public class Rook extends ChessPiece{
    
    public Rook(Board board, Color color){
        super(board, color);
    }
 
    @Override
    public String toString(){
        return "R";
    }
 
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat=new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p=new Position(0,0);
        
        //above
        p.setValues(position.getRow()-1, position.getColumn());
        
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setRow(p.getRow()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        
        //left
        p.setValues(position.getRow(), position.getColumn()-1);
        
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        
        //left
        p.setValues(position.getRow(), position.getColumn()+1);
        
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setColumn(p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        
        //above
        p.setValues(position.getRow()+1, position.getColumn());
        
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setRow(p.getRow()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        
        return mat;
    }
    
}
