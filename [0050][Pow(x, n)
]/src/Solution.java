
public class Solution {
	/*
	 * Using HashMap to categorize all the Anagrams: iterating each String, converts
	 * them to character arrays and sorts each array, then put the sorted array back
	 * as String in the HashMap as the keys and original Strings as the values.
	 * 
	 * 50. Pow(x, n) Approach: Fast Power Algorithm Recursive
	 * 
	 * Intuition Assuming we have got the result of x ^ n, how can we get x ^ 2∗n?
	 * Obviously we do not need to multiply x for another n times. Using the formula
	 * (x ^ n) ^ 2 = x ^ 2∗n, we can get x ^ 2∗n at the cost of only one
	 * computation. Using this optimization, we can reduce the time complexity of
	 * our algorithm.
	 * 
	 * Algorithm Assume we have got the result of x ^ n/2, and now we want to get
	 * the result of x ^ n. Let A be result of x ^ n/2, we can talk about x ^ n
	 * based on the parity of n respectively. If n is even, we can use the formula
	 * (x ^ n) ^ 2 = x ^ 2∗n to get x ^ n =A∗A. If n is odd, then A * A = x ^ n−1.
	 * Intuitively, We need to multiply another x to the result, so x ^ n = A∗A∗x.
	 * This approach can be easily implemented using recursion. We call this method
	 * "Fast Power", because we only need at most O(log n) computations to get x^n.
	 */
	public double myPow(double x, int n) {
		long N = n;
		if (N < 0) {
			x = 1 / x;
			N = -N;
		}
		return fastPow(x, N);
	}

	private double fastPow(double x, long N) {
		if (N == 0)
			return 1.0;

		double half = fastPow(x, N / 2);
		if (N % 2 == 0) {
			return half * half;
		} else {
			return half * half * x;
		}
	}
}
