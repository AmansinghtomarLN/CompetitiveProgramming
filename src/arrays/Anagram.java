package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Anagram {

	public static void main(String[] args) {

		String wordArr[]
				= { "code", "doce", "ecod", "framer", "frame" };
			int size = wordArr.length;
			printAnagramsTogether(wordArr, size);
		
	}
	

	// class for each word of duplicate array
	static class Word {
		String str; // to store word itself
		int index; // index of the word in the

		Word(String str, int index)
		{
			this.str = str;
			this.index = index;
		}
	}

	// class to represent duplicate array.
	static class DupArray {
		Word[] array; // Array of words
		int size; // Size of array

		// constructor
		public DupArray(String str[], int size)
		{
			this.size = size;
			array = new Word[size];

			int i;
			for (i = 0; i < size; ++i) {
				array[i] = new Word(str[i], i);
			}
		}
	}
	static class compStr implements Comparator<Word> {
		public int compare(Word a, Word b)
		{
			return a.str.compareTo(b.str);
		}
	}

	// Given a list of words in wordArr[],
	static void printAnagramsTogether(String wordArr[],
									int size)
	{
		DupArray dupArray = new DupArray(wordArr, size);

		int i;
		for (i = 0; i < size; ++i) {
			char[] char_arr
				= dupArray.array[i].str.toCharArray();
			Arrays.sort(char_arr);
			dupArray.array[i].str = new String(char_arr);
		}
		Arrays.sort(dupArray.array, new compStr());

		for (i = 0; i < size; ++i)
			System.out.print(
				wordArr[dupArray.array[i].index] + " ");
	}

	
}

