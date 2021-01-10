import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        boolean speedUp = true;
        for (int c: Capital) if (W < c) speedUp = false;
        if (speedUp) {
          PriorityQueue<Integer> heap = new PriorityQueue<>();
          for (int p: Profits) {
            heap.add(p);
            if (heap.size() > k) heap.poll();
          }
          for (int h: heap) W += h;
          return W;
        }
        
        PriorityQueue<Integer[]> projects = new PriorityQueue<Integer[]>((a, b) ->(a[0] - b[0]));
        for(int i = 0; i < Profits.length; i++) {
            projects.add(new Integer[] {Capital[i], Profits[i]});
        }
        PriorityQueue<Integer> available = new PriorityQueue<>((a, b)->(b - a));
        while(k > 0) {
            while(!projects.isEmpty() && projects.peek()[0] <= W) {
                available.add(projects.remove()[1]);
            }
            if(!available.isEmpty()) {
                W += available.remove();
                k--;
            }
            else {
                break;
            }
        }
        return W;
    }
}