package Lesson_18_ARRAY.Home;

import java.util.Arrays;

public class Sort {


    public static void sort2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array2 = {1, 4, 7, 9, 5, 3, 56};
        sort2(array2);
    }
}
