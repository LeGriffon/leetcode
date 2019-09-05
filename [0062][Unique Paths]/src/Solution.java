
public class Solution {
	/*
	 * We have to get the total number of permutations of the given path. So,
	 * decrease both m & n by 1 and apply following formula:
	 * 
	 * Total permutations = (m+n)! / (m! * n!)
	 */
	public int uniquePaths(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		}
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		m--;
		n--;

		long res = 1;
		int n_tmp = 1;
		for (int m_tmp = m + 1; m_tmp <= m + n; m_tmp++, n_tmp++) {
			res *= m_tmp;
			res /= n_tmp;
		}
		return (int) res;
	}
}
