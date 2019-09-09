package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import tictactoe.game;

public class gui extends JFrame implements ActionListener {
	
	public game tic;
	public gui() {
		JFrame frame = new JFrame("Tic Tac Toe");
		JButton button0,button1,button2,button3,button4,button5,button6,button7,button8;
		button0 = new JButton(" ");
		button1 = new JButton(" ");
		button2 = new JButton(" ");
		button3 = new JButton(" ");
		button4 = new JButton(" ");
		button5 = new JButton(" ");
		button6 = new JButton(" ");
		button7 = new JButton(" ");
		button8 = new JButton(" ");
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 0;
				playerMove.col = 0;
				tic.makeMove(playerMove, tic.board, false);
				button0.setText("o");
				repaint();
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
				
			}
		});
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 0;
				playerMove.col = 1;
				tic.makeMove(playerMove, tic.board, false);
				button1.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 0;
				playerMove.col = 2;
				tic.makeMove(playerMove, tic.board, false);
				button2.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 1;
				playerMove.col = 0;
				tic.makeMove(playerMove, tic.board, false);
				button3.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
		});
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 1;
				playerMove.col = 2;
				tic.makeMove(playerMove, tic.board, false);
				button5.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
		});
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 2;
				playerMove.col = 0;
				tic.makeMove(playerMove, tic.board, false);
				button6.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
		});
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 2;
				playerMove.col = 1;
				tic.makeMove(playerMove, tic.board, false);
				button7.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
			
		});
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				move playerMove = new move();
				playerMove.row = 2;
				playerMove.col = 2;
				tic.makeMove(playerMove, tic.board, false);
				button8.setText("o");
				move bestMove = tic.findBestMove(tic.board);
				tic.makeMove(bestMove, tic.board, true);
				if(bestMove.row == 0 && bestMove.col == 0) {
					button0.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 1) {
					button1.setText("x");
				}
				if(bestMove.row == 0 && bestMove.col == 2) {
					button2.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 0) {
					button3.setText("x");
				}
				if(bestMove.row == 1 && bestMove.col == 2) {
					button5.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 0) {
					button6.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 1) {
					button7.setText("x");
				}
				if(bestMove.row == 2 && bestMove.col == 2) {
					button8.setText("x");
				}
			}
		});
		frame.add(button0);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.setLayout(new GridLayout(3,3));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.white);
		frame.pack();
		frame.setVisible(true);
		tic = new game();
		move startingMove = new move();
		startingMove.row = 1;
		startingMove.col = 1;
		tic.makeMove(startingMove, tic.board, true);
		button4.setText("x");
		
		//Dialog boxes need work, and need to check if game is over, otherwise works
		if(tic.evaluate(tic.board)==10) {
			JOptionPane.showMessageDialog(null, "X Wins!");
		}
		if(tic.evaluate(tic.board)==-10) {
			JOptionPane.showMessageDialog(null, "O Wins!");
		}
		if(tic.evaluate(tic.board)== 0) {
			JOptionPane.showMessageDialog(null, "Its a draw!");
		}
			
			
			
		
		}
		                                               
	

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception unused) {
			; // Ignore exception to use default.
		}
		new gui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
