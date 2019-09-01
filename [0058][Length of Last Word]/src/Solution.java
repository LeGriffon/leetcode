
public class Solution {
	/*
	 * * The java lang.string.trim() is a built-in function that eliminates leading
	 * and trailing spaces. The Unicode value of space character is ‘\u0020’. The
	 * trim() method in java checks this Unicode value before and after the string,
	 * if it exists then removes the spaces and returns the omitted string. The
	 * string split() method breaks a given string around matches of the given
	 * regular expression. lastIndexOf() : This method returns the index of the last
	 * occurrence of the character in the character sequence.
	 */
	public int lengthOfLastWord(String s) {
		s = s.trim();

		int LastWordLength = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				LastWordLength++;
			} else {
				break;
			}
		}
		return LastWordLength;
	}
}
