package string;
import java.util.*;

public class email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email:");
        String email=sc.nextLine();
        String userName="";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                userName+=email.charAt(i);
            }
        }System.out.println(userName);
        
    }
    
}
