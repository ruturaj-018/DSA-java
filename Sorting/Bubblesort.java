package Sorting;
public class Bubblesort {
        //Print Method
        static void print(int[] arr){
            System.out.print("Array : ");
            for(int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        //swap Method
        static void swap(int[] arr,int start,int end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //Sorting Method
        static void bubblesort(int[] arr){
            for(int i = 0;i < arr.length;i++){
                for(int j = 0;j < arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        swap(arr,j,j+1);
                    }
                }
            }
            System.out.print("Sorted ");
            print(arr);
        }

        public static void main(String[] args) {
            int[] array = {87,65,43,87,93,23,8,12};
            //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            print(array);
            bubblesort(array);
        }
}
