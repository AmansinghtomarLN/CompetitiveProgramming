package arrays;

public class CyclicRotateOfArrayClockWise {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[] { 9, 8, 7, 6, 4, 2, 1, 3 };

		// cyclic rotation / shifting of position clock-wise by n position
		// second argument is number of position clockwise
		int result[] = rotateArrayByclockWiseByUnit(a, 4);
//		int result[] = 	rotateArrayByAnticlockWiseByUnit(a,1);
		display(result);

		// cyclic rotation / shifting by one postion clock-wise using 2 temp variable
		// rotate1(b,b.length);

	}

	// cylic rotation by clockwise shifting of values
	public static int[] rotateArrayByclockWiseByUnit(int[] a, int unitCloseWise) {
		int rotateUnitClockWise = unitCloseWise;
		int[] b = new int[unitCloseWise];

		for (int j = 0; j < unitCloseWise; j++) {
			b[j] = a[a.length - unitCloseWise + j];
		}
		for (int i = a.length - 1; i >= unitCloseWise; i--) {
			a[i] = a[i - unitCloseWise];
		}
		for (int c = 0; c < unitCloseWise; c++) {
			a[c] = b[c];
		}
		return a;
	}
	

	
	

	// rotation by shifting by 1 postion
	public static void rotate1(int a[], int n) {
		int temp = a[0];
		int store = 0;
		for (int i = 0; i < n - 1; i++) {
			store = a[i + 1];
			a[i + 1] = temp;
			temp = store;
		}
		a[0] = temp;

		for (int c : a) {
			System.out.print(c + " ");
		}
	}
	
	public static void display(int[] r) {
		for(int l:r) {
			System.out.print(l+" ");
		}
	}
}
