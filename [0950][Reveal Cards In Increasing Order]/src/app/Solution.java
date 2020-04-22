package app;

import java.util.*;

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> index = new LinkedList<>();
        int length = deck.length;
        for(int i = 0; i < length; i++) {
            index.offer(i);
        }
        Arrays.sort(deck);
        int[] result = new int[length];
        for(int card : deck) {
            result[index.poll()] = card;
            if(!index.isEmpty()) {
                index.offer(index.poll());
            }
        }
        return result;
    }
}