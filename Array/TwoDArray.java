package Array;
import java.util.*;
public class TwoDArray {
    static int[][] matrix;
    static int rows, cols;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeMatrix(sc);
        PrintMatrix();
        // searchElement(sc);
        // updateElement(sc); // Delete the element goes the same set 0
        sc.close();
    }

    // 1. Initialize 2D array
    static void initializeMatrix(Scanner sc) {
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix initialized successfully.");
        PrintMatrix();
    }

    // 2. Print matrix
    static void PrintMatrix() {
        if (matrix == null) {
            System.out.println("Matrix not initialized.");
            return;
        }

        System.out.println("Matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 3. Search for an element
    static void searchElement(Scanner sc) {
        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == num) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }

    //  4. Update an element
    static void updateElement(Scanner sc) {
        System.out.print("Enter row index to update: ");
        int r = sc.nextInt();
        System.out.print("Enter column index to update: ");
        int c = sc.nextInt();

        if (r >= 0 && r < rows && c >= 0 && c < cols) {
            System.out.print("Enter new value: ");
            int newVal = sc.nextInt();
            matrix[r][c] = newVal;
            System.out.println("Element updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}

