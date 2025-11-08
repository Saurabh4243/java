import java.util.*;

public class LinearSearch {

    // Function to find the key using linear search
    public static int findKey(int[] num, int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {34, 12, 11, 2, 23, 45};

        System.out.print("Enter key to find: "); // Ask first
        int key = sc.nextInt(); // Then take input

        int index = findKey(num, key);

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index);
        }

        sc.close(); // Always good to close scanner
    }
}