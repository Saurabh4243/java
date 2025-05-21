package string;
import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("saurabh");
        System.out.println(sb);

        // //charAt idx 0;
        // System.out.println(sb.charAt(0));

        //setCharAt idx ;
        // sb.setCharAt(0, 'g');
        // System.out.println(sb);


        //to insert char at specifies idx

        // sb.insert(0, 'p');
        // System.out.println(sb);


        //to delete elements in string
        // sb.delete(0, 1);
        // System.out.println(sb);

        //str=saurabh to make saurabh into saurabhh
        sb.insert(6,'h');
        System.out.println(sb);

        //to append a string at end
        // sb.append('h');
        // System.out.println(sb);

        //to calculate string length
        // int length=sb.length();
        // System.out.println(length);

        //string reverse
        for(int i=sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }
       


    }
    
}
