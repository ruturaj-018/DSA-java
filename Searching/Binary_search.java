package Searching;

public class Binary_search {

    static void print(int[] arr){
        System.out.print("Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static int binarysearch(int [] array,int num){

        int mid = start + (end - start)/2
    }

    public static void main(String[] args) {
        int[] arr ={78,93,24,26,45,36,15};
        int target = 56;
        print(arr);
        int num = binarysearch(arr,target);
        System.out.println(num);
    }
}
