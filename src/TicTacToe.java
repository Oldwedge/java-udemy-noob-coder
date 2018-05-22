
public class TicTacToe {

	public static void main(String[] args) {
		
		String[] indexArray = new String[] {"00","01","02","10","11","12"};
		
		char[][] board = new char[3][3];
		
		char player = 'X';
		
		initializeArray(board);
		
		printBoard(board);
		
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
	
	public static char changePlayer(char player) {
		
		if(player == 'X') {
			
			player = 'O';
			
		}else {
			
			player = 'X';
		}
		
		return player;
				
	}
	
	public static void updateBoard(char[][] board, int move) {
	
		
	}
	

}
