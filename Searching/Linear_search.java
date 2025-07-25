package Searching;
public class Linear_search {
    
//Print Method
    static void print(int[] arr){
        System.out.print("Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
// Find the Element in the given Array.
    static void findelement(int [] array,int num){
        int x = num;
        for(int i = 0 ; i < array.length; i++){
            if(x==array[i]) {
                System.out.println("Match found " + array[i] + " at index " + i);
                break;
            }
        }
    }
// Main
    public static void main(String[] args) {
        int[] arr = {5,67,89,34,56,23,98,67,97};
        int target = 56;
        print(arr);
        findelement(arr,target);
    }
}

