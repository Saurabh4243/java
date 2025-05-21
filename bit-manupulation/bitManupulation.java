package bitmanupulation;

public class bitManupulation {
    public static void main(String[] args) {
        int num=5;//0101
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask & num)== 0)
        {
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
    
}
