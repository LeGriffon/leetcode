public class WordDictionary {
    TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = this.root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(node.links[index] == null) {
                node.links[index] = new TrieNode();
            }
            node = node.links[index];
        }
        node.word = word;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(word.toCharArray(), 0, this.root);
    }
    
    private boolean match(char[] chars, int index, TrieNode node) {
        if(index == chars.length) return node.word != null;
        else if(chars[index] != '.') {
            return node.links[chars[index] - 'a'] != null && match(chars, index + 1, node.links[chars[index] - 'a']);
        }
        else {
            for(int i = 0; i < 26; i++) {
                if(node.links[i] != null && match(chars, index + 1, node.links[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}