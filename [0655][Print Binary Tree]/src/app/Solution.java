package app;

import java.util.*;

public class Solution{
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new ArrayList<>();
        List<String> rowTemplate = new ArrayList<>();
        int totalRows = findTotalRows(root);
        int totalCols = (int)Math.pow(2, totalRows) - 1;
        for(int i = 0; i < totalCols; i++) rowTemplate.add("");
        for(int i = 0; i < totalRows; i++) result.add(new ArrayList<>(rowTemplate));
        populateResult(root, result, 0, totalRows, 0, totalCols - 1);
        return result;
    }

    private void populateResult(TreeNode root, List<List<String>> result, int currRow, int totalRows, int left, int right) {
        if(root == null || currRow == totalRows) return;
        int mid = left + (right - left)/2;
        result.get(currRow).set(mid, String.valueOf(root.val));
        populateResult(root.left, result, currRow + 1, totalRows, left, mid - 1);
        populateResult(root.right, result, currRow + 1, totalRows, mid + 1, right);
    }

    private int findTotalRows(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(findTotalRows(root.left), findTotalRows(root.right));
    }
}