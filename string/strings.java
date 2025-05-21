
package string;
import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName=sc.nextLine();
        System.out.println("Enter last name:");
        String lastName=sc.nextLine();
        String fullName=firstName + lastName;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));sa

        }


    }
    
}


