
public class Solution {
	/*
	 * How we do multiplication? Start from right to left, perform multiplication on
	 * every pair of digits, and add them together. Let's draw the process! From the
	 * following draft, we can immediately conclude: num1[i] * num2[j] will be
	 * placed at indices [i + j, i + j + 1] Each iteration has one sum that is used
	 * to update the latest multiplication.
	 */
	public String multiply(String num1, String num2) {
		int length1 = num1.length();
		int length2 = num2.length();
		int[] pos = new int[length1 + length2];
		for (int i = length1 - 1; i >= 0; i--) {
			for (int j = length2 - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int pos1 = i + j;
				int pos2 = i + j + 1;
				int sum = mul + pos[pos2];

				pos[pos1] += sum / 10;
				pos[pos2] = sum % 10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int n : pos) {
			if (!(sb.length() == 0 && n == 0)) {
				sb.append(n);
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}
}
