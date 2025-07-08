package Array;
import java.util.*;
public class OneDArray {
    static int[] arr = new int[10]; 
    static int start = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeArray(sc);
        PrintArray();
        insertElement(sc);
        // searchElement(sc);
        // deleteElement(sc);
        // updateElement(sc);

        sc.close();
    }
    static void initializeArray(Scanner sc) {
        System.out.print("Enter number of elements 1 - 10: ");
        start = sc.nextInt();
        System.out.println("Enter " + start + " elements:");
        for (int i = 0; i < start; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array initialized.");
    }

    // Function to display array
    static void PrintArray() {
        if (start == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array Elements: ");
        for (int i = 0; i < start; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to insert an element at the end
    static void insertElement(Scanner sc) {
        if (start >= arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        arr[start] = element;
        start++;
        System.out.println("Element inserted.");
        PrintArray();
    }

    // Function to search for an element
    static void searchElement(Scanner sc) {
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        for (int i = 0; i < start; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Function to delete an element by index
    static void deleteElement(Scanner sc) {
        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();
        if (index < 0 || index >= start) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < start - 1; i++) {
            arr[i] = arr[i + 1];
        }
        start--;
        System.out.println("Element deleted.");
        PrintArray();
    }

    // Function to update an element by index
    static void updateElement(Scanner sc) {
        System.out.print("Enter index to update: ");
        int index = sc.nextInt();
        if (index < 0 || index >= start) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter new value: ");
        int newVal = sc.nextInt();
        arr[index] = newVal;
        System.out.println("Element updated.");
        PrintArray();
    }
}

