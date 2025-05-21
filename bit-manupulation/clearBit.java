package bitmanupulation;

public class clearBit {
    public static void main(String[] args) {
        int num=5;
    int pos=2;
    int bitMask=1<<pos;

    int notBitMask=~(bitMask);
    int newNum=notBitMask & num;
    System.out.println(newNum);
    }

    
    

    
}
