package application;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Origem: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Destino: ");
            ChessPosition target = UI.readChessPosition(sc);
        
           ChessPiece capturedPiece = chessMatch.perfomeChessMove(source, target);
        }
    }
}
