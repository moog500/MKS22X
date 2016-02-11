
public class QueenBoard {
	    private int[][]board;
    
    public QueenBoard(int size){
	board = new int[size][size];
    }

    /**
     *precondition: board is filled with 0's only.
     *postcondition: 
     *-return false, and board is still filled
     *with 0's for a board that cannot be solved.
     *-return true, and board is filled with the 
     *final configuration of the board after adding 
     *all n queens.
     */

    public boolean solve()
    {
	return false;
    }
    public void solveH(int col){
    	for (int i = 0; i < board.length; i++){
    		if (i == 0 && col == 0){
    			if (board[0][1] = 0 && )
    		}
    	}

  /*  	try {
    	for (int i = 0; i < board[row].length; i++){
    		if (board[row][i] == 0 && board[row + 1][i] != 1 && board[row][i + 1] != 1 && board[row + 1][i + 1] != 1 && board[row+ 1][i-1] != 1){
    			board[row][i] = 1;
    		}
    		else{
    			solveW(row + 1);
    		}
    	}}
    	catch (IndexOutOfBoundsException e) {
    System.err.println("Caught IOException: " + e.getMessage());
}

    }
*/
    

    public void printSolution(){
	/**Print the board like toString, except
	   all negative numbers, and 0's are replaced with '_'
	   and all 1's are replaced with 'Q'
	 */
    }









    public boolean addQueen(int row, int col){
	if(board[row][col] != 0){
	    return false;
	}
	board[row][col] = 1;
	col++;
	int offset = 1;
	while(col < board[row].length){
	    board[row][col]--;
	    if(row - offset >= 0){
		board[row-offset][col]--;
	    }
	    if(row + offset < board.length){
		board[row+offset][col]--;
	    }
	    col++;
	    offset++;
	}
	return true;
    }

    public boolean removeQueen(int row, int col){
	if(board[row][col] != 1){
	    return false;
	}
	board[row][col] = 0;
	col++;
	int offset = 1;
	while(col < board[row].length){
	    board[row][col]++;
	    if(row - offset >= 0){
		board[row-offset][col]++;
	    }
	    if(row + offset < board.length){
		board[row+offset][col]++;
	    }
	    col++;
	    offset++;
	}
	return true;
    }

    public String  toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c]+"\t";
	    }
	    ans+="\n";
	}
	return ans;
    }




    
    public static void main(String[]args){
	QueenBoard b = new QueenBoard(5);
	b.solveW(0);
    System.out.println(b.toString());
}
    

}