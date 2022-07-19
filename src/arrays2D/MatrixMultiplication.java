package arrays2D;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[] tempArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] tempArr1 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };

		// first Matrix
		int n = 3, m = 4;
		int[][] arr = new int[n][m];
		System.out.print("Row is " + arr.length + " " + "Column is " + arr[0].length);
		System.out.println();
		// second Matrix
		int c = 4, d = 3;
		int[][] arr1 = new int[c][d];
		System.out.print("Row is " + arr1.length + " " + "Column is " + arr1[0].length);
		System.out.println();
		System.out.println();
		// 2D Arrays - > Array of Array

		int[][] firstMatrix = matrixRepresentation(arr, tempArr);
		System.out.println();
		int[][] secondMatrix = matrixRepresentation(arr1, tempArr1);
		System.out.println();
		matrixMultiplication(firstMatrix, secondMatrix);
	}
	
	// incomplete

	public static void matrixMultiplication(int[][] first, int[][] second) {

		if (first[0].length == second.length) {
			int sum = 0;
			int[][] resultMatrix = new int[first.length][second[0].length];
			System.out.println("Resulted Multiplied Matrix "+first.length  +" X "+ second[0].length);
			
			for (int r = 0; r < resultMatrix.length; r++) { // iterating over row
				for (int m1c = 0; m1c < resultMatrix[0].length; m1c++) { // iterating over column of first matrix
					for (int m2c = 0; m2c < second.length; m2c++) {

						System.out.println("first["+r+"]"+"["+m2c+"]"+ " * "+"second["+m2c+"]"+"["+r+"]" );

						resultMatrix[r][m1c] += first[r][m2c] * second[m2c][m1c];
						
					}
				}
			}
			matrixDisplay(resultMatrix);
		} else {
			System.out.println("Invalid Output : can not multiply");
		}

	}

	public static void matrixDisplay(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			;
		}

	}

	public static int[][] matrixRepresentation(int[][] a, int[] tA) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) { // row index
			for (int j = 0; j < a[0].length; j++) { // column index
				a[i][j] = tA[temp];
				temp++;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
		return a;
	}

}
