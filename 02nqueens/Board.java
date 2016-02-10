public class Board {
	int[][] board = new int[8][8]; 
	public Board() {
		makeboard();
	}
	public void makeboard(){
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				board[i][j] = '0';
			}
		}
	}
	public void printboard(){
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				System.out.println(board[i][j]);
			}
		}
	}
	public void addqueen(int x, int y) {
		board[y][x] = 5;
		for (int i = 0; i < board.length; i++){
			board [y] = board[y] - 1;
			for (int j = 0; j < board.length; j++){
				board[j] = board[j] - 1;
			}
		}
	}
	public static void main (String[] args){
		Board b1 = new Board();
		b1.printboard();
		b1.addqueen(7,6);
	}
}