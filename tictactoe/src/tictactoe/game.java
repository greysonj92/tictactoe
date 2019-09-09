package tictactoe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import tictactoe.move;

public class game {
	
	public char[][] board;
	public game() {
		 board = new char[3][3];
		 for(int row = 0; row < 3; row++) {
			 for(int col = 0; col < 3; col++) {
				 board[row][col]=' ';
			 }
		 }
	}

	
	
	private  final long serialVersionUID = 5916872554131039979L;

	public  move findBestMove(char [][] b) {
		int bestVal = -1000;
		move bestMove = new move();
		bestMove.row = -1;
		bestMove.col = -1;
		
		//go over every cell in the game board
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				//check if the cell is empty
				if (b[row][col]==' ') {
					//make the move for computer player
					b[row][col] = 'x';
					
					//evaluate value for this move
					int moveVal = miniMax(b, 0, false);
					
					//undo the move
					b[row][col]= ' ';
					
					//check to see if the current move is better than the best value, then update best
					if(moveVal > bestVal) {
						bestMove.row = row;
						bestMove.col = col;
						bestVal = moveVal;
					}
				}
				
			}
		}
		
		//System.out.printf("The value of the best move is: %d\n\n", bestVal);
		return bestMove;
	}
	
	public  int miniMax(char[][] b, int depth, Boolean isMaximizingPlayer) {
		
		int score = evaluate(b);
		//if the game has been won return the evaluated score
		if(score == 10 || score == -10) {
			return score;
		}
		
		//if there are no moves left and no winner then return 0
		if(!isMovesLeft(b)) {
			return 0;
		}
		
		
		//if its the maximizing player's turn(player playing x)
		if(isMaximizingPlayer) {
			int bestVal = -1000;
			//go over every cell in the game board
			for(int row = 0; row < 3; row++) {
				for(int col = 0; col < 3; col++) {
					//check to see if the cell is empty
					if(b[row][col]==' ') {
						//make the move
						b[row][col]= 'x';
						//recursively call miniMax and pick the maximum value
						bestVal =Math.max(bestVal, miniMax(b, depth+1, !isMaximizingPlayer));
						//then undo the move
						b[row][col] = ' ';
					}
					
							
				}
				
			}
			return bestVal;
		}
		
		
		
		
		//if its the minimizing player's turn(player playing o)
		else {
			int bestVal = 1000;
			//go over every cell
			for(int row = 0; row < 3; row++) {
				for(int col = 0; col <3; col++) {
					//check if the cell is empty
					if(b[row][col]==' ') {
						//make the move
						b[row][col] = 'o';
						//call miniMax recursively and choose the minimum value
						bestVal = Math.min(bestVal, miniMax(b, depth+1, !isMaximizingPlayer));
						//undo the move
						b[row][col]=' ';
					}
				
				}
			}
			return bestVal;
		}
	}
	
	
	//checks to see if there are available moves left.
	public Boolean isMovesLeft(char[][] b) {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++)
				if(b[row][col] == ' ')
					return true;
		}
		return false;
		
	}
	

	
	//assigns a value to the board state. +10 is x winning, -10 is o winning, 0 is game still continues
	public int evaluate(char[][] board) {
		
		//checks for victory horizontally
		for(int row = 0; row <3; row++) {
			if(board[row][0]==board[row][1] && board[row][1] == board[row][2]) {
				if(board[row][0]=='x')
					return 10;
				else if(board[row][0] == 'o')
					return -10;
			}
		}
		
		//checks for victory vertically
		for(int col = 0; col < 3; col++) {
			if(board[0][col]==board[1][col] && board[1][col]==board[2][col]) {
				if(board[0][col] =='x') {
					return 10;
				}
				else if(board[0][col]=='o')
					return -10;
			}
		}
		
		//checks for diagonal victory
	    if (board[0][0]==board[1][1] && board[1][1]==board[2][2]) 
	    { 
	        if (board[0][0]=='x') 
	            return +10; 
	        else if (board[0][0]=='o') 
	            return -10; 
	    } 
	    if (board[0][2]==board[1][1] && board[1][1]==board[2][0]) 
	    { 
	        if (board[0][2]=='x') 
	            return +10; 
	        else if (board[0][2]=='o') 
	            return -10; 
	    } 
	
		//if draw return 0
		return 0;
	}
	
	//prints the current game board
	public  void printBoard(char[][] b) {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(b[row][col]);
				
			}
			System.out.print('\n');
			
		}
	}
	
	
	
	public  void main(String[] args) {
	
		char[][] board = {{' ', ' ', ' '}, {' ',' ',' '}, {' ', ' ', ' '}};
		
		//while the game is still valid
		int moveCount = 0;
		while(evaluate(board) != 10 && evaluate(board) != -10) {
			
			
			move playerMove = new move();
			
			//let computer play x first, starting in the center
			if(moveCount == 0) {
				move startingMove = new move();
				startingMove.row = 1;
				startingMove.col = 1;
				makeMove(startingMove, board, true);
			}
			else {
				move bestMove = findBestMove(board);
				makeMove(bestMove, board, true);
			}
			
			//now check if the game is over
			printBoard(board);
			if(evaluate(board) == 10) {
				
				System.out.println("X Wins!\n");
				return;
			}
			if(evaluate(board)== -10) {
				
				System.out.println("O Wins!\n");
				return;
			
			}
			if(!isMovesLeft(board)) {
				
				System.out.println("A Draw!\n");
				return;
			}
			
			//now the user makes their move
			System.out.println("Where would you like to move next?\n");
			
			//takes input for the next move to be made
			
			Scanner in = new Scanner(System.in);
			int row, col;
			row = in.nextInt();
			col = in.nextInt();
			
			
			playerMove.row = row;
			playerMove.col = col;
			makeMove(playerMove, board, false);
			
			//check if game is over after the user makes their move
			if(evaluate(board) == 10) {
				printBoard(board);
				System.out.println("X Wins!\n");
			}
			if(evaluate(board)== -10) {
				printBoard(board);
				System.out.println("O Wins!\n");
			
			}
			if(!isMovesLeft(board)) {
				printBoard(board);
				System.out.println("A Draw!\n");
			}
			moveCount++;
		}
		                                               
		
	
		
	}
	//writes the move to the array
	public  void makeMove(move playerMove, char[][] b, Boolean isMaximizingPlayer) {
		int row, col;
		row = playerMove.row;
		col = playerMove.col;
		if(b[row][col]== ' ') {
			//makes move based on which player's turn it is
			if(isMaximizingPlayer)
				b[row][col]='x';
			else {
				b[row][col] = 'o';
			}
		}
		
		}

	
		
	}


