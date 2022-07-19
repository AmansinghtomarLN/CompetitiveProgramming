package arrays2D;

public class PrintArray {

	public static void main(String[] args) {

		int[] tempArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int n = 3;
		int m = 4;
		int[][] arr = new int[n][m];

		// 2D Arrays - > Array of Array
		System.out.println(arr.length); // number of rows
		System.out.println(arr[0].length); // number of column

		printRowRepresentation(arr, tempArr);
		columnRowRepresentation(arr, tempArr);
	}

	public static void printRowRepresentation(int[][] a,int[] tA) {
		int temp=0;	
		for(int i=0; i<a.length;i++) { // row index
				for(int j=0; j<a[0].length;j++) { // column index
				a[i][j] = tA[temp];
				temp++;
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
				
			}
		
	}

	public static void columnRowRepresentation(int[][] a,int[] tA) {
		for(int i=1; i<2;i++) { // column index
				for(int j=0; j<a.length;j++) { // row index
				System.out.println(a[j][i]+" ");
				}
				System.out.println();
				
			}
		
	}

}
