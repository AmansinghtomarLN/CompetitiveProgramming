package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithKUniqueCharacter {

	public static void main(String[] args) {

		String str = "aabacbebebe";
		int unique = 3;
		int largest = longestSubStringWithKUniqueCharacter(str, unique);
		System.out.println(largest);
		
		System.out.println();
		int longest = longestSubStringWithoutRepeatingCharacter(str);
		System.out.println(longest);
	}

	public static int longestSubStringWithoutRepeatingCharacter(String s) {
		int i = 0, j = 0;
		int longest = -1;
		Set<Character> set = new HashSet<Character>();

		while (j < s.length()) {

			if(set.contains(s.charAt(j))) {
				longest = longest>set.size()?longest:set.size();
				set.remove(s.charAt(j));
				set.add(s.charAt(j));
				j++;
			}else {
				set.add(s.charAt(j));
			}
			
			
			if(set.size()==0) {
			set.add(s.charAt(j));
			longest = longest>set.size()?longest:set.size();
			j++;
			}
				
		}
		return longest;
	}

	public static int longestSubStringWithKUniqueCharacter(String s, int unique) {
		int i = 0, j = 0, end = 0, longest = 0;

		Set<Character> set = new HashSet<>(); // We can use hashmap also

		while (j < s.length()) {

			set.add(s.charAt(j));

			if (set.size() < unique || set.size() == unique) {
				longest = (j - i + 1) > longest ? j - i + 1 : longest;
				j++;
			} else if (set.size() > unique) {
				end = j - 1;
				longest = (end - i + 1) > longest ? end - i + 1 : longest;

				while (set.size() > unique) {
					if (!(s.substring(i + 1, end + 1).contains(s.charAt(i) + ""))) {
						set.remove(s.charAt(i));
					}
					i++;
				}
				j++;

			}
		}
		System.out.println(s.substring(i, j));
		return longest;
	}
}
