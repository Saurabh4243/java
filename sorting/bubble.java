package sorting;
import java.util.*;

public class bubble {
    public static void displayArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Size of array
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        
        // Array elements
        System.out.println("Enter array elements:");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        // Bubble Sort
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        displayArray(array);
    }
}