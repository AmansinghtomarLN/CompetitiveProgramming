package arrays2D;

public class Rotate90Degree {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		MatrixMultiplication.matrixDisplay(arr);
	System.out.println();
		rotate(arr);
	}

	
	
	public static void rotate(int [][] a) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = a.length-1;
		int maxCol = a[0].length-1;
		
		
		for(int i = maxRow ; i>=minRow;i--) { // for column
			for(int j = minCol; j<=maxCol; j++ ) {// for row
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
