package algos;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpecialCells {

	private static class Grid{
		private List<Cell> cells = new ArrayList<Cell>();

		public Grid() {
			this.cells = new ArrayList<SpecialCells.Cell>();
		}

		public void revealCell(int row, int col) {
			for (Cell cell : cells) {
				if (cell.row == row && cell.col == col) {
					if (cell.isVisible) {
						cell.isVisible = false;
					}
					
					if (!cell.isSpecial) {
						cell.countAjacentSpecial(this);
					}
				}
			}
		}
	}

	private static class Cell{
		private boolean isSpecial;
		private boolean isVisible;
		private int row;
		private int col;
		private int adjacents;

		public Cell (int row, int col) {
			this.row = row;
			this.col = col;
		}

		public void countAjacentSpecial(Grid grid) {
			for (Cell cell : grid.cells) {
				if (isUp(cell) || isDown(cell) || isLeft(cell) || isRight(cell)) {
					this.adjacents++;
				}
			}
		}
		
		private boolean isRight(Cell cell) {
			return this.row == cell.row && cell.col +1 == this.row && this.isSpecial;
		}

		private boolean isLeft(Cell cell) {
			return this.row == cell.row && cell.col -1 == this.row && this.isSpecial;
		}

		private boolean isDown(Cell cell) {
			return this.col == cell.col && cell.row +1 == this.row && this.isSpecial;
		}

		private boolean isUp(Cell cell) {
			return this.col == cell.col && cell.row -1 == this.row && this.isSpecial;
		}

		public void setSpecial(boolean value) {
			this.isSpecial = value;
		}

	}

	public static Grid createGrid (int m, int n) {
		Grid grid = new Grid();

		int specialCells = 0;

		while (specialCells < m) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Cell cell = new Cell(i, j);
					grid.cells.add(cell);
					if (specialCells < m && Math.random() > 0.5) {
						cell.setSpecial(true);
						cell.isVisible = false;
						specialCells++;						
					}
				}
			}
		}
		return grid;
	}

	@Test
    public void Test() {
		
		init();
		
        assertEquals(2, 2);
    }

	private static void init() {
		int size = 5;
		int row = 1;
		int col = 2;
		Grid grid = createGrid(12, size);
		grid.revealCell(1,2);
		for (Cell cell : grid.cells) {
			// System.out.print("["+ cell.isSpecial +"]");
			System.out.print("["+ (cell.row==row&&cell.col==col?"RV":"--")+(cell.isSpecial?"SP":"--") + cell.adjacents +"]");
			if (cell.col == size-1) {
				System.out.println("");
			}
		}
	}
}
