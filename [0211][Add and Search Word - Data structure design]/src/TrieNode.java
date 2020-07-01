public class TrieNode {
    TrieNode[] links;
    int R = 26;
    String word;
    
    public TrieNode() {
        this.links = new TrieNode[R];
    }
}