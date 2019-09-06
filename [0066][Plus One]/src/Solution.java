
public class Solution {
	/*
	 * Algorithm checks from the last digit(LSD) see if the ith digit less than 9:
	 * If it less than 9, current digit plus one, return modified int array Else
	 * (current digit equals to 9) set current digit to 0 Last, for the all 9s case,
	 * create a new int array with original length plus one, and set the head digit
	 * to 1 to construct 1 000000...
	 */
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		for (int i = length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newDigits = new int[length + 1];
		newDigits[0] = 1;
		return newDigits;
	}
}
