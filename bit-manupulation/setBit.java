package bitmanupulation;

public class setBit {
    public static void main(String[] args) {
        int num=5;//0101
        int pos=1;
        int bitMask=1<<pos;
        int newNumber=bitMask | num;
        System.out.println(newNumber);
    }
    
}
