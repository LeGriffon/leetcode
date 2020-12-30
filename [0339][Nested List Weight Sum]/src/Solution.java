import java.util.*;
 
class Solution {

    public int depthSum(List<NestedInteger> nestedList) {
        return depthSumHelper(nestedList, 1);
    }
    
    private int depthSumHelper(List<NestedInteger> nestedList, int depth) {
        int result = 0;
        for(NestedInteger nestedInteger : nestedList) {
            if(nestedInteger.isInteger()) {
                result += nestedInteger.getInteger() * depth;
            }
            else {
                result += depthSumHelper(nestedInteger.getList(), depth + 1);
            }
        }
        return result;
    }
}

  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
  interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value);

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    public void add(NestedInteger ni);

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}