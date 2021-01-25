
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    
    int buffPtr = 0;
    int buffCount = 0;
    char[] buf4 = new char[4];
    
    public int read(char[] buf, int n) {
        int ptr = 0;
        while(ptr < n) {
            if(buffPtr == 0) {
               buffCount = read4(buf4);
            }
            while(ptr < n && buffPtr < buffCount) {
                buf[ptr++] = buf4[buffPtr++];
            }
            if(buffPtr == buffCount) buffPtr = 0;
            if(buffCount < 4) break;
        }
        return ptr;
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