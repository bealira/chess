/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardGame;

/**
 *
 * @author Bea
 */
public class Piece {
    
    protected Position position;
    private Board board;
    
    public Piece(Board board){
        this.board=board;
        this.position=null;
    }
    
    protected Board getBoard(){
        return board;
    }
    
}
