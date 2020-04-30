
public class Solution {
	/*
	 * You start with "1" as the first line. Each subsequent line (n) is generated
	 * by passing the line before it (n - 1) as an input to a somewhat unusual
	 * function: Loop through the line (n - 1) as a string. For a given character,
	 * count how many consecutive times it repeats, then put that on line n followed
	 * by the number. For example: If you have "1", the next line is "11". If you
	 * have "11", the next line is "21". If you have "111", the next line is "31".
	 * If you have "1111", the next line is "41". Just do that for every set of
	 * repeating characters on the previous line.
	 * 
	 * Here's what it looks like with more than one sequence: If you have "11222",
	 * the next line is "2132" ("11" becomes "21" and "222" becomes "32"). If you
	 * have "112225", the next line is "213215" ("11" becomes "21", "222" becomes
	 * "32", and "5" becomes "15"). In terms of the sequence dictated by the
	 * description, here's the first 15 lines of output (done by hand but I don't
	 * think I made any errors): "1" "11" "21" "1211" "111221" "312211" "13112221"
	 * "1113213211" "31131211131221" "13211311123113112211"
	 * "11131221133112132113212221" "3113112221232112111312211312113211"
	 * "1321132132111213122112311311222113111221131221"
	 * "11131221131211131231121113112221121321132132211331222113112211"
	 * "311311222113111231131112132112311321322112111312211312111322212311322113212221"
	 * 
	 */
	public String countAndSay(int n) {
		if(n == 1) return "1";
		String prev = countAndSay(n - 1);
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i < prev.length()) {
			char curr = prev.charAt(i);
			int j = 0;
			while(i + j < prev.length() && curr == prev.charAt(i + j)) j++;
			sb.append(j);
			sb.append(curr);
			i += j;
		}
		return sb.toString();
	}
}
