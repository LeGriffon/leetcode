package app;

public class Solution extends VersionControl{
    public Solution(int n, int v) {
		super(n, v);
		//TODO Auto-generated constructor stub
	}

	public int firstBadVersion(int n) {
        
        int left = 1, right = n;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}