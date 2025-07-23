package Array;
public class Minimum {

    static void print(int[] arr){
        System.out.print("Array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {87,65,43,87,93,23,8,12};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(array);
        int num = min(array);
        System.out.println("Mininum Nummber : "+num);
    }
}

