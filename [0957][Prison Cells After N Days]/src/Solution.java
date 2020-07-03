import java.util.*;

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Map<Integer, Integer> seen = new HashMap<>();
        boolean isFastForward = false;
        
        while(N > 0) {
            if(!isFastForward) {
                int stateBitmap = this.cellsToBitmap(cells);
                if(seen.containsKey(stateBitmap)) {
                    N %= (seen.get(stateBitmap) - N);
                    isFastForward = true;
                }
                else {
                    seen.put(stateBitmap, N);
                }
            }
            if(N > 0) {
                N--;
                cells = this.nextDay(cells);
            }
        }
        return cells;
    }
    
    private int[] nextDay(int[] cells) {
        int[] newCells = new int[cells.length];
        newCells[0] = 0;
        for(int i = 1; i < cells.length - 1; i++) {
            newCells[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        }
        newCells[cells.length - 1] = 0;
        return newCells;
    }
    
    private int cellsToBitmap(int[] cells) {
        int stateBitmap = 0x0;
        for(int cell : cells) {
            stateBitmap <<= 1;
            stateBitmap = (stateBitmap | cell);
        }
        return stateBitmap;
    }
}