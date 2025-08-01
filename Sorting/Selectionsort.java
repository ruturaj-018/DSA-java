package Sorting;

public class Selectionsort {

    static void print(int[] arr){
        System.out.print("Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int start,int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int max(int[] arr,int start, int end){
        int max = start;
        for(int i = start; i <= end;i++){
            if(arr[i] > arr[max] )  max = i;
        }
        return max;
    }
    static void selectionsort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            int last = arr.length - i-1;
            int larg = max(arr,0,last);
            swap(arr,larg,last);
        }
        System.out.print("Selection sort ");
       print(arr);
    }


    public static void main(String[] args) {
        int[] array = {65,43,87,93,23,8,12};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(array);
        selectionsort(array);
    }
}
T