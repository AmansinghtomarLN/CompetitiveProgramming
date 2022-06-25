package arrays;

import java.io.*;
import java.util.*;

// https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1/?page=1&category[]=Arrays&sortBy=submissions#

public class DuplicatesInArrayUsingHashMap {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 4, 7, 8, 8, 9 };

		int[] pp = duplicates(a.length, a);
	

	}

	public static int[] duplicates(int n, int arr[]) {

		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i]) + 1);
			else
				hm.put(arr[i], 1);
		}

		int duplicateSize = 0;
		for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
			if (map.getValue() > 1) {
				duplicateSize++;
				ans.add(map.getKey());
			}
		}

		if (ans.size() == 0){
			ans.add(-1);
		}
		Collections.sort(ans);
		int[] duplicateArray = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			duplicateArray[i] = ans.get(i);
		}
		return duplicateArray;
	}

}
