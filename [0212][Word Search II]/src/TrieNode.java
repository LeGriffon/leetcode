public class TrieNode {
    private TrieNode[] links;
    private int R = 26;
    private String word;
    
    public TrieNode() {
        this.links = new TrieNode[R];
    }
    
    public boolean containsKey(char ch) {
        return this.links[ch - 'a'] != null;
    }
    
    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }
    
    public void put(char ch, TrieNode node) {
        this.links[ch - 'a'] = node;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public boolean containsWord() {
        return this.word != null;
    }
    
}