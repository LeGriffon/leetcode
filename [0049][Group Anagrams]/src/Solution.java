import java.util.*;

public class Solution {
	/*
	 * Using HashMap to categorize all the Anagrams: iterating each String, converts
	 * them to character arrays and sorts each array, then put the sorted array back
	 * as String in the HashMap as the keys and original Strings as the values.
	 */
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0 || strs == null)
			return new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String keyString = String.valueOf(c);
			if (!map.containsKey(keyString)) {
				map.put(keyString, new ArrayList<>());
			}
			map.get(keyString).add(s);
		}
		return new ArrayList<>(map.values());
	}
}
