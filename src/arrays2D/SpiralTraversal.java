package arrays2D;

public class SpiralTraversal {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		MatrixMultiplication.matrixDisplay(arr);
		System.out.println();
//		spiralViewTopDownApproach(arr);
		spiralViewLeftRightApproach(arr);
	}

	public static void spiralViewLeftRightApproach(int[][] a) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = a.length - 1;
		int maxCol = a[0].length - 1;

		int count = 0;
		int totalElement = a.length * a[0].length;

		while (count < totalElement) {

			// Top Wall - > (count < totalElement) = to stop duplicate printing for non square matrix 
			for (int r = minRow, c = minCol; c <= maxCol && count < totalElement; c++) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			minRow++;

			// Right wall
			for (int r = minRow, c = maxCol; r<= maxRow && count < totalElement; r++) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			maxCol--;

			// bottom wall
			for (int r = maxRow, c = maxCol; c >= minCol && count < totalElement; c--) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			maxRow--;

			// left wall
			for (int r = maxRow, c = minCol; r >= minRow && count < totalElement; r--) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			minCol++;

		}
	}

	public static void spiralViewTopDownApproach(int[][] a) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = a.length - 1;
		int maxCol = a[0].length - 1;

		int count = 0;
		int totalElement = a.length * a[0].length;

		while (count < totalElement) {

			// left wall
			for (int r = minRow, c = minCol; r <= maxRow && count < totalElement; r++) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			minCol++;

			// bottom wall
			for (int r = maxRow, c = minCol; c <= maxCol && count < totalElement; c++) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			maxRow--;

			// Right wall
			for (int r = maxRow, c = maxCol; r >= minRow && count < totalElement; r--) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			maxCol--;

			// Top Wall
			for (int r = minRow, c = maxCol; c >= minCol && count < totalElement; c--) {
				System.out.print(a[r][c] + " ");
				count++;
			}
			minRow++;
		}
	}

}
