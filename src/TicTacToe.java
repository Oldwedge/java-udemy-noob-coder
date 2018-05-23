
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TicTacToe {
	
	public static void main(String[] args) {
		
		String[] indexArray = new String[] {"00","01","02","10","11","12","20","21","22"};

		char player = 'O';
					
		char[][] board = new char[3][3];
				
		//boolean gotWinner = false;
		
		int moveTracker = 1;
		
		int result = 0;
		
		result = initializeArray(board,result);
		
		printBoard(board);
		
		//System.out.println("Go player" + player);
		
		while(result != 1) {
		
			player = changePlayer(player);		
			updateBoard(board,indexArray,player);
			printBoard(board);
			//gotWinner = checkWinCondition(moveTracker);
			result = checkWinCondition(moveTracker,board,player);
			
			moveTracker++;
			
			if(result == 2) {
				
				System.out.println("It's a draw! Initializing a new board and this time player " + player + " will begin.");
				
				result = initializeArray(board,result);
				
				moveTracker = 1;
				
			}
			
			

		}
		
		System.out.println("\nPlayer " + player + " is victorious!");
		
	}
	
	
	public static int checkWinCondition(int moveTracker, char[][] board, char player) {
		
		
		//loop through board array to find out if we have a winner
		
		//8 x 2 possible scenarios
		
		/* 
		 * ZZZ 123 123 Z23 1Z3 12Z Z23 12Z
		 * 456 ZZZ 456 Z56 4Z6 45Z 4Z6 4Z6
		 * 789 789 ZZZ Z89 7Z9 78Z 78Z Z89
		 
		 Scenario 1:
		 
		 [0][1] [0][2] [0][3]
		 
		 [1][1] [1][2] [1][3]
		 
		 [2][1] [2][2] [2][3]
		 
		 Scenario 2:
		 
		 [0][0] [1][0] [2][0]
		 
		 [0][1] [1][1] [2][1]
		 
		 [0][2] [1][2] [2][2]
		 
		 Scenario 3:
		 
		 [0][0] [1][1] [2][2]
		 
		 Scenario 4:
		 
		 [0][2] [1][1] [2][0]
		 
		 */
		
		//no reason to check if moveTracker < 6
		
		//returns 0 if no winner, 1 if there is a winner, 2 if no more moves are possible
		
		boolean gotWinner = false;
		
		if(moveTracker >= 5) {
			
			// loop scenario 1:
			
//			[0][1] [0][2] [0][3]
//					 
//			[1][1] [1][2] [1][3]
//					 
//			[2][1] [2][2] [2][3]
			
			int count = 0;
			
			for(int i = 0;i < 3;i++) {
				
				count = 0;
				
				for(int j = 0;j < 3;j++) {
					
										
					if(board[i][j] == player) {
						
						count++;
												
					}else {
						
						break;
						
					}
					
					if (count == 3) {
						
						gotWinner = true;
						return 1;
						
					}
					
				}
				
			}
			
			// loop scenario 2:
			
//			[0][0] [1][0] [2][0]
//					 
//			[0][1] [1][1] [2][1]
//					 
//			[0][2] [1][2] [2][2]
			
			for(int i = 0;i < 3;i++) {
				
				count = 0;
				
				for(int j = 0;j < 3;j++) {
					
										
					if(board[j][i] == player) {
						
						count++;
												
					}else {
						
						break;
						
					}
					
					if (count == 3) {
						
						gotWinner = true;
						return 1;
						
					}
					
				}
				
			}
			
			// loop scenario 3:
			
//			[0][0] [1][1] [2][2]
			
			count = 0;
			
			for(int i = 0;i < 3;i++) {
				
														
				if(board[i][i] == player) {
					
					count++;
											
				}else {
					
					count = 0;
					break;
					
				}
				
				if (count == 3) {
					
					gotWinner = true;
					return 1;
					
				}
				
			}
			
			
			// loop scenario 4:
			
//			[0][2] [1][1] [2][0]
			
			for(int i = 0;i < 3;i++) {
				
				count = 0;
				
				for(int j = 2;j < 3;j--) {
					
										
					if(board[i][j] == player) {
						
						count++;
												
					}else {
						
						break;
						
					}
					
					if (count == 3) {
						
						gotWinner = true;
						return 1;
						
					}
					
				}
				
			}
			
		}
				
				
		if(moveTracker >= 9 && !gotWinner) {
			

			return 2;
				
		}
		
		return 0;
		
	}
	
	public static int initializeArray(char[][] board, int result) {
		
		for(int i = 0;i < 3;i++) {
			
			for(int j = 0;j < 3;j++) {
				
				switch (i) {
					case 0:board[i][j] = (char)(49+j) ;
						break;
					case 1:board[i][j] = (char)(52+j) ;
						break;
					case 2:board[i][j] = (char)(55+j) ;
						break;
					default:
						break;
				}
				
			}
		}
		
		return 0;
		
	}
	
	public static void printBoard(char[][] board) {
		
		for(int i = 0;i < 3;i++) {
			
			for(int j = 0;j < 3;j++) {
				
				System.out.print(board[i][j]);
				System.out.print(" ");
				
				if(j == 2) {
					
					System.out.println();
					
				}
				
			}
			
		}
		
		
		
	}
	
	public static char changePlayer(char thePlayer) {
		
		char player = thePlayer;
		
		if(player == 'X') {
			
			player = 'O';
			
			
			
		}else {
			
			player = 'X';
		}
		
		return player;
				
	}
	
	public static void updateBoard(char[][] board, String[] indexArray, char player) {
	
		
	
		String positionIndex = "";
	
		boolean inputValid = false;
		//Get user input
		
		System.out.println("\nMake your move player " + player);
		
		while(!inputValid) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			/*try {
				String s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			int i;
			try {
				
				i = Integer.parseInt(br.readLine());
				
				//validate input
				positionIndex = indexArray[i - 1];
				
				if(board[(int)positionIndex.charAt(0) - 48][(int)positionIndex.charAt(1) - 48] == 'X' || board[(int)positionIndex.charAt(0) - 48][(int)positionIndex.charAt(1) - 48] == 'O') {
					
					printBoard(board);
					
					System.out.println("\nInvalid move, please try again player " + player);
					
					inputValid = false;
					
				}else {
					//update board
					board[(int)positionIndex.charAt(0) - 48][(int)positionIndex.charAt(1) - 48] = player;	
					
					inputValid = true;
					
				}
				
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				printBoard(board);
				
				System.out.println("\nOnly use numbers 1-9, please try again player " + player);
				//e.printStackTrace();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				printBoard(board);
				
				System.out.println("\nMove out of bounds, please try again player " + player);
				//e.printStackTrace();
			}
			
		
		};
		
			
	}
		
}
