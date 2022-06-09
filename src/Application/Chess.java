package Application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Chess {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(read);

			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(read);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
