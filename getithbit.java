public class getithbit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n,i);
        } else {
            return setIthBit(n,i);
        }
    }
    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main (String[] args) {
        System.out.println(clearIBits(15,2));
    }

}    