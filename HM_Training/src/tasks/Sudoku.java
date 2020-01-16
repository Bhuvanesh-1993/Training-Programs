package tasks;

public class Sudoku 
{ 
	public static void main(String args[]) 
	{ 

		int[][] board =  {  {7, 0, 0, 0, 0, 0, 0, 0, 0}, 
							{0, 0, 0, 0, 0, 0, 0, 0, 0}, 
							{6, 8, 2, 0, 0, 3, 0, 0, 4}, 
							{3, 6, 0, 4, 0, 0, 7, 0, 0}, 
							{0, 4, 0, 7, 9, 5, 0, 3, 0}, 
							{5, 0, 8, 0, 0, 2, 0, 4, 1}, 
							{9, 0, 0, 6, 0, 0, 5, 2, 0}, 
							{8, 0, 0, 0, 7, 1, 0, 0, 0}, 
							{0, 0, 0, 0, 0, 0, 6, 0, 7} }; 
		
		int n = board.length; 

		if (solveSudoku(board, n)) //If sudoku is solved, then only print the solution
		{ 
			for (int i = 0; i < n; i++) 
			{ 
				for (int j = 0; j < n; j++) 
				{ 
					System.out.print(board[i][j]); 
					System.out.print(" "); 
				} 
				System.out.println(); 
				
			}
		} 
		else 
		{ 
			System.out.println("No solution"); 
		} 
	}
	
	public static boolean solveSudoku(int[][] board, int n) 
	{ 
		//initialize the row and column value
		int row = 0; 
		int col = 0; 
		boolean isEmpty = true; 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < n; j++) 
			{ 
				if (board[i][j] == 0) 
				{ 
					row = i; 
					col = j; 
					isEmpty = false; 
					break; 
				} 
			} 
			if (!isEmpty) 
			{ 
				break; 
			} 
		} 
		// no empty space left 
		if (isEmpty) 
		{ 
			return true; 
		} 

		// else for each-row backtrack 
		for (int num = 1; num <= n; num++) 
		{ 
			if (isSafe(board, row, col, num)) 
			{ 
				board[row][col] = num; 
				if (solveSudoku(board, n)) 
				{ 
					// print(board, n); 
					return true; 
				} 
				else
				{ 
					board[row][col] = 0; // replace it 
				} 
			} 
		} 
		return false; 
	} 
	
public static boolean isSafe(int[][] board, 
							int row, int col, 
							int num) 
{ 
	// row has the unique (row-clash) 
	for (int i = 0; i < board.length; i++) 
	{ 
		// if the number we are trying to 
		// place is already present in 
		// that row, return false; 
		if (board[row][i] == num) 
		{ 
			return false; 
		} 
	} 
	
	// column has the unique numbers (column-clash) 
	for (int i = 0; i < board.length; i++) 
	{ 
		// if the number we are trying to 
		// place is already present in 
		// that column, return false; 

		if (board[i][col] == num) 
		{ 
			return false; 
		} 
	} 

	// corresponding square has 
	// unique number (box-clash) 
	int sqrt = (int) Math.sqrt(board.length); 
	int boxRowStart = row - row % sqrt; 
	int boxColStart = col - col % sqrt; 

	for (int i = boxRowStart; i < boxRowStart + sqrt; i++) 
	{ 
		for (int j = boxColStart; j < boxColStart + sqrt; j++) 
		{ 
			if (board[i][j] == num) 
			{ 
				return false; 
			} 
		} 
	} 
	return true; 
} 
 
} 