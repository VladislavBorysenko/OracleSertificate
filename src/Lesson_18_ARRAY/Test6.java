package Lesson_18_ARRAY;

import java.util.Arrays;

//минимальный и максимальный элемент массива
public class Test6 {
    public static void minMax(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
                System.out.println(min);
            }

        }
        System.out.println(min+" "+max);

        Arrays.sort(arr);
        System.out.println(arr[0]+" min");
        System.out.println(arr[arr.length-1]+" max");
            }




    public static void main(String[] args) {
        int []array1={7,4,1,9,5,3};
        minMax(array1);

    }
}
