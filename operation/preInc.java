package operator;

public class preInc {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        b=a++;
        System.out.println(a);
        System.out.println(b);

        //postIncrement
        int c=10;
        int d=12;
        d=++c;
        System.out.println(c);
        System.out.println(d);
    }
    
}
