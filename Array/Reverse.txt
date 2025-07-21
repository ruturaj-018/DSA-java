package Array;
public class Reverse {
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

        static void reverse(int[] arr){
            int temp  = arr[0],start = 0,end=arr.length-1;
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
            arr[arr.length-1]=temp;
            print(arr);
        }

        public static void main(String[] args) {
            //     int[] array = {87,65,43,87,93,23,8,12};
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            print(array);
            reverse(array);
        }
}


