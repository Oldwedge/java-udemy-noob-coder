
public class TicTacToe {

	public static void main(String[] args) {
		
		String[] indexArray = new String[] {"00","01","02","10","11","12","20","21","22"};

		char player = 'X';
					
		char[][] board = new char[3][3];
		
		
		initializeArray(board);
		
		updateBoard(1,board,indexArray);
		
		printBoard(board);
		
		//lookupIndices(move, indexArray);
		
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
	
	public static void updateBoard(int move, char[][] board, String[] indexArray) {
	
		//;
		if(lookupIndices(move, indexArray, board)) {
			
			//board[][] = 'X'	
			
		};
		
		
	}
	
	public static boolean lookupIndices(int move, String[] indexArray, char[][] board) {
				
		String positionIndex = "";
		
		positionIndex = indexArray[move];
		
		int boardX = (int)positionIndex.charAt(0);
		int boardY = (int)positionIndex.charAt(1);
		
		return validateMove(boardX, boardY, board);
						
	}
	
	public static boolean validateMove (int boardXval, int boardYval, char[][] boardom) {
		
		int boardX = boardXval;
		
		int boardY = boardYval;
		
		char[][] board = boardom;
		
		boolean bValid = false;
		
		System.out.println(board);
		
			if(board[boardX][boardY] == 'X' || board[boardX][boardY] == 'O') {
				
				System.out.println("Invalid move, please try again.");
				//get input
				
			}else {
				
				bValid = true;;
				
			}
			
			return bValid;
				
	}
	

}
