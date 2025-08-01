package Sorting;
public class Quicksort {
    static int sort(int[] arr,int start, int end){
        int pivot = arr[end];
        int i = start -1;
        for(int j = start; j < end;j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,end);
        return i;
    }

    static void quicksort(int[] arr,int start,int end){
        if(start<end){
            int index = sort(arr,start,end);
            quicksort(arr,start,index-1);
            quicksort(arr,index+1,end);
        }
    }
//Swap Method
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//Print Method
    static void print(int[] arr){
        System.out.print("Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8,4,5,9,2,4,6};
        print(arr);
        quicksort(arr,0,arr.length-1);
        System.out.print("QuickSort ");
        print(arr);
    }
}
