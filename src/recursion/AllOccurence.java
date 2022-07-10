package recursion;

public class AllOccurence {

	public static int temp = 0;
	public static int count = 0;

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 4, 5, 3, 6, 8, 2, 8,2 };
		int data = 2;
		int[] allOccu = allOccurence(arr, 0, data, 0);

		for (int i : allOccu) {
			System.out.print(i+" ");
		}
	}

	public static int[] allOccurence(int[] a, int index, int data, int fsr) {

		if (index == a.length) {
			return new int[fsr];
		}

		if (a[index] == data) {
			int[] occu = allOccurence(a, index + 1, data, fsr + 1);
			occu[fsr]=index;
			return occu;
		} else {
			int[] occu = allOccurence(a, index + 1, data, fsr);
			return occu;
		}

	}
}
