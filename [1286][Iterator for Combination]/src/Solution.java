class CombinationIterator {
    private String characters;
    private int charLength;
    private int combinationLength;
    private int[] nums;
    private boolean hasNext;
    
    public CombinationIterator(String characters, int combinationLength) {
        this.characters = characters;
        this.charLength = characters.length();
        this.combinationLength = combinationLength;
        this.hasNext = true;
        this.nums = new int[combinationLength];
        for(int i = 0; i < combinationLength; i++) {
            this.nums[i] = i;
        }
    }
    
    public String next() {
        StringBuilder sb = new StringBuilder();
        for(int num : nums) {
            sb.append(this.characters.charAt(num));
        }
        int j = this.combinationLength - 1;
        while(j >= 0 && nums[j] == this.charLength - this.combinationLength + j) {
            j--;
        }
        if(j >= 0) {
            nums[j]++;
            for(int i = j + 1; i < this.combinationLength; i++) {
                nums[i] = nums[j] + i - j;
            }
        }
        else {
            hasNext = false;
        }
        return sb.toString();
    }
    
    public boolean hasNext() {
        return hasNext;
    }
}