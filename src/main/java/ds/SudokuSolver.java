package ds;

/**
 * Created by sunilp on 3/5/18.
 */
public class SudokuSolver {
	//refer http://codepumpkin.com/sudoku-solver-using-backtracking/
	private int[][] sudoku;
	private static final int UNASSIGNED = 0;

	public SudokuSolver() {
		sudoku = new int[9][9];
	}

	public SudokuSolver(int sudoku[][]) {
		this.sudoku = sudoku;
	}

	//TODO Methods
	private boolean containsInRow(int row,int number) {

		return false;
	}
	//private boolean containsInCol(int col,int number){...}
	//private boolean containsInBox(int row, int col,int number){...}
	//private boolean isAllowed(int row, int col,int number){...}
	//public void displaySudoku(){...}
	//public boolean solveSudoku(){...}

	public static void main(String[] args) {

	}
}
