/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardGame.Board;
import boardGame.Position;
import chessPackage.ChessMatch;

/**
 *
 * @author Bea
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criar programa
        //System.out.println("Welcome to the chess game!");
        
        /*aula 2, criar position
        Position position=new Position(3, 5);
        System.out.println(position.toString());*/
        
        //aula 3, criar tabuleiro
        //Board board=new Board(8, 8);
        
        ChessMatch chessMatch=new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
    
}
