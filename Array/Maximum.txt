package Array;
public class Maximum {
        static void print(int[] arr){
            System.out.print("Array : ");
            for(int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        static int max(int[] arr){
            int max = 0;
            for(int num : arr){
                if(num > max)  max = num;
            }
            return max;
        }

        public static void main(String[] args) {
            int[] array = {87,65,43,87,93,23,8,12};
            //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            print(array);
            int num = max(array);
            System.out.println("Maximum Nummber : "+num);
        }
}
