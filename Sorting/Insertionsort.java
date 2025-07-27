package Sorting;
public class Insertionsort {
    //Print method

    static void print(int[] arr){
        System.out.print("Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
   //Swap method
    static void swap(int[] arr,int start,int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
   //insertionsort method
    static void Insertionsort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
          for(int j = i + 1; j > 0; j--  ){
              if(arr[j] < arr[j-1]){
                  swap(arr,j,j-1);
              }else{
                  break;
              }
          }
        }
        System.out.print("Insertion sort ");
        print(arr);
    }
    //Main Method
    public static void main(String[] args) {
        int[] array = {65,43,87,93,23,8,12};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(array);
        Insertionsort(array);
    }
}
