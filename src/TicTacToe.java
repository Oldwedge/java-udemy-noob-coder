
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TicTacToe {
	
	public static void main(String[] args) {
		
		String[] indexArray = new String[] {"00","01","02","10","11","12","20","21","22"};

		char player = 'O';
					
		char[][] board = new char[3][3];
		
		int move = -1;
		//int roundTracker = 0;
		
		
		initializeArray(board);
		
		printBoard(board);
		
		//System.out.println("Go player" + player);
		
		while(checkWinCondition()) {
		
			player = changePlayer(player);		
			updateBoard(board,indexArray,player);
			printBoard(board);
			checkWinCondition();

		}
		
	}
	
	
	public static boolean checkWinCondition() {
		
		int end = 0;
		
		if(end < 10) {
			
			
			
		}else {
			
			return false;
			
		}
		
				
		return true;
		
	}
	
	public static void initializeArray(char[][] board) {
		
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
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				printBoard(board);
				
				System.out.println("\nInvalid move, please try again player " + player);
				//e.printStackTrace();
			}
			
		
		};
		
			
	}
		
}
