package Array;

public class Reverse {

    // Method to print elements of the array
    static void print(int[] arr) {
        System.out.print("Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to swap two elements in the array using their indices
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // Method to reverse the array
    static void reverse(int[] arr) {
        int temp = arr[0];
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end until the middle of the array is reached
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        arr[arr.length - 1] = temp;

        // Print the reversed array
        print(arr);
    }

    // Main method — entry point of the program
    public static void main(String[] args) {
        // You can test with different arrays
        // int[] array = {87, 65, 43, 87, 93, 23, 8, 12};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Print original array
        print(array);

        // Reverse the array and print it
        reverse(array);
    }
}


