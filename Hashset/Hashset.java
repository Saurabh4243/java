package Hashset;
import java.util.*;


public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //adding elements
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        System.out.println(set);

        //searching elemnts(contain)
        if(set.contains(1)){
            System.out.println("set contains 1");
        }else{
            System.out.println("does not contains");
        }

        //delete/remove
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("does not contains");

        }
        System.out.println(set);

        //size
        System.out.println("size of hashset is "+set.size());

        //iteraor
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        
    }
    

    
}
