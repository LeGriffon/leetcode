public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int copiedCharacters = 0;
        int readCharacters = 4;
        char[] buf4 = new char[4];

        while(copiedCharacters < n && readCharacters == 4) {
            readCharacters = read4(buf4);
            
            for(int i = 0; i < readCharacters; i++) {
                if(copiedCharacters == n) return copiedCharacters;
                buf[copiedCharacters] = buf4[i];
                copiedCharacters++;
            }
        }
        return copiedCharacters;
    }
}

/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */
class Reader4 {
    int read4(char[] buf) {
        return 0;
    }
}
