//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;

	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int rows = grid.length;
		int cols = grid[0].length;
		boolean[][] newTetris = new boolean[rows][cols];
		int newRow = rows - 1;

		for (int i = rows - 1; i >= 0; i--) {
			boolean fullRow = true;
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == false) {
					fullRow = false;
					break;
				}
			}

			if (fullRow == false) {
				System.arraycopy(grid[i], 0, newTetris[newRow], 0, cols);
				newRow--;
			}
		}

		while (newRow >= 0) {
			for (int j = 0; j < cols; j++) {
				newTetris[newRow][j] = false;
			}
			newRow--;
		}

		this.grid = newTetris;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
