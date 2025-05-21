package string;

public class revStrings {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);

        // //reverse string
        // for(int i=sb.length()-1;i>=0;i--){
        //     System.out.print(sb.charAt(i));
        // }
        sb.reverse();
        System.out.println(sb);

    }
    
}
