package arrays2D;

public class WaveTraversal {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		MatrixMultiplication.matrixDisplay(arr);
		System.out.println();
		spiralView(arr);
	}

	public static void spiralView(int[][] a) {
		int minRow = 0;
		int maxRow = a.length - 1;
		int minCol = 0;
		int maxCol = a[0].length - 1;

		int count = 0;
		int totalElement = a.length * a[0].length;
		
			for(int c = minCol; c <= maxCol; c++) {
				if (c % 2 == 0) { // even column index
					for (int r = minRow; r <= maxRow; r++) {
						System.out.println(a[r][c] + " ");
					}
				}else { // odd column index
					for (int r = maxRow; r >= minRow; r--) {
						System.out.println(a[r][c] + " ");
					}
				}System.out.println();
			}
		}

	}


