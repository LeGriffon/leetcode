package app;

import Solution.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Concstuct ListNode values
        int[][] vals = {
            {1,4,5},
            {1,3,4},
            {2,6},
            {3,7,9},
            {3,5,7,9},
            {10,13,15},
            {1,2,3,4,5,6,7},
            {5,6,7,8,9,10}
        };

        //Declare a list to hold values for ListNode from vals
        ListNode[] lists = new ListNode[vals.length];
        for(int i = 0; i < vals.length; i++) {
            lists[i] = new ListNode(0);
        }

        //Insert values form vals to the corresponding ListNode in the list
        for(int i = 0; i < vals.length; i++) {
            ListNode node = lists[i];
            for(int j = 0; j < vals[i].length; j++) {
                node.next = new ListNode(vals[i][j]);
                node = node.next;
                if(j == 0 && lists[i].next != null) {
                    lists[i] = lists[i].next;
                }
            }
        }

        //Use the solution function to merge the k lists
        Solution obj = new Solution();
        ListNode result = obj.mergeKLists(lists);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}