package Lesson_18_ARRAY.Home;

public class Sortirovka {
    public static int[] sortirovka(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -6, 76, 87};
        sortirovka(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
